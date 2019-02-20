package br.hfluz.tse.data.mining.client;

import br.hfluz.tse.data.mining.model.Estado;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import java.util.List;

public class EstadoClient {

    public List<Estado> buscarEstados(){
        return ClientBuilder.newClient().target("http://inter01.tse.jus.br/sgip3-consulta/api/v1/ufs")
                .request().get(new GenericType<List<Estado>>() {});
    }
}
