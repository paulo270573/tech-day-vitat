package br.com.vitat.instigate.domain.retorno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramaReturn {

    private Long programId;
    private String program;
    private String programURL;
    private Double meta;
    private Date dateReset;

}
