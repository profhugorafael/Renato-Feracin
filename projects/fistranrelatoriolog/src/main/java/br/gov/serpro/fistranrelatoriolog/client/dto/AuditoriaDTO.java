package br.gov.serpro.fistranrelatoriolog.client.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditoriaDTO {

    private String niUsuario;
    private String idDispositivo;
    private String ocorridoEm;
    private String httpPath;
    private String codigoResposta;

}
