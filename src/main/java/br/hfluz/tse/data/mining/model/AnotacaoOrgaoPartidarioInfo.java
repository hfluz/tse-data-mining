package br.hfluz.tse.data.mining.model;

public class AnotacaoOrgaoPartidarioInfo {
    private float nrProtocolo;
    private String tpAnotacao;
    private String dtProtocolo = null;


    // Getter Methods

    public float getNrProtocolo() {
        return nrProtocolo;
    }

    public String getTpAnotacao() {
        return tpAnotacao;
    }

    public String getDtProtocolo() {
        return dtProtocolo;
    }

    // Setter Methods

    public void setNrProtocolo(float nrProtocolo) {
        this.nrProtocolo = nrProtocolo;
    }

    public void setTpAnotacao(String tpAnotacao) {
        this.tpAnotacao = tpAnotacao;
    }

    public void setDtProtocolo(String dtProtocolo) {
        this.dtProtocolo = dtProtocolo;
    }
}
