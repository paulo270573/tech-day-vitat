package br.com.vitat.instigate.domain.retorno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerReturn {

    private Long customerId;
    private String name;
    private String photoURL;

}
