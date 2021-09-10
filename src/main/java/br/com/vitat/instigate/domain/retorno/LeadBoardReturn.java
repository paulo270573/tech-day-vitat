package br.com.vitat.instigate.domain.retorno;

import br.com.vitat.instigate.domain.entities.Program;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeadBoardReturn {

    private ProgramaReturn program;
    private String group;
    private List<RankReturn> rank;

    public LeadBoardReturn(Program program) {
        this.program = program.toProgramReturn();
        this.group = "GERAL";
        this.rank = Optional.ofNullable(program.getParticipants())
                .orElse(Collections.emptyList())
                .stream()
                .map(RankReturn::new)
                .sorted(Comparator.comparing(RankReturn::getTime))
                .collect(Collectors.toList());
    }
}
