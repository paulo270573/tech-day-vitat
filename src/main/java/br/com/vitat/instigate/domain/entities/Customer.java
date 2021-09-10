package br.com.vitat.instigate.domain.entities;

import br.com.vitat.instigate.domain.retorno.CustomerReturn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CUSTOMER")
@Access(AccessType.FIELD)
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SQ_CUSTOMER_ID")
    @SequenceGenerator(name="SQ_CUSTOMER_ID", sequenceName="SQ_CUSTOMER_ID",initialValue = 1, allocationSize =1)
    @Column(name="customer_id")
    private Long customerId;

    @Column(name="name")
    private String name;

    @Column(name="photo_url")
    private String photoUrl;

    @OneToMany(fetch = FetchType.EAGER,  mappedBy = "customer",orphanRemoval = true, cascade = {CascadeType.ALL})
    @Fetch(FetchMode.SUBSELECT)
    private List<ProgramCustomer> programCustomer;

    public CustomerReturn toCustomerReturn() {
        return CustomerReturn.builder()
                .customerId(this.customerId)
                .name(this.name)
                .photoURL(this.photoUrl)
                .build();
    }

}
