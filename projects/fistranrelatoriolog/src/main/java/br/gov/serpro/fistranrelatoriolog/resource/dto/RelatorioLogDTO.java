package br.gov.serpro.fistranrelatoriolog.resource.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RelatorioLogDTO {

  private String niUsuario;
  private String idDispositivo;
  private List<String> momentoAuditorias;
  private List<String> httpPath;
  private List<String> codigoResposta;
  
}
