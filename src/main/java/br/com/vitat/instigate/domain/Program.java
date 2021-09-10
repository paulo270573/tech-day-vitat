package br.com.vitat.instigate.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Program {

    private Long programId;
    private String program;
    private String programURL;
    private Double meta;
    private Date dateReset;

}
