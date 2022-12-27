package com.api.serpro.auditoria.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.serpro.auditoria.client.AuditoriaClient;
import com.api.serpro.auditoria.dto.RetornoAuditoriaDTO;
import com.api.serpro.auditoria.dto.RetornoConsultaPorNi;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("serpro/fiscalizacao")
@AllArgsConstructor
public class FiscalizacaoResource {

    private AuditoriaClient auditoriaClient;

    @GetMapping("/{ni}/dataInicial/{inicio}/dataFinal/{fim}")
    public ResponseEntity<RetornoConsultaPorNi> consultar(@PathVariable String ni, @PathVariable String inicio, @PathVariable String fim){
        RetornoConsultaPorNi retorno = auditoriaClient.consultarPorNi(ni, inicio, fim);

        // RetornoAuditoriaDTO retornoAuditoria = new

        return ResponseEntity.ok(retorno);
    }

}
