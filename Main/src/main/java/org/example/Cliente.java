package org.example;

public class Cliente {
    private int id;
    private String nome;
    private  String email;
    private String telefone;
    private boolean ativo;

    public Cliente() {}

    public Cliente(int id, String nome, String email, String telefone, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n================= Cliente =================\n" +
                " ID       : " + id + "\n" +
                " Nome     : " + nome + "\n" +
                " Email    : " + email + "\n" +
                " Telefone : " + telefone + "\n" +
                " Ativo    : " + (ativo ? "Sim" : "Não") + "\n" +
                "===========================================\n";
    }

}
