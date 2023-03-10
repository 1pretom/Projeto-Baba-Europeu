package com.babaeuropeu.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    @NotBlank(message = "Campo não informado")
    private String nome;

    @Column(nullable = false, length = 20)
    @NotBlank(message = "Campo não informado")
    private String sobrenome;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Campo não informado")
    private int numeroCamisa;
    private String apelidoCamisa;
    private Timestamp dataNascimento;
    private Integer whatsapp;
    private boolean isAdmin;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "estatisticas_id")
    private Estatisticas estatisticas;

}
