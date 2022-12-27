package com.api.serpro.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RetornoConsultaPorNi {

    private long quantidade;
    private int pagina;
    private int quantidadePaginas;
    private List<Auditoria> auditorias;

}
