/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;
import org.joda.money.Money;

/**
 *
 * @author ai
 */
public class Memasok {
    private String brg,sup;
    private Money sat;
    private float jum;
    private java.sql.Date tgl;

    public Memasok(String brg, String sup, Money sat, float jum) {
        this.brg = brg;
        this.sup = sup;
        this.sat = sat;
        this.jum = jum;
        tgl=java.sql.Date.valueOf(LocalDate.now());
    }

    public String getBrg() {
        return brg;
    }

    public void setBrg(String brg) {
        this.brg = brg;
    }

    public String getSup() {
        return sup;
    }

    public void setSup(String sup) {
        this.sup = sup;
    }

    public Money getSat() {
        return sat;
    }

    public void setSat(Money sat) {
        this.sat = sat;
    }

    public float getJum() {
        return jum;
    }

    public void setJum(float jum) {
        this.jum = jum;
    }

    public java.sql.Date getTgl() {
        return tgl;
    }

    public void setTgl(java.sql.Date tgl) {
        this.tgl = tgl;
    }
}