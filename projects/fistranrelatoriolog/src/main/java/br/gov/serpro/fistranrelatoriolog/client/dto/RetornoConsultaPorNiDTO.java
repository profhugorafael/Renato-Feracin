package br.gov.serpro.fistranrelatoriolog.client.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RetornoConsultaPorNiDTO {

    private long quantidade;
    private int pagina;
    private int quantidadePaginas;
    private List<AuditoriaDTO> auditorias;

}

