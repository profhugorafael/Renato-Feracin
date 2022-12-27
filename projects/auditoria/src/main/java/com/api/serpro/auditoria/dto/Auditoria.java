package com.api.serpro.auditoria.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Auditoria {

    private String niUsuario;

    private String idDispositivo;
    private LocalDateTime ocorridoEm;
    private long tempoProcessamento;
    private String traceRequisicao;
    
}

