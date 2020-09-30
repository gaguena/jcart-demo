package br.com.gaguena.cart.repositoy;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.gaguena.cart.model.entity.StoreModel;

@Repository
public interface StoreRepository extends PagingAndSortingRepository<StoreModel, Long> {

    Optional<StoreModel> findByCode(final String code);

}
