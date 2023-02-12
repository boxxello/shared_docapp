package com.docapp.shared_docapp.models.conversazione;

public class Conversazione {
    private String nome_conversazione,email_studente;
    private int id_conversazione ;

    public Conversazione(){}

    public Conversazione(String nome_conversazione, String email_studente){
        this.email_studente = email_studente;
        this.nome_conversazione = nome_conversazione;
    }

    public int getId_conversazione() {
        return id_conversazione;
    }

    public void setId_conversazione(int id_conversazione) {
        this.id_conversazione = id_conversazione;
    }

    public String getEmail_studente() {
        return email_studente;
    }

    public void setEmail_studente(String email_studente) {
        this.email_studente = email_studente;
    }

    public String getNome_conversazione() {
        return nome_conversazione;
    }

    public void setNome_conversazione(String nome_conversazione) {
        this.nome_conversazione = nome_conversazione;
    }
}
