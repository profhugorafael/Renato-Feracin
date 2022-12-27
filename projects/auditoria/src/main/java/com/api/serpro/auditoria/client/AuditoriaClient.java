package com.api.serpro.auditoria.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.serpro.auditoria.dto.RetornoConsultaPorNi;

@FeignClient(value = "auditoria-api", url = "https://des.fiscdenatran.estaleiro.serpro.gov.br/auditoria/v1/obter")
public interface AuditoriaClient {

  @GetMapping(value = "/{ni}/dataInicial/{inicio}/dataFinal/{fim}")
  RetornoConsultaPorNi consultarPorNi(@PathVariable String ni, @PathVariable String inicio, @PathVariable String fim);
  
}
