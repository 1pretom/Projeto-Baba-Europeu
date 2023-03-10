package com.babaeuropeu.crud.entity.dto;

import com.babaeuropeu.crud.entity.Estatisticas;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class JogadorDTO {

    @NotBlank(message = "Campo não informado")
    private String nome;

    @NotBlank(message = "Campo não informado")
    private String sobrenome;

    @NotBlank(message = "Campo não informado")
    private int numeroCamisa;
    private String apelidoCamisa;
    private Timestamp dataNascimento;
    private Integer whatsapp;
    private boolean isAdmin;

    private Estatisticas estatisticas;
}
