package com.borovkov.microservicefabrique.web.services;

import com.borovkov.microservicefabrique.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    UUID saveBeer(BeerDto beerDto);
}
