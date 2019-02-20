package br.hfluz.tse.data.mining.util;

import br.hfluz.tse.data.mining.client.OrgaoPartidarioClient;
import br.hfluz.tse.data.mining.model.DetalheOrgaoPartidario;
import br.hfluz.tse.data.mining.model.Municipio;
import br.hfluz.tse.data.mining.model.OrgaoPartidario;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class FileWriter {

    private Path path;
    private OrgaoPartidarioClient orgaoPartidarioClient = new OrgaoPartidarioClient();
    private String abrangencia;
    private String siglaEstado;

    public FileWriter(String abrangencia, String siglaEstado) {
        path = Paths.get(File.listRoots()[0] + File.separator + "home" + File.separator + "hfluz" + File.separator
                + "órgaos partidários" + File.separator
                + abrangencia + "_" + siglaEstado + ".csv");
        this.abrangencia = abrangencia;
        this.siglaEstado = siglaEstado;
        System.out.println(abrangencia + ": " + siglaEstado);
    }

    public void writeOrgaosPartidariosEstaduais(List<DetalheOrgaoPartidario> orgaosPartidarios) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            int counter = 1;
            writer.write("Partido;Presidente;E-mail;Telefone;Celular;Logradouro;Complemento;Bairro;Cidade;UF;UF SUP" + System.getProperty("line.separator"));
            for (DetalheOrgaoPartidario dop : orgaosPartidarios) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + abrangencia + " - " + siglaEstado + ": " + counter + "/" + orgaosPartidarios.size());
                escreverOrgaoPartidarioNoArquivo(writer, dop);
                counter++;
            }
        }
    }

    public void writeOrgaosPartidariosMunicipais(String siglaEstado, List<Municipio> municipios) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            int counter = 1;
            writer.write("Partido;Presidente;E-mail;Telefone;Celular;Logradouro;Complemento;Bairro;Cidade;UF;UF SUP" + System.getProperty("line.separator"));
            for (Municipio municipio : municipios) {
                System.out.println(counter + "/" + municipios.size());
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n" + abrangencia + " - " + siglaEstado + ": " + counter + "/" + municipios.size());
                List<DetalheOrgaoPartidario> orgaosPartidarios = orgaoPartidarioClient.buscarOrgaoPartidarioMunicipal(siglaEstado, municipio.getSigla());
                for (DetalheOrgaoPartidario dop : orgaosPartidarios) {
                    escreverOrgaoPartidarioNoArquivo(writer, dop);
                }
                counter++;
            }
        }
    }

    private void escreverOrgaoPartidarioNoArquivo(BufferedWriter writer, DetalheOrgaoPartidario dop) throws IOException {
        DetalheOrgaoPartidario detalheOrgaoPartidario = orgaoPartidarioClient.buscarDetalheOrgaoPartidario(dop.getSqOrgaoPartidario());
        writer.write(detalheOrgaoPartidario.getOrgaoPartidario().getSqPartido().getSgPartido() + ";" +
                detalheOrgaoPartidario.getMembros().stream().filter(m -> m.getNomeCargo().equals("PRESIDENTE"))
                        .map(m -> m.getNomeMembro()).findAny().orElse("Não encontrado") + ";"
                + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNmEmail() + ";"
                + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNrTelefoneFormatado() + ";"
                + Optional.ofNullable(detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNrCelularFormatado()).orElse("Não encontrado") + ";"
                + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNmLogradouro() + ";"
                + Optional.ofNullable(detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNmComplementoEndereco()).orElse("") + ";"
                + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNmBairro() + ";"
                + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getSgUe().getCapital() + ";"
                + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getSgUe().getNmUe() + ";"
                + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getSgUe().getSgUeSuperior()
                + System.getProperty("line.separator"));
    }
}
