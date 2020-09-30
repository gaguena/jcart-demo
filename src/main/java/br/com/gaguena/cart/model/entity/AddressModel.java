package br.com.gaguena.cart.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@Entity
@Table(name = "TB_ADDRESS")
@SequenceGenerator(sequenceName = "SEQ_TB_ADDRESS_ID", name = "SEQ_ID", initialValue = 1, allocationSize = 10)
public class AddressModel extends BaseEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Column(name = "ADDRESS_UF", length = 3)
    private String uf;

    @Column(name = "ADDRESS_CITY")
    private String city;
    
    @Column(name = "ADDRESS_STREET_NAME")
    private String street;

    @Column(name = "ADDRESS_NUMBER")
    private Integer number;

    @Column(name = "ADDRESS_POSTAL_CODE")
    private Integer postalCode;
}
