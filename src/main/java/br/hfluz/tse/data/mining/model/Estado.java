package br.hfluz.tse.data.mining.model;

import java.util.Objects;

/**
 * http://inter01.tse.jus.br/sgip3-consulta/api/v1/ufs
 *
 * 20:04
 */
public class Estado {
    private String sigla;
    private String nome;
    private String siglaUnidadeSuperior;
    private String capital;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(sigla, estado.sigla) &&
                Objects.equals(nome, estado.nome) &&
                Objects.equals(siglaUnidadeSuperior, estado.siglaUnidadeSuperior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigla, nome, siglaUnidadeSuperior);
    }
}
