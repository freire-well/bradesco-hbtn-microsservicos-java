package com.example.jpa_h2_demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter @Entity
@Table(name = "CLIENTE")
public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private int idade;
    private String email;
    @OneToMany(mappedBy = "cliente")
    private  List<Telefone> telefone;
    @OneToMany(mappedBy = "cliente")
    private List<Endereco> endereco;
}
