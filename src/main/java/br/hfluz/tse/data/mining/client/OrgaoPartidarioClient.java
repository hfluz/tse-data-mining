package br.hfluz.tse.data.mining.client;

import br.hfluz.tse.data.mining.model.DetalheOrgaoPartidario;
import br.hfluz.tse.data.mining.model.Municipio;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import java.util.List;
// começou 19:56
public class OrgaoPartidarioClient {
    public List<DetalheOrgaoPartidario> buscarOrgaoPartidarioEstadual(String siglaEstado){
        return ClientBuilder.newClient().target("http://inter01.tse.jus.br/sgip3-consulta/api/v1/orgaoPartidario/consulta?nrZona=0&sgUe={siglaEstado}&sqPartido=0&tpAbrangencia=82")
                .resolveTemplate("siglaEstado", siglaEstado)
                .request().get(new GenericType<List<DetalheOrgaoPartidario>>() {});
    }

    public List<DetalheOrgaoPartidario> buscarOrgaoPartidarioMunicipal(String siglaEstado, Integer siglaMunicipio){
        return ClientBuilder.newClient().target("http://inter01.tse.jus.br/sgip3-consulta/api/v1/orgaoPartidario/consulta?nrZona=0&sgUe={siglaMunicipio}&sgUeSuperior={siglaEstado}&sqPartido=0&tpAbrangencia=83")
                .resolveTemplate("siglaEstado", siglaEstado)
                .resolveTemplate("siglaMunicipio", siglaMunicipio)
                .request().get(new GenericType<List<DetalheOrgaoPartidario>>() {});
    }

    public DetalheOrgaoPartidario buscarDetalheOrgaoPartidario(String idOrgaoPartidario){
        return ClientBuilder.newClient().target("http://inter01.tse.jus.br/sgip3-consulta/api/v1/orgaoPartidario/comAnotacoesEMembros?idOrgaoPartidario={idOrgaoPartidario}")
                .resolveTemplate("idOrgaoPartidario", idOrgaoPartidario)
                .request().get(DetalheOrgaoPartidario.class);
    }
}
