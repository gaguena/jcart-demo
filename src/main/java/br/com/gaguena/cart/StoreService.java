package br.com.gaguena.cart;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gaguena.cart.model.entity.StoreModel;
import br.com.gaguena.cart.repositoy.StoreRepository;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public Optional<StoreModel> save(StoreModel store) {
        return Optional.ofNullable(storeRepository.save(store));
    }

    public Optional<StoreModel> findBy(final String code) {
        return storeRepository.findByCode(code);
    }
}
