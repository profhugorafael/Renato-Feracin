package br.gov.serpro.fistranrelatoriolog.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.gov.serpro.fistranrelatoriolog.client.dto.RetornoConsultaPorNiDTO;

@FeignClient(value = "fistran-api", url = "https://des.fiscdenatran.estaleiro.serpro.gov.br/auditoria/v1/obter")
public interface AuditoriaClient {

    @GetMapping(value = "/{ni}/dataInicial/{inicio}/dataFinal/{fim}")
    RetornoConsultaPorNiDTO consultarPorNi(@PathVariable String ni, @PathVariable String inicio, @PathVariable String fim);
}
