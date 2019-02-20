package br.hfluz.tse.data.mining.model;

public class SqControleAnotacao {
    private float sqControleAnotacao;
    SqUsuario SqUsuarioObject;
    private float stAnotacao;
    private float dtCriacaoRegistro;
    private String tpRegistro;
    private float dtAlteracaoRegistro;
    private String tpAnotacao;
    private String dsJustificativa = null;
    private String nrTituloEleitoral;
    private String dtAlteracaoRegistroFormatada;
    private String dtAlteracaoRegistroFormatadaSemHora;
    private String stAnotacaoFormatada;
    private String stAnotacaoFormatadaModInterno;


    // Getter Methods

    public float getSqControleAnotacao() {
        return sqControleAnotacao;
    }

    public SqUsuario getSqUsuario() {
        return SqUsuarioObject;
    }

    public float getStAnotacao() {
        return stAnotacao;
    }

    public float getDtCriacaoRegistro() {
        return dtCriacaoRegistro;
    }

    public String getTpRegistro() {
        return tpRegistro;
    }

    public float getDtAlteracaoRegistro() {
        return dtAlteracaoRegistro;
    }

    public String getTpAnotacao() {
        return tpAnotacao;
    }

    public String getDsJustificativa() {
        return dsJustificativa;
    }

    public String getNrTituloEleitoral() {
        return nrTituloEleitoral;
    }

    public String getDtAlteracaoRegistroFormatada() {
        return dtAlteracaoRegistroFormatada;
    }

    public String getDtAlteracaoRegistroFormatadaSemHora() {
        return dtAlteracaoRegistroFormatadaSemHora;
    }

    public String getStAnotacaoFormatada() {
        return stAnotacaoFormatada;
    }

    public String getStAnotacaoFormatadaModInterno() {
        return stAnotacaoFormatadaModInterno;
    }

    // Setter Methods

    public void setSqControleAnotacao(float sqControleAnotacao) {
        this.sqControleAnotacao = sqControleAnotacao;
    }

    public void setSqUsuario(SqUsuario sqUsuarioObject) {
        this.SqUsuarioObject = sqUsuarioObject;
    }

    public void setStAnotacao(float stAnotacao) {
        this.stAnotacao = stAnotacao;
    }

    public void setDtCriacaoRegistro(float dtCriacaoRegistro) {
        this.dtCriacaoRegistro = dtCriacaoRegistro;
    }

    public void setTpRegistro(String tpRegistro) {
        this.tpRegistro = tpRegistro;
    }

    public void setDtAlteracaoRegistro(float dtAlteracaoRegistro) {
        this.dtAlteracaoRegistro = dtAlteracaoRegistro;
    }

    public void setTpAnotacao(String tpAnotacao) {
        this.tpAnotacao = tpAnotacao;
    }

    public void setDsJustificativa(String dsJustificativa) {
        this.dsJustificativa = dsJustificativa;
    }

    public void setNrTituloEleitoral(String nrTituloEleitoral) {
        this.nrTituloEleitoral = nrTituloEleitoral;
    }

    public void setDtAlteracaoRegistroFormatada(String dtAlteracaoRegistroFormatada) {
        this.dtAlteracaoRegistroFormatada = dtAlteracaoRegistroFormatada;
    }

    public void setDtAlteracaoRegistroFormatadaSemHora(String dtAlteracaoRegistroFormatadaSemHora) {
        this.dtAlteracaoRegistroFormatadaSemHora = dtAlteracaoRegistroFormatadaSemHora;
    }

    public void setStAnotacaoFormatada(String stAnotacaoFormatada) {
        this.stAnotacaoFormatada = stAnotacaoFormatada;
    }

    public void setStAnotacaoFormatadaModInterno(String stAnotacaoFormatadaModInterno) {
        this.stAnotacaoFormatadaModInterno = stAnotacaoFormatadaModInterno;
    }
}