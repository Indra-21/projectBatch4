package com.batch4.javaproject.demoproject.controller.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_FormPendaftaran")
public class FormModel {
    
    @Id
    private int nomPasien;

    @Column ( name = "nama_Pasien")
    private String namPasien;
    private String genPasien;
    private String katPasien;
    private int biayaPasien;
    private Date TangLahir;
    
    public int getNomPasien() {
        return nomPasien;
    }
    public void setNomPasien(int nomPasien) {
        this.nomPasien = nomPasien;
    }
    public String getNamPasien() {
        return namPasien;
    }
    public void setNamPasien(String namPasien) {
        this.namPasien = namPasien;
    }
    public String getGenPasien() {
        return genPasien;
    }
    public void setGenPasien(String genPasien) {
        this.genPasien = genPasien;
    }
    public String getKatPasien() {
        return katPasien;
    }
    public void setKatPasien(String katPasien) {
        this.katPasien = katPasien;
    }
    public int getBiayaPasien() {
        return biayaPasien;
    }
    public void setBiayaPasien(int biayaPasien) {
        this.biayaPasien = biayaPasien;
    }
    public Date getTangLahir() {
        return TangLahir;
    }
    public void setTangLahir(Date tangLahir) {
        TangLahir = tangLahir;
    }

    
}
