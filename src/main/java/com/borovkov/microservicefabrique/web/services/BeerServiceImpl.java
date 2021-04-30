package com.borovkov.microservicefabrique.web.services;

import com.borovkov.microservicefabrique.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Stray dog")
                .beerStyle("Sweet")
                .build();
    }

    @Override
    public UUID saveBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build().getId();
    }
}
