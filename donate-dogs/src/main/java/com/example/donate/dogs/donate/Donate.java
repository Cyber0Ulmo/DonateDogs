package com.example.donate.dogs.donate;

import jakarta.persistence.*;


@Table(name = "donates")
@Entity(name="donates")

public class Donate {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nm")
    private String nm;

    @Column(name ="img")
    private String img;

    @Column(name = "qtd")
    private Integer qtd;

    public Donate(){

    }

    public Donate(Long id, String nm, String img, Integer qtd) {
        this.id = id;
        this.nm = nm;
        this.img = img;
        this.qtd = qtd;
    }

    public Donate(DonateRequestDTO data){
        this.img = data.img();
        this.qtd = data.qtd();
        this.nm = data.nm();

    }

    public Long getId() {
        return id;
    }

    public String getNm() {
        return nm;
    }

    public String getImg() {
        return img;
    }

    public Integer getQtd() {
        return qtd;
    }
}
