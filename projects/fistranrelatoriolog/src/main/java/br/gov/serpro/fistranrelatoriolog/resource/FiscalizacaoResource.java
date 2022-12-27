package br.gov.serpro.fistranrelatoriolog.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.serpro.fistranrelatoriolog.client.AuditoriaClient;
import br.gov.serpro.fistranrelatoriolog.client.dto.AuditoriaDTO;
import br.gov.serpro.fistranrelatoriolog.client.dto.RetornoConsultaPorNiDTO;
import br.gov.serpro.fistranrelatoriolog.resource.dto.RelatorioLogDTO;

@RestController
@RequestMapping("serpro/fiscalizacao")
public class FiscalizacaoResource {

    @Autowired
    AuditoriaClient auditoriaClient;

    @GetMapping("/{ni}/dataInicial/{inicio}/dataFinal/{fim}")
    public ResponseEntity<RetornoConsultaPorNiDTO> consultar(@PathVariable String ni,  @PathVariable String inicio, @PathVariable String fim){
        
        RetornoConsultaPorNiDTO retorno = auditoriaClient.consultarPorNi(ni, inicio, fim);
        
        System.out.println("------------------");
        System.out.println(retorno);

        if(retorno.getAuditorias().isEmpty()) 
            return ResponseEntity.badRequest().build();

        AuditoriaDTO auditoria = retorno.getAuditorias().get(0);

        RelatorioLogDTO relatorio = RelatorioLogDTO.builder()
            .niUsuario(auditoria.getNiUsuario())
            // TODO checar se o id do dispositivo muda durante as auditorias
            .idDispositivo(auditoria.getIdDispositivo())
            .momentoAuditorias(
                retorno
                .getAuditorias().stream()
                .map(a -> a.getOcorridoEm()).toList()) 
            .httpPath(
                retorno
                .getAuditorias().stream() //TODO checar se quero distintos ou repetidos
                .map(a -> a.getHttpPath()).toList()) /*.distinct()*/
            .codigoResposta(
                retorno
                .getAuditorias().stream() //TODO checar se quero distintos ou repetidos
                .map(a -> a.getCodigoResposta()).toList()) /*.distinct()*/
            .build();


        return ResponseEntity.ok(retorno);
    }
}
