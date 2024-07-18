package com.example.donate.dogs.donate;

public record DonateResponseDTO(Long id, String nm, String img, Integer qtd) {
    public DonateResponseDTO(Donate donate){
        this(donate.getId(), donate.getNm(), donate.getImg(), donate.getQtd());
    }
}
