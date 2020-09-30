package br.com.gaguena.cart.rest.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaguena.cart.StoreService;
import br.com.gaguena.cart.exception.rest.NotFoundException;

@RestController
@RequestMapping("/stores")
public class StoreRest {

    @Autowired
    private StoreService storeService;

    @RequestMapping(path = "/{code}", method = RequestMethod.GET)
    public ResponseEntity<? extends Serializable> get(@PathVariable final String code) {

        return storeService.findBy(code).map(value -> ResponseEntity.ok(value))
                .orElseThrow(() -> new NotFoundException("Not Found Store"));
    }

}
