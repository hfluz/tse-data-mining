package br.hfluz.tse.data.mining.model;

import java.util.ArrayList;

/**
 * http://inter01.tse.jus.br/sgip3-consulta/api/v1/orgaoPartidario/consulta?nrZona=0&sgUe=&sgUeSuperior=AL&sqPartido=0&tpAbrangencia=82
 * http://inter01.tse.jus.br/sgip3-consulta/api/v1/orgaoPartidario/consulta?nrZona=0&sgUe=&sgUeSuperior=AL&sqPartido=0&tpAbrangencia=83
 */
public class DetalheOrgaoPartidario {
    private String sqOrgaoPartidario = null;
    private String numero = null;
    private String sigla = null;
    private String tipoOrgao = null;
    private String dataInicioVigencia = null;
    private String dataFimVigencia = null;
    private String protocolo = null;
    private String situacao = null;
    private String situacaoiVigencia = null;
    private String abrangencia = null;
    private String qtdeRegistros = null;
    OrgaoPartidario OrgaoPartidarioObject;
    ArrayList < Membro > membros = new ArrayList < Membro > ();
    ArrayList< AnotacaoOrgaoPartidarioInfo > anotacaoOrgaoPartidarioInfo = new ArrayList < AnotacaoOrgaoPartidarioInfo > ();
    private String uf = null;
    private String municipio = null;
    private String zona = null;
    private boolean emitirComissaoExecutiva;


    // Getter Methods

    public String getSqOrgaoPartidario() {
        return sqOrgaoPartidario;
    }

    public String getNumero() {
        return numero;
    }

    public String getSigla() {
        return sigla;
    }

    public String getTipoOrgao() {
        return tipoOrgao;
    }

    public String getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public String getDataFimVigencia() {
        return dataFimVigencia;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getSituacaoiVigencia() {
        return situacaoiVigencia;
    }

    public String getAbrangencia() {
        return abrangencia;
    }

    public String getQtdeRegistros() {
        return qtdeRegistros;
    }

    public OrgaoPartidario getOrgaoPartidario() {
        return OrgaoPartidarioObject;
    }

    public String getUf() {
        return uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getZona() {
        return zona;
    }

    public boolean getEmitirComissaoExecutiva() {
        return emitirComissaoExecutiva;
    }

    // Setter Methods

    public void setSqOrgaoPartidario(String sqOrgaoPartidario) {
        this.sqOrgaoPartidario = sqOrgaoPartidario;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setTipoOrgao(String tipoOrgao) {
        this.tipoOrgao = tipoOrgao;
    }

    public void setDataInicioVigencia(String dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    public void setDataFimVigencia(String dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setSituacaoiVigencia(String situacaoiVigencia) {
        this.situacaoiVigencia = situacaoiVigencia;
    }

    public void setAbrangencia(String abrangencia) {
        this.abrangencia = abrangencia;
    }

    public void setQtdeRegistros(String qtdeRegistros) {
        this.qtdeRegistros = qtdeRegistros;
    }

    public void setOrgaoPartidario(OrgaoPartidario orgaoPartidarioObject) {
        this.OrgaoPartidarioObject = orgaoPartidarioObject;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setEmitirComissaoExecutiva(boolean emitirComissaoExecutiva) {
        this.emitirComissaoExecutiva = emitirComissaoExecutiva;
    }

    public ArrayList<Membro> getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<Membro> membros) {
        this.membros = membros;
    }

    public ArrayList<AnotacaoOrgaoPartidarioInfo> getAnotacaoOrgaoPartidarioInfo() {
        return anotacaoOrgaoPartidarioInfo;
    }

    public void setAnotacaoOrgaoPartidarioInfo(ArrayList<AnotacaoOrgaoPartidarioInfo> anotacaoOrgaoPartidarioInfo) {
        this.anotacaoOrgaoPartidarioInfo = anotacaoOrgaoPartidarioInfo;
    }
}
