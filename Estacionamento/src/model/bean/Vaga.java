/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author 05443632051
 */
public class Vaga {
    private int IdVaga;
    private int numero;
    private String rua;
    private boolean obliqua;

    public int getIdVaga() {
        return IdVaga;
    }

    public int getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }

    public boolean isObliqua() {
        return obliqua;
    }

    public void setIdVaga(int IdVaga) {
        this.IdVaga = IdVaga;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setObliqua(boolean obliqua) {
        this.obliqua = obliqua;
    }
    
    
}
