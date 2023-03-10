package com.babaeuropeu.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Estatisticas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantidadeGols;
    private int quantidadeArtilheiro;
    private int quantidadeAssistencias;
    private int quantidadeAssistente;
    private int quantidadeParedao;
    private int quantidadeXerifao;
    private int quantidadePereba;

}
