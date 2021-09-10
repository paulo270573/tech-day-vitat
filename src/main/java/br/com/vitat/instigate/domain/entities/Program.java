package br.com.vitat.instigate.domain.entities;

import br.com.vitat.instigate.domain.retorno.ProgramaReturn;
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
import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PROGRAMA")
@Access(AccessType.FIELD)
public class Program {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SQ_PROGRAM_ID")
    @SequenceGenerator(name="SQ_PROGRAM_ID", sequenceName="SQ_PROGRAM_ID",initialValue = 1, allocationSize =1)
    @Column(name="program_id")
    private Long programId;

    @Column(name="programa")
    private String program;

    @Column(name="program_url")
    private String programUrl;

    @Column(name="meta")
    private Double meta;

    @Column(name="date_reset")
    private Date dateReset;

    @OneToMany(fetch = FetchType.EAGER,  mappedBy = "customer",orphanRemoval = true, cascade = {CascadeType.ALL})
    @Fetch(FetchMode.SUBSELECT)
    private List<ProgramCustomer> participants;


    public ProgramaReturn toProgramReturn() {
        return ProgramaReturn.builder()
                .programId(this.programId)
                .program(this.program)
                .programURL(this.programUrl)
                .meta(this.meta)
                .dateReset(this.dateReset)
                .build();
    }

}
