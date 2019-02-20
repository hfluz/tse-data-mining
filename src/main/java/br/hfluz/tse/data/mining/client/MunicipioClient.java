package br.hfluz.tse.data.mining.client;

import br.hfluz.tse.data.mining.model.Estado;
import br.hfluz.tse.data.mining.model.Municipio;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import java.util.List;

public class MunicipioClient {
    public List<Municipio> buscarMunicipios(String siglaEstado){
        return ClientBuilder.newClient().target("http://inter01.tse.jus.br/sgip3-consulta/api/v1/ufs/{siglaEstado}/municipios")
                .resolveTemplate("siglaEstado", siglaEstado)
                .request().get(new GenericType<List<Municipio>>() {});
    }
}
