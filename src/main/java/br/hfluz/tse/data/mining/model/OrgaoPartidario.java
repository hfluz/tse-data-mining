package br.hfluz.tse.data.mining.model;

/**
 * http://inter01.tse.jus.br/sgip3-consulta/api/v1/orgaoPartidario/consulta?nrZona=0&sgUe=AC&sqPartido=0&tpAbrangencia=82
 * http://inter01.tse.jus.br/sgip3-consulta/api/v1/orgaoPartidario/consulta?nrZona=0&sgUe=&sgUeSuperior=AL&sqPartido=0&tpAbrangencia=83
 */
public class OrgaoPartidario {
    private float sqOrgaoPartidario;
    SqControleAnotacao SqControleAnotacaoObject;
    private String dtConstituicao = null;
    private float dtDecisaoDespacho;
    private float stOrgaoPartidario;
    private float tpOrgaoPartidario;
    private String nmSite = null;
    private String dsJustificativa = null;
    private String dsJustificativaAntecipacaoVigencia = null;
    private String dsJustificativaDataInicioVigenciaRetroativa = null;
    private String dsJustificativaDataDeliberacaoRetroativa = null;
    private String txObsRegistro = null;
    private String txObsInativacao = null;
    private String txObsDadosLocal = null;
    private String txObsMembro = null;
    private String txInfoComplementar = null;
    private String nrZona = null;
    private String dtDeliberacaoCancelamento = null;
    private String dtDecisaoCancelamento = null;
    private String nrCnpj;
    private float dtConvencao;
    private float nrProtocoloRegistro;
    private String nrProtocoloCancelamento = null;
    private float dtInicioVigencia;
    private float dtFimVigencia;
    private float tpAbrangencia;
    SqPartido SqPartidoObject;
    Endereco SqEnderecoObject;
    SqRecibo SqReciboObject;
    private String nrProtocolo = null;
    private String dtDeliberacaoInativacao = null;
    private String dtDecisaoJudicial = null;
    private String alertas = null;
    private String statusVigente = null;
    private float id;
    private String dtDecisaoDespachoFormatada;
    private boolean vigente;
    private String tpOrgaoPartidarioFormatada;
    private String dtInicioVigenciaFormatada;
    private String dtFimVigenciaFormatada;
    private String tpAbrangenciaFormatado;
    private String stOrgaoPartidarioFormatada;
    private String vigenteFormatado;
    private String stTpAbrangencia;
    private String dtConstituicaoFormatada = null;
    private String dtDeliberacaoCancelamentoFormatada = null;
    private String dtDecisaoCancelamentoFormatada = null;
    private String nrCnpjFormatado;
    private String dtConvencaoFormatada;


    // Getter Methods

    public float getSqOrgaoPartidario() {
        return sqOrgaoPartidario;
    }

    public SqControleAnotacao getSqControleAnotacao() {
        return SqControleAnotacaoObject;
    }

    public String getDtConstituicao() {
        return dtConstituicao;
    }

    public float getDtDecisaoDespacho() {
        return dtDecisaoDespacho;
    }

    public float getStOrgaoPartidario() {
        return stOrgaoPartidario;
    }

    public float getTpOrgaoPartidario() {
        return tpOrgaoPartidario;
    }

    public String getNmSite() {
        return nmSite;
    }

    public String getDsJustificativa() {
        return dsJustificativa;
    }

    public String getDsJustificativaAntecipacaoVigencia() {
        return dsJustificativaAntecipacaoVigencia;
    }

    public String getDsJustificativaDataInicioVigenciaRetroativa() {
        return dsJustificativaDataInicioVigenciaRetroativa;
    }

    public String getDsJustificativaDataDeliberacaoRetroativa() {
        return dsJustificativaDataDeliberacaoRetroativa;
    }

    public String getTxObsRegistro() {
        return txObsRegistro;
    }

    public String getTxObsInativacao() {
        return txObsInativacao;
    }

    public String getTxObsDadosLocal() {
        return txObsDadosLocal;
    }

    public String getTxObsMembro() {
        return txObsMembro;
    }

    public String getTxInfoComplementar() {
        return txInfoComplementar;
    }

    public String getNrZona() {
        return nrZona;
    }

    public String getDtDeliberacaoCancelamento() {
        return dtDeliberacaoCancelamento;
    }

    public String getDtDecisaoCancelamento() {
        return dtDecisaoCancelamento;
    }

    public String getNrCnpj() {
        return nrCnpj;
    }

    public float getDtConvencao() {
        return dtConvencao;
    }

    public float getNrProtocoloRegistro() {
        return nrProtocoloRegistro;
    }

    public String getNrProtocoloCancelamento() {
        return nrProtocoloCancelamento;
    }

    public float getDtInicioVigencia() {
        return dtInicioVigencia;
    }

    public float getDtFimVigencia() {
        return dtFimVigencia;
    }

    public float getTpAbrangencia() {
        return tpAbrangencia;
    }

    public SqPartido getSqPartido() {
        return SqPartidoObject;
    }

    public Endereco getSqEndereco() {
        return SqEnderecoObject;
    }

    public SqRecibo getSqRecibo() {
        return SqReciboObject;
    }

    public String getNrProtocolo() {
        return nrProtocolo;
    }

    public String getDtDeliberacaoInativacao() {
        return dtDeliberacaoInativacao;
    }

    public String getDtDecisaoJudicial() {
        return dtDecisaoJudicial;
    }

    public String getAlertas() {
        return alertas;
    }

    public String getStatusVigente() {
        return statusVigente;
    }

    public float getId() {
        return id;
    }

    public String getDtDecisaoDespachoFormatada() {
        return dtDecisaoDespachoFormatada;
    }

    public boolean getVigente() {
        return vigente;
    }

    public String getTpOrgaoPartidarioFormatada() {
        return tpOrgaoPartidarioFormatada;
    }

    public String getDtInicioVigenciaFormatada() {
        return dtInicioVigenciaFormatada;
    }

    public String getDtFimVigenciaFormatada() {
        return dtFimVigenciaFormatada;
    }

    public String getTpAbrangenciaFormatado() {
        return tpAbrangenciaFormatado;
    }

    public String getStOrgaoPartidarioFormatada() {
        return stOrgaoPartidarioFormatada;
    }

    public String getVigenteFormatado() {
        return vigenteFormatado;
    }

    public String getStTpAbrangencia() {
        return stTpAbrangencia;
    }

    public String getDtConstituicaoFormatada() {
        return dtConstituicaoFormatada;
    }

    public String getDtDeliberacaoCancelamentoFormatada() {
        return dtDeliberacaoCancelamentoFormatada;
    }

    public String getDtDecisaoCancelamentoFormatada() {
        return dtDecisaoCancelamentoFormatada;
    }

    public String getNrCnpjFormatado() {
        return nrCnpjFormatado;
    }

    public String getDtConvencaoFormatada() {
        return dtConvencaoFormatada;
    }

    // Setter Methods

    public void setSqOrgaoPartidario(float sqOrgaoPartidario) {
        this.sqOrgaoPartidario = sqOrgaoPartidario;
    }

    public void setSqControleAnotacao(SqControleAnotacao sqControleAnotacaoObject) {
        this.SqControleAnotacaoObject = sqControleAnotacaoObject;
    }

    public void setDtConstituicao(String dtConstituicao) {
        this.dtConstituicao = dtConstituicao;
    }

    public void setDtDecisaoDespacho(float dtDecisaoDespacho) {
        this.dtDecisaoDespacho = dtDecisaoDespacho;
    }

    public void setStOrgaoPartidario(float stOrgaoPartidario) {
        this.stOrgaoPartidario = stOrgaoPartidario;
    }

    public void setTpOrgaoPartidario(float tpOrgaoPartidario) {
        this.tpOrgaoPartidario = tpOrgaoPartidario;
    }

    public void setNmSite(String nmSite) {
        this.nmSite = nmSite;
    }

    public void setDsJustificativa(String dsJustificativa) {
        this.dsJustificativa = dsJustificativa;
    }

    public void setDsJustificativaAntecipacaoVigencia(String dsJustificativaAntecipacaoVigencia) {
        this.dsJustificativaAntecipacaoVigencia = dsJustificativaAntecipacaoVigencia;
    }

    public void setDsJustificativaDataInicioVigenciaRetroativa(String dsJustificativaDataInicioVigenciaRetroativa) {
        this.dsJustificativaDataInicioVigenciaRetroativa = dsJustificativaDataInicioVigenciaRetroativa;
    }

    public void setDsJustificativaDataDeliberacaoRetroativa(String dsJustificativaDataDeliberacaoRetroativa) {
        this.dsJustificativaDataDeliberacaoRetroativa = dsJustificativaDataDeliberacaoRetroativa;
    }

    public void setTxObsRegistro(String txObsRegistro) {
        this.txObsRegistro = txObsRegistro;
    }

    public void setTxObsInativacao(String txObsInativacao) {
        this.txObsInativacao = txObsInativacao;
    }

    public void setTxObsDadosLocal(String txObsDadosLocal) {
        this.txObsDadosLocal = txObsDadosLocal;
    }

    public void setTxObsMembro(String txObsMembro) {
        this.txObsMembro = txObsMembro;
    }

    public void setTxInfoComplementar(String txInfoComplementar) {
        this.txInfoComplementar = txInfoComplementar;
    }

    public void setNrZona(String nrZona) {
        this.nrZona = nrZona;
    }

    public void setDtDeliberacaoCancelamento(String dtDeliberacaoCancelamento) {
        this.dtDeliberacaoCancelamento = dtDeliberacaoCancelamento;
    }

    public void setDtDecisaoCancelamento(String dtDecisaoCancelamento) {
        this.dtDecisaoCancelamento = dtDecisaoCancelamento;
    }

    public void setNrCnpj(String nrCnpj) {
        this.nrCnpj = nrCnpj;
    }

    public void setDtConvencao(float dtConvencao) {
        this.dtConvencao = dtConvencao;
    }

    public void setNrProtocoloRegistro(float nrProtocoloRegistro) {
        this.nrProtocoloRegistro = nrProtocoloRegistro;
    }

    public void setNrProtocoloCancelamento(String nrProtocoloCancelamento) {
        this.nrProtocoloCancelamento = nrProtocoloCancelamento;
    }

    public void setDtInicioVigencia(float dtInicioVigencia) {
        this.dtInicioVigencia = dtInicioVigencia;
    }

    public void setDtFimVigencia(float dtFimVigencia) {
        this.dtFimVigencia = dtFimVigencia;
    }

    public void setTpAbrangencia(float tpAbrangencia) {
        this.tpAbrangencia = tpAbrangencia;
    }

    public void setSqPartido(SqPartido sqPartidoObject) {
        this.SqPartidoObject = sqPartidoObject;
    }

    public void setSqEndereco(Endereco sqEnderecoObject) {
        this.SqEnderecoObject = sqEnderecoObject;
    }

    public void setSqRecibo(SqRecibo sqReciboObject) {
        this.SqReciboObject = sqReciboObject;
    }

    public void setNrProtocolo(String nrProtocolo) {
        this.nrProtocolo = nrProtocolo;
    }

    public void setDtDeliberacaoInativacao(String dtDeliberacaoInativacao) {
        this.dtDeliberacaoInativacao = dtDeliberacaoInativacao;
    }

    public void setDtDecisaoJudicial(String dtDecisaoJudicial) {
        this.dtDecisaoJudicial = dtDecisaoJudicial;
    }

    public void setAlertas(String alertas) {
        this.alertas = alertas;
    }

    public void setStatusVigente(String statusVigente) {
        this.statusVigente = statusVigente;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setDtDecisaoDespachoFormatada(String dtDecisaoDespachoFormatada) {
        this.dtDecisaoDespachoFormatada = dtDecisaoDespachoFormatada;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public void setTpOrgaoPartidarioFormatada(String tpOrgaoPartidarioFormatada) {
        this.tpOrgaoPartidarioFormatada = tpOrgaoPartidarioFormatada;
    }

    public void setDtInicioVigenciaFormatada(String dtInicioVigenciaFormatada) {
        this.dtInicioVigenciaFormatada = dtInicioVigenciaFormatada;
    }

    public void setDtFimVigenciaFormatada(String dtFimVigenciaFormatada) {
        this.dtFimVigenciaFormatada = dtFimVigenciaFormatada;
    }

    public void setTpAbrangenciaFormatado(String tpAbrangenciaFormatado) {
        this.tpAbrangenciaFormatado = tpAbrangenciaFormatado;
    }

    public void setStOrgaoPartidarioFormatada(String stOrgaoPartidarioFormatada) {
        this.stOrgaoPartidarioFormatada = stOrgaoPartidarioFormatada;
    }

    public void setVigenteFormatado(String vigenteFormatado) {
        this.vigenteFormatado = vigenteFormatado;
    }

    public void setStTpAbrangencia(String stTpAbrangencia) {
        this.stTpAbrangencia = stTpAbrangencia;
    }

    public void setDtConstituicaoFormatada(String dtConstituicaoFormatada) {
        this.dtConstituicaoFormatada = dtConstituicaoFormatada;
    }

    public void setDtDeliberacaoCancelamentoFormatada(String dtDeliberacaoCancelamentoFormatada) {
        this.dtDeliberacaoCancelamentoFormatada = dtDeliberacaoCancelamentoFormatada;
    }

    public void setDtDecisaoCancelamentoFormatada(String dtDecisaoCancelamentoFormatada) {
        this.dtDecisaoCancelamentoFormatada = dtDecisaoCancelamentoFormatada;
    }

    public void setNrCnpjFormatado(String nrCnpjFormatado) {
        this.nrCnpjFormatado = nrCnpjFormatado;
    }

    public void setDtConvencaoFormatada(String dtConvencaoFormatada) {
        this.dtConvencaoFormatada = dtConvencaoFormatada;
    }
}