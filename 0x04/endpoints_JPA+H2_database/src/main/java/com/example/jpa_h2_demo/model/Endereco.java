package com.example.jpa_h2_demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Endereco {
    @Id
    String id;
    String logradouro;
    String endereco;
    String numero;
    String bairro;
    String cidade;
    String estado;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "cliente_id")
    Cliente cliente;
}
