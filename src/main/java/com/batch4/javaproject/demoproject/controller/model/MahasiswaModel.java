package com.batch4.javaproject.demoproject.controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Mahasiswa")
public class MahasiswaModel {
    

    @Id
    private String kd_Mhs;

    @Column ( name = "nama_mahasiswa")
    private String nm_Mhs;
    private String jk;
    private String alamat;
    private String status;
    private int usia;


    public String getKd_Mhs() {
        return kd_Mhs;
    }
    public void setKd_Mhs(String kd_Mhs) {
        this.kd_Mhs = kd_Mhs;
    }
    public String getNm_Mhs() {
        return nm_Mhs;
    }
    public void setNm_Mhs(String nm_Mhs) {
        this.nm_Mhs = nm_Mhs;
    }
    public String getJk() {
        return jk;
    }
    public void setJk(String jk) {
        this.jk = jk;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getUsia() {
        return usia;
    }
    public void setUsia(int usia) {
        this.usia = usia;
    }

    

}
