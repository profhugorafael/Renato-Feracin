package com.api.serpro.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaDto {

    private String ni;
    private String inicio;
    private String fim;

}
