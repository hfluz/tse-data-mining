package br.hfluz.tse.data.mining.model;

/**
 * http://inter01.tse.jus.br/sgip3-consulta/api/v1/ufs/AL/municipios
 */
public class Municipio {
    private Integer sigla;
    private String nome;
    private String siglaUnidadeSuperior;
    private String capital;

    public Integer getSigla() {
        return sigla;
    }

    public void setSigla(Integer sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSiglaUnidadeSuperior() {
        return siglaUnidadeSuperior;
    }

    public void setSiglaUnidadeSuperior(String siglaUnidadeSuperior) {
        this.siglaUnidadeSuperior = siglaUnidadeSuperior;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
