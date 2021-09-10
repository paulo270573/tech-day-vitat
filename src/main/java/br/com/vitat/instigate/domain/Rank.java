package br.com.vitat.instigate.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rank {
    
    private Long score;
    private Customer customer;
    private Double time;
}
