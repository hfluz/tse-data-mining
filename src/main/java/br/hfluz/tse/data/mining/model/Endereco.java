package br.hfluz.tse.data.mining.model;

public class Endereco {
    private float sqEndereco;
    private String nmLogradouro;
    private String nrLogradouro = null;
    private String nmComplementoEndereco = null;
    private String nmBairro;
    private String nrCep;
    private String nrTelefone;
    private String nrCelular = null;
    private String nrFax;
    private String nmEmail;
    private String nmEmailConfirmacao = null;
    private String nrComercial = null;
    SgUe SgUeObject;
    private float id;
    private String nrCepFormatado;
    private String nrTelefoneFormatado;
    private String nrCelularFormatado = null;
    private String nrFaxFormatado;


    // Getter Methods

    public float getSqEndereco() {
        return sqEndereco;
    }

    public String getNmLogradouro() {
        return nmLogradouro;
    }

    public String getNrLogradouro() {
        return nrLogradouro;
    }

    public String getNmComplementoEndereco() {
        return nmComplementoEndereco;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public String getNrCep() {
        return nrCep;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public String getNrCelular() {
        return nrCelular;
    }

    public String getNrFax() {
        return nrFax;
    }

    public String getNmEmail() {
        return nmEmail;
    }

    public String getNmEmailConfirmacao() {
        return nmEmailConfirmacao;
    }

    public String getNrComercial() {
        return nrComercial;
    }

    public SgUe getSgUe() {
        return SgUeObject;
    }

    public float getId() {
        return id;
    }

    public String getNrCepFormatado() {
        return nrCepFormatado;
    }

    public String getNrTelefoneFormatado() {
        return nrTelefoneFormatado;
    }

    public String getNrCelularFormatado() {
        return nrCelularFormatado;
    }

    public String getNrFaxFormatado() {
        return nrFaxFormatado;
    }

    // Setter Methods

    public void setSqEndereco(float sqEndereco) {
        this.sqEndereco = sqEndereco;
    }

    public void setNmLogradouro(String nmLogradouro) {
        this.nmLogradouro = nmLogradouro;
    }

    public void setNrLogradouro(String nrLogradouro) {
        this.nrLogradouro = nrLogradouro;
    }

    public void setNmComplementoEndereco(String nmComplementoEndereco) {
        this.nmComplementoEndereco = nmComplementoEndereco;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }

    public void setNrCep(String nrCep) {
        this.nrCep = nrCep;
    }

    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }

    public void setNrCelular(String nrCelular) {
        this.nrCelular = nrCelular;
    }

    public void setNrFax(String nrFax) {
        this.nrFax = nrFax;
    }

    public void setNmEmail(String nmEmail) {
        this.nmEmail = nmEmail;
    }

    public void setNmEmailConfirmacao(String nmEmailConfirmacao) {
        this.nmEmailConfirmacao = nmEmailConfirmacao;
    }

    public void setNrComercial(String nrComercial) {
        this.nrComercial = nrComercial;
    }

    public void setSgUe(SgUe sgUeObject) {
        this.SgUeObject = sgUeObject;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setNrCepFormatado(String nrCepFormatado) {
        this.nrCepFormatado = nrCepFormatado;
    }

    public void setNrTelefoneFormatado(String nrTelefoneFormatado) {
        this.nrTelefoneFormatado = nrTelefoneFormatado;
    }

    public void setNrCelularFormatado(String nrCelularFormatado) {
        this.nrCelularFormatado = nrCelularFormatado;
    }

    public void setNrFaxFormatado(String nrFaxFormatado) {
        this.nrFaxFormatado = nrFaxFormatado;
    }
}