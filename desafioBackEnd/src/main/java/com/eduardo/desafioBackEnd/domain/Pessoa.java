package com.eduardo.desafioBackEnd.domain;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "pessoa")
@Table(name = "pessoa")

@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 14)
    private String cpf;
    @Column(nullable = false, length = 70)
    private String nomeCompleto;
    @Column(nullable = false, length = 50)
    private String email;
    @Column(nullable = false)
    private String senha;
}
