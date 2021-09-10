package br.com.vitat.instigate.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeadBoard {

    private Program program;
    private String group;
    private List<Rank> rank;

}
