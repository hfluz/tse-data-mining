package br.hfluz.tse.data.mining.model;

public class Membro {
    private float id;
    private String nomeMembro;
    private String nomeCargo;
    private String dataInicioExercicio;
    private String dataFimExercicio;
    private String situacao;
    private String respAdministrativo;
    private String respFinanceiro;
    private String nrTitulo;
    private String cpf;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getNomeMembro() {
        return nomeMembro;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public String getDataInicioExercicio() {
        return dataInicioExercicio;
    }

    public String getDataFimExercicio() {
        return dataFimExercicio;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getRespAdministrativo() {
        return respAdministrativo;
    }

    public String getRespFinanceiro() {
        return respFinanceiro;
    }

    public String getNrTitulo() {
        return nrTitulo;
    }

    public String getCpf() {
        return cpf;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setNomeMembro(String nomeMembro) {
        this.nomeMembro = nomeMembro;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public void setDataInicioExercicio(String dataInicioExercicio) {
        this.dataInicioExercicio = dataInicioExercicio;
    }

    public void setDataFimExercicio(String dataFimExercicio) {
        this.dataFimExercicio = dataFimExercicio;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setRespAdministrativo(String respAdministrativo) {
        this.respAdministrativo = respAdministrativo;
    }

    public void setRespFinanceiro(String respFinanceiro) {
        this.respFinanceiro = respFinanceiro;
    }

    public void setNrTitulo(String nrTitulo) {
        this.nrTitulo = nrTitulo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
