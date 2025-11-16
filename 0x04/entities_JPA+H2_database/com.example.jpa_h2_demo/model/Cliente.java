package com.example.jpa_h2_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter @Entity
public class Cliente {
   @Id
    private Long id;
    private String nome;
    private int idade;
    private String email;
    @OneToMany
    private  List<Telefone> telefone;
    @OneToMany
    private List<Endereco> endereco;
}
