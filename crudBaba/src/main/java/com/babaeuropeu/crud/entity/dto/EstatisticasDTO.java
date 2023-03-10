package com.babaeuropeu.crud.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EstatisticasDTO {
    private int quantidadeGols;
    private int quantidadeArtilheiro;
    private int quantidadeAssistencias;
    private int quantidadeAssistente;
    private int quantidadeParedao;
    private int quantidadeXerifao;
    private int quantidadePereba;
}
