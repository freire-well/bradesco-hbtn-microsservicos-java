package com.example.jpa_h2_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Telefone {
   @Id
    long id;
    int DDD;
    String numero;
    @ManyToOne @JoinColumn(name = "cliente_id")
    Cliente cliente;
}
