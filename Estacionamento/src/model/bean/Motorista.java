package model.bean;


public class Motorista {

    private int idMotorista;
    private String nome;
    private String genero;
    private int rg;
    private int cpf;
    private int celular;
    private boolean homem;
    private String email;
    private String senha;

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    public boolean isHomem() {
        return homem;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    public void setHomem(boolean homem) {
        this.homem = homem;
    }

    public int getRg() {
    public String getRg() {
        return rg;
    }

    public void setRg(int rg) {
    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getCpf() {
    public String getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCelular() {
    public String getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
    public void setCelular(String celular) {
        this.celular = celular;
    }