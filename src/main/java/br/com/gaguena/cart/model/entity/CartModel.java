package br.com.gaguena.cart.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@Entity
@Table(name = "TB_CART")
@SequenceGenerator(sequenceName = "SEQ_TB_CART_ID", name = "SEQ_ID", initialValue = 1, allocationSize = 10)
public class CartModel extends BaseEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Column(unique = true, nullable = false)
    private Long code;

    @ManyToOne
    @JoinColumn(name = "STORE_ID", foreignKey = @ForeignKey(name = "FK_TB_STORE"))
    private StoreModel store;

}
