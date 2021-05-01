package com.borovkov.microservicefabrique.web.services;

import com.borovkov.microservicefabrique.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer");
    }
}
