package com.docapp.shared_docapp.models.messaggio;

import java.sql.Timestamp;

public class Messaggio {
    private String  email_studente, testo, tms;
    private int id_conversazione, id_messaggio;

    public Messaggio(){}

    public Messaggio(int id_conversazione, String email_studente, String testo, String tms){
        this.email_studente = email_studente;
        this.id_conversazione = id_conversazione;
        this.testo = testo;
        this.tms = tms;
    }

    public void setId_messaggio(int id_messaggio){
        this.id_messaggio = id_messaggio;
    }

    public int getId_messaggio(){
        return this.id_messaggio;
    }

    public String getTms(){
        return this.tms;
    }

    public void setTms(String tms){
        this.tms = tms;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
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
}
