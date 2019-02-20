package br.hfluz.tse.data.mining;

import br.hfluz.tse.data.mining.client.EstadoClient;
import br.hfluz.tse.data.mining.client.MunicipioClient;
import br.hfluz.tse.data.mining.client.OrgaoPartidarioClient;
import br.hfluz.tse.data.mining.model.DetalheOrgaoPartidario;
import br.hfluz.tse.data.mining.model.Estado;
import br.hfluz.tse.data.mining.model.Municipio;
import br.hfluz.tse.data.mining.util.FileWriter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        EstadoClient estadoClient = new EstadoClient();
        MunicipioClient municipioClient = new MunicipioClient();
        List<Estado> estados = estadoClient.buscarEstados();
        OrgaoPartidarioClient orgaoPartidarioClient = new OrgaoPartidarioClient();
        for(Estado estado : estados.stream().filter(e -> Arrays.asList("SP").contains(e.getSigla())).collect(Collectors.toList())){
            List<DetalheOrgaoPartidario> orgaoPartidarios = orgaoPartidarioClient.buscarOrgaoPartidarioEstadual(estado.getSigla());
            FileWriter fileWriter = new FileWriter("estadual", estado.getSigla());
            try {
                fileWriter.writeOrgaosPartidariosEstaduais(orgaoPartidarios);
            } catch (IOException e) {
                e.printStackTrace();
            }
            fileWriter = new FileWriter("municipal", estado.getSigla());
            List<Municipio> municipios = municipioClient.buscarMunicipios(estado.getSigla());
            try {
                fileWriter.writeOrgaosPartidariosMunicipais(estado.getSigla(), municipios);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


//
//        MunicipioClient municipioClient = new MunicipioClient();
//        List<Municipio> municipios = municipioClient.buscarMunicipios("AL");
//        municipios.stream().forEach(e -> System.out.println(e.getNome()));


//        List<DetalheOrgaoPartidario> orgaoPartidarios = orgaoPartidarioClient.buscarOrgaoPartidarioEstadual("AC");
//        FileWriter fileWriter = new FileWriter("estadual", "AC");
//        try {
//            fileWriter.writeOrgaosPartidariosEstaduais(orgaoPartidarios);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (DetalheOrgaoPartidario dop : orgaoPartidarios){
//            DetalheOrgaoPartidario detalheOrgaoPartidario = orgaoPartidarioClient.buscarDetalheOrgaoPartidario(dop.getSqOrgaoPartidario());
//            System.out.println(
//                    detalheOrgaoPartidario.getOrgaoPartidario().getSqPartido().getSgPartido() + ";" +
//                            detalheOrgaoPartidario.getMembros().stream().filter(m -> m.getNomeCargo().equals("PRESIDENTE"))
//                                    .map(m -> m.getNomeMembro()).findAny().orElse(null) + ";"
//                            + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNmEmail() + ";"
//                            + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNrTelefoneFormatado()+ ";"
//                            + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNrCelularFormatado()+ ";"
//                            + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNmLogradouro()+ ";"
//                            + Optional.ofNullable(detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNmComplementoEndereco()).orElse("")+ ";"
//                            + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getNmBairro()+ ";"
//                            + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getSgUe().getCapital() + ";"
//                            + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getSgUe().getNmUe()+ ";"
//                            + detalheOrgaoPartidario.getOrgaoPartidario().getSqEndereco().getSgUe().getSgUeSuperior());
//        }
//        orgaoPartidarios.stream().forEach(oe -> System.out.println(oe.getSqOrgaoPartidario()));

//        DetalheOrgaoPartidario orgaoPartidarioEstadual = orgaoPartidarioClient.buscarDetalheOrgaoPartidario(265182);
//
//        System.out.println(
//                orgaoPartidarioEstadual.getOrgaoPartidario().getSqPartido().getSgPartido() + ";" +
//                orgaoPartidarioEstadual.getMembros().stream().filter(m -> m.getNomeCargo().equals("PRESIDENTE"))
//                .map(m -> m.getNomeMembro()).findAny().orElse(null) + ";"
//                + orgaoPartidarioEstadual.getOrgaoPartidario().getSqEndereco().getNmEmail() + ";"
//                + orgaoPartidarioEstadual.getOrgaoPartidario().getSqEndereco().getNrTelefoneFormatado()+ ";"
//                + orgaoPartidarioEstadual.getOrgaoPartidario().getSqEndereco().getNrCelularFormatado()+ ";"
//                + orgaoPartidarioEstadual.getOrgaoPartidario().getSqEndereco().getNmLogradouro()+ ";"
//                + Optional.ofNullable(orgaoPartidarioEstadual.getOrgaoPartidario().getSqEndereco().getNmComplementoEndereco()).orElse("")+ ";"
//                + orgaoPartidarioEstadual.getOrgaoPartidario().getSqEndereco().getNmBairro()+ ";"
//                + orgaoPartidarioEstadual.getOrgaoPartidario().getSqEndereco().getSgUe().getNmUe()+ ";"
//                + orgaoPartidarioEstadual.getOrgaoPartidario().getSqEndereco().getSgUe().getSgUeSuperior());


    }
}
