package com.api_vendinha.api.domain.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
public class ProdutoResponseDto {
        private Long id ;
        private String name ;
        private Integer quantidade;
        private BigInteger preco;
        private Boolean is_active;
}
