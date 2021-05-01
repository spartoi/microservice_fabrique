package com.borovkov.microservicefabrique.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

public class BeerDtoV2 {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class BeerDto {
        private UUID id;
        private String beerName;
        private BeerStyleEnum beerStyle;
        private Long upc;
    }
}
