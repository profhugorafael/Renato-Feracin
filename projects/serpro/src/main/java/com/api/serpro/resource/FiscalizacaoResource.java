package com.api.serpro.resource;

import com.api.serpro.entity.RetornoConsultaPorNi;
import com.api.serpro.resource.dto.ConsultaDto;
import com.api.serpro.service.AuditoriaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("serpro/fiscalizacao")
@AllArgsConstructor
public class FiscalizacaoResource {

    private final AuditoriaService auditoriaService;

    @GetMapping
    public ResponseEntity<RetornoConsultaPorNi> gerarArquivoFiscalizacao(@RequestBody ConsultaDto consultaDto){
        RetornoConsultaPorNi retornoConsultaPorNi =
                auditoriaService.get(Integer.parseInt(consultaDto.getNi()), consultaDto.getInicio(), consultaDto.getFim());

        return ResponseEntity.ok(retornoConsultaPorNi);
//        return ResponseEntity.status(HttpStatus.OK).body(retornoConsultaPorNi);
    }


}
