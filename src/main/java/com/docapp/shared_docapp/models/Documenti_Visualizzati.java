package com.docapp.shared_docapp.models;

import java.util.HashMap;

public class Documenti_Visualizzati implements IEntity {
    public static final String TABLE_NAME ="documenti_visualizzati";
    private int id_documento;
    private String email_studente;

    public Documenti_Visualizzati(){}

    public Documenti_Visualizzati(int id_documento, String email_studente){
        this.id_documento = id_documento;
        this.email_studente = email_studente;
    }

    public String getEmail_studente() {
        return email_studente;
    }

    public void setEmail_studente(String email_studente) {
        this.email_studente = email_studente;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    @Override
    public HashMap<String, ?> toHashMap() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id_documento", id_documento);
        map.put("email_studente", email_studente);
        return map;
    }
}
