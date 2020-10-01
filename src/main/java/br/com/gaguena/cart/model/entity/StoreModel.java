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
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "TB_STORE")
@SequenceGenerator(sequenceName = "SEQ_TB_STORE_ID", name = "SEQ_ID", initialValue = 1, allocationSize = 10)
public class StoreModel extends BaseEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Column(name = "STORE_NAME", nullable = false)
    private String name;

    @Column(name = "STORE_ALIAS", length = 25)
    private String alias;

    @Column(name = "STORE_CODE", length = 11)
    private String code;

    @ManyToOne
    @JoinColumn(name = "ADDRESS_ID", foreignKey = @ForeignKey(name = "FK_TB_ADDRESS"))
    private AddressModel address;
}
