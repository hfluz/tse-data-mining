package br.hfluz.tse.data.mining.model;

public class SqRecibo {
    private float sqRecibo;
    private float tpRecibo;
    private String nmChave;
    private String nrTituloEleitoralUsuarioValidacao;
    private String nrTituloEleitoralUsuarioRecebimento;
    private float dtGeracao;
    private String dtMigracao = null;
    private float dtValidacao;
    private String nrProtocolo = null;
    private String dtDespacho = null;
    private String nmMensagem = null;
    private float dtRecebimento;
    private String dtProtocolo = null;
    SqUsuario SqUsuarioObject;
    SqControleAnotacao SqControleAnotacaoObject;
    private String anotacaoOrgaoPartidario = null;
    private String anotacaoOcorrenciaDelegado = null;
    private boolean reciboCheckado;
    private boolean unCheckRecibo;
    private String dtGeracaoFormatada;
    private String dtMigracaoFormatada = null;
    private String dtValidacaoFormatada;
    private String dtDespachoFormatada = null;
    private String dtRecebimentoFormatada;
    private String dtProtocoloFormatada = null;
    private String nmChaveFormatada;


    // Getter Methods

    public float getSqRecibo() {
        return sqRecibo;
    }

    public float getTpRecibo() {
        return tpRecibo;
    }

    public String getNmChave() {
        return nmChave;
    }

    public String getNrTituloEleitoralUsuarioValidacao() {
        return nrTituloEleitoralUsuarioValidacao;
    }

    public String getNrTituloEleitoralUsuarioRecebimento() {
        return nrTituloEleitoralUsuarioRecebimento;
    }

    public float getDtGeracao() {
        return dtGeracao;
    }

    public String getDtMigracao() {
        return dtMigracao;
    }

    public float getDtValidacao() {
        return dtValidacao;
    }

    public String getNrProtocolo() {
        return nrProtocolo;
    }

    public String getDtDespacho() {
        return dtDespacho;
    }

    public String getNmMensagem() {
        return nmMensagem;
    }

    public float getDtRecebimento() {
        return dtRecebimento;
    }

    public String getDtProtocolo() {
        return dtProtocolo;
    }

    public SqUsuario getSqUsuario() {
        return SqUsuarioObject;
    }

    public SqControleAnotacao getSqControleAnotacao() {
        return SqControleAnotacaoObject;
    }

    public String getAnotacaoOrgaoPartidario() {
        return anotacaoOrgaoPartidario;
    }

    public String getAnotacaoOcorrenciaDelegado() {
        return anotacaoOcorrenciaDelegado;
    }

    public boolean getReciboCheckado() {
        return reciboCheckado;
    }

    public boolean getUnCheckRecibo() {
        return unCheckRecibo;
    }

    public String getDtGeracaoFormatada() {
        return dtGeracaoFormatada;
    }

    public String getDtMigracaoFormatada() {
        return dtMigracaoFormatada;
    }

    public String getDtValidacaoFormatada() {
        return dtValidacaoFormatada;
    }

    public String getDtDespachoFormatada() {
        return dtDespachoFormatada;
    }

    public String getDtRecebimentoFormatada() {
        return dtRecebimentoFormatada;
    }

    public String getDtProtocoloFormatada() {
        return dtProtocoloFormatada;
    }

    public String getNmChaveFormatada() {
        return nmChaveFormatada;
    }

    // Setter Methods

    public void setSqRecibo(float sqRecibo) {
        this.sqRecibo = sqRecibo;
    }

    public void setTpRecibo(float tpRecibo) {
        this.tpRecibo = tpRecibo;
    }

    public void setNmChave(String nmChave) {
        this.nmChave = nmChave;
    }

    public void setNrTituloEleitoralUsuarioValidacao(String nrTituloEleitoralUsuarioValidacao) {
        this.nrTituloEleitoralUsuarioValidacao = nrTituloEleitoralUsuarioValidacao;
    }

    public void setNrTituloEleitoralUsuarioRecebimento(String nrTituloEleitoralUsuarioRecebimento) {
        this.nrTituloEleitoralUsuarioRecebimento = nrTituloEleitoralUsuarioRecebimento;
    }

    public void setDtGeracao(float dtGeracao) {
        this.dtGeracao = dtGeracao;
    }

    public void setDtMigracao(String dtMigracao) {
        this.dtMigracao = dtMigracao;
    }

    public void setDtValidacao(float dtValidacao) {
        this.dtValidacao = dtValidacao;
    }

    public void setNrProtocolo(String nrProtocolo) {
        this.nrProtocolo = nrProtocolo;
    }

    public void setDtDespacho(String dtDespacho) {
        this.dtDespacho = dtDespacho;
    }

    public void setNmMensagem(String nmMensagem) {
        this.nmMensagem = nmMensagem;
    }

    public void setDtRecebimento(float dtRecebimento) {
        this.dtRecebimento = dtRecebimento;
    }

    public void setDtProtocolo(String dtProtocolo) {
        this.dtProtocolo = dtProtocolo;
    }

    public void setSqUsuario(SqUsuario sqUsuarioObject) {
        this.SqUsuarioObject = sqUsuarioObject;
    }

    public void setSqControleAnotacao(SqControleAnotacao sqControleAnotacaoObject) {
        this.SqControleAnotacaoObject = sqControleAnotacaoObject;
    }

    public void setAnotacaoOrgaoPartidario(String anotacaoOrgaoPartidario) {
        this.anotacaoOrgaoPartidario = anotacaoOrgaoPartidario;
    }

    public void setAnotacaoOcorrenciaDelegado(String anotacaoOcorrenciaDelegado) {
        this.anotacaoOcorrenciaDelegado = anotacaoOcorrenciaDelegado;
    }

    public void setReciboCheckado(boolean reciboCheckado) {
        this.reciboCheckado = reciboCheckado;
    }

    public void setUnCheckRecibo(boolean unCheckRecibo) {
        this.unCheckRecibo = unCheckRecibo;
    }

    public void setDtGeracaoFormatada(String dtGeracaoFormatada) {
        this.dtGeracaoFormatada = dtGeracaoFormatada;
    }

    public void setDtMigracaoFormatada(String dtMigracaoFormatada) {
        this.dtMigracaoFormatada = dtMigracaoFormatada;
    }

    public void setDtValidacaoFormatada(String dtValidacaoFormatada) {
        this.dtValidacaoFormatada = dtValidacaoFormatada;
    }

    public void setDtDespachoFormatada(String dtDespachoFormatada) {
        this.dtDespachoFormatada = dtDespachoFormatada;
    }

    public void setDtRecebimentoFormatada(String dtRecebimentoFormatada) {
        this.dtRecebimentoFormatada = dtRecebimentoFormatada;
    }

    public void setDtProtocoloFormatada(String dtProtocoloFormatada) {
        this.dtProtocoloFormatada = dtProtocoloFormatada;
    }

    public void setNmChaveFormatada(String nmChaveFormatada) {
        this.nmChaveFormatada = nmChaveFormatada;
    }
}