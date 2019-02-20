package br.hfluz.tse.data.mining.model;

public class SqPartido {
    private float sqPartido;
    private String sgPartido;
    private String nmPartido;
    private float nrLegenda;
    private String nmPresidente = null;
    private String nmCargoEletivo = null;
    private String nmEstado = null;
    private String dtFundacao = null;
    private String nrCnpj;
    private String dtReuniaoFundadores = null;
    private String nmSite = null;
    private float dtRegistro;
    private String txObsRegistro = null;
    private String txHistorico;
    private float dtFusao;
    private String dtIncorporacao = null;
    private String dtInativacao = null;
    private String cdMotivoInativacao = null;
    private String txObsInativacao;
    private String cdTreOrigem = null;
    private float situacaoPartido;
    private float tipoRegistroPartido;
    private String nrResolucao = null;
    private String txObsFundador;
    private String txObsDelegado;
    private String stHabInsercaoOrgao = null;
    private String nrProtocoloRegistro = null;
    private String nrProtocoloFusao = null;
    private String nrProtocoloInativacao = null;
    private String nrProtocoloIncorporacao = null;
    private String sqPartidoFundido = null;
    private String sqPartidoIncorporacao = null;
    Endereco EnderecoObject;
    private String nmPartidoFormatado;
    private String descricaoSituacaoPartido;
    private String nrProtocoloRegistroNormalizado;
    private String nrProtocoloRegistroFormatado;


    // Getter Methods

    public float getSqPartido() {
        return sqPartido;
    }

    public String getSgPartido() {
        return sgPartido;
    }

    public String getNmPartido() {
        return nmPartido;
    }

    public float getNrLegenda() {
        return nrLegenda;
    }

    public String getNmPresidente() {
        return nmPresidente;
    }

    public String getNmCargoEletivo() {
        return nmCargoEletivo;
    }

    public String getNmEstado() {
        return nmEstado;
    }

    public String getDtFundacao() {
        return dtFundacao;
    }

    public String getNrCnpj() {
        return nrCnpj;
    }

    public String getDtReuniaoFundadores() {
        return dtReuniaoFundadores;
    }

    public String getNmSite() {
        return nmSite;
    }

    public float getDtRegistro() {
        return dtRegistro;
    }

    public String getTxObsRegistro() {
        return txObsRegistro;
    }

    public String getTxHistorico() {
        return txHistorico;
    }

    public float getDtFusao() {
        return dtFusao;
    }

    public String getDtIncorporacao() {
        return dtIncorporacao;
    }

    public String getDtInativacao() {
        return dtInativacao;
    }

    public String getCdMotivoInativacao() {
        return cdMotivoInativacao;
    }

    public String getTxObsInativacao() {
        return txObsInativacao;
    }

    public String getCdTreOrigem() {
        return cdTreOrigem;
    }

    public float getSituacaoPartido() {
        return situacaoPartido;
    }

    public float getTipoRegistroPartido() {
        return tipoRegistroPartido;
    }

    public String getNrResolucao() {
        return nrResolucao;
    }

    public String getTxObsFundador() {
        return txObsFundador;
    }

    public String getTxObsDelegado() {
        return txObsDelegado;
    }

    public String getStHabInsercaoOrgao() {
        return stHabInsercaoOrgao;
    }

    public String getNrProtocoloRegistro() {
        return nrProtocoloRegistro;
    }

    public String getNrProtocoloFusao() {
        return nrProtocoloFusao;
    }

    public String getNrProtocoloInativacao() {
        return nrProtocoloInativacao;
    }

    public String getNrProtocoloIncorporacao() {
        return nrProtocoloIncorporacao;
    }

    public String getSqPartidoFundido() {
        return sqPartidoFundido;
    }

    public String getSqPartidoIncorporacao() {
        return sqPartidoIncorporacao;
    }

    public Endereco getEndereco() {
        return EnderecoObject;
    }

    public String getNmPartidoFormatado() {
        return nmPartidoFormatado;
    }

    public String getDescricaoSituacaoPartido() {
        return descricaoSituacaoPartido;
    }

    public String getNrProtocoloRegistroNormalizado() {
        return nrProtocoloRegistroNormalizado;
    }

    public String getNrProtocoloRegistroFormatado() {
        return nrProtocoloRegistroFormatado;
    }

    // Setter Methods

    public void setSqPartido(float sqPartido) {
        this.sqPartido = sqPartido;
    }

    public void setSgPartido(String sgPartido) {
        this.sgPartido = sgPartido;
    }

    public void setNmPartido(String nmPartido) {
        this.nmPartido = nmPartido;
    }

    public void setNrLegenda(float nrLegenda) {
        this.nrLegenda = nrLegenda;
    }

    public void setNmPresidente(String nmPresidente) {
        this.nmPresidente = nmPresidente;
    }

    public void setNmCargoEletivo(String nmCargoEletivo) {
        this.nmCargoEletivo = nmCargoEletivo;
    }

    public void setNmEstado(String nmEstado) {
        this.nmEstado = nmEstado;
    }

    public void setDtFundacao(String dtFundacao) {
        this.dtFundacao = dtFundacao;
    }

    public void setNrCnpj(String nrCnpj) {
        this.nrCnpj = nrCnpj;
    }

    public void setDtReuniaoFundadores(String dtReuniaoFundadores) {
        this.dtReuniaoFundadores = dtReuniaoFundadores;
    }

    public void setNmSite(String nmSite) {
        this.nmSite = nmSite;
    }

    public void setDtRegistro(float dtRegistro) {
        this.dtRegistro = dtRegistro;
    }

    public void setTxObsRegistro(String txObsRegistro) {
        this.txObsRegistro = txObsRegistro;
    }

    public void setTxHistorico(String txHistorico) {
        this.txHistorico = txHistorico;
    }

    public void setDtFusao(float dtFusao) {
        this.dtFusao = dtFusao;
    }

    public void setDtIncorporacao(String dtIncorporacao) {
        this.dtIncorporacao = dtIncorporacao;
    }

    public void setDtInativacao(String dtInativacao) {
        this.dtInativacao = dtInativacao;
    }

    public void setCdMotivoInativacao(String cdMotivoInativacao) {
        this.cdMotivoInativacao = cdMotivoInativacao;
    }

    public void setTxObsInativacao(String txObsInativacao) {
        this.txObsInativacao = txObsInativacao;
    }

    public void setCdTreOrigem(String cdTreOrigem) {
        this.cdTreOrigem = cdTreOrigem;
    }

    public void setSituacaoPartido(float situacaoPartido) {
        this.situacaoPartido = situacaoPartido;
    }

    public void setTipoRegistroPartido(float tipoRegistroPartido) {
        this.tipoRegistroPartido = tipoRegistroPartido;
    }

    public void setNrResolucao(String nrResolucao) {
        this.nrResolucao = nrResolucao;
    }

    public void setTxObsFundador(String txObsFundador) {
        this.txObsFundador = txObsFundador;
    }

    public void setTxObsDelegado(String txObsDelegado) {
        this.txObsDelegado = txObsDelegado;
    }

    public void setStHabInsercaoOrgao(String stHabInsercaoOrgao) {
        this.stHabInsercaoOrgao = stHabInsercaoOrgao;
    }

    public void setNrProtocoloRegistro(String nrProtocoloRegistro) {
        this.nrProtocoloRegistro = nrProtocoloRegistro;
    }

    public void setNrProtocoloFusao(String nrProtocoloFusao) {
        this.nrProtocoloFusao = nrProtocoloFusao;
    }

    public void setNrProtocoloInativacao(String nrProtocoloInativacao) {
        this.nrProtocoloInativacao = nrProtocoloInativacao;
    }

    public void setNrProtocoloIncorporacao(String nrProtocoloIncorporacao) {
        this.nrProtocoloIncorporacao = nrProtocoloIncorporacao;
    }

    public void setSqPartidoFundido(String sqPartidoFundido) {
        this.sqPartidoFundido = sqPartidoFundido;
    }

    public void setSqPartidoIncorporacao(String sqPartidoIncorporacao) {
        this.sqPartidoIncorporacao = sqPartidoIncorporacao;
    }

    public void setEndereco(Endereco enderecoObject) {
        this.EnderecoObject = enderecoObject;
    }

    public void setNmPartidoFormatado(String nmPartidoFormatado) {
        this.nmPartidoFormatado = nmPartidoFormatado;
    }

    public void setDescricaoSituacaoPartido(String descricaoSituacaoPartido) {
        this.descricaoSituacaoPartido = descricaoSituacaoPartido;
    }

    public void setNrProtocoloRegistroNormalizado(String nrProtocoloRegistroNormalizado) {
        this.nrProtocoloRegistroNormalizado = nrProtocoloRegistroNormalizado;
    }

    public void setNrProtocoloRegistroFormatado(String nrProtocoloRegistroFormatado) {
        this.nrProtocoloRegistroFormatado = nrProtocoloRegistroFormatado;
    }
}