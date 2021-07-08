package com.batch4.javaproject.demoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BerandaController {
    
    @RequestMapping("/beranda")
    public String beranda (){
        String html = "Beranda" ;
        return html;
    }

    @RequestMapping("/kodehive/karyawan")
    public String karyawan (){
        return "company/divisi/karyawan";
    }

    @RequestMapping("/kodehive/mahasiswa")
    public String mahasiswa (){
        return "kampus/kelas/mahasiswa";
    }

    @RequestMapping("/form/pendaftaran")
    public String formPendaftaran (){
        return "form/formPendaftaran";
    }
}
