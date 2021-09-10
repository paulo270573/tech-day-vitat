package br.com.vitat.instigate.domain.retorno;


import br.com.vitat.instigate.domain.entities.ProgramCustomer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankReturn {

    private CustomerReturn customer;
    private Double time;

    public RankReturn(ProgramCustomer programCustomer) {
        this.customer = programCustomer.getCustomer().toCustomerReturn();
        this.time = Optional.ofNullable(programCustomer.getTime()).orElse(0D);
    }
}
