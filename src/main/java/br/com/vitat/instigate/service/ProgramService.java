package br.com.vitat.instigate.service;

import br.com.vitat.instigate.domain.entities.Program;
import br.com.vitat.instigate.domain.retorno.LeadBoardReturn;
import br.com.vitat.instigate.domain.retorno.ProgramaReturn;
import br.com.vitat.instigate.exception.ProgramNotFoundException;
import br.com.vitat.instigate.repository.ProgramRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProgramService {

    private final ProgramRepository programRepository;

    public LeadBoardReturn getLeadBoard(Long idProgram) {
        return programRepository.findById(idProgram)
                .map(LeadBoardReturn::new)
                .orElseThrow(ProgramNotFoundException::new);
    }

    public List<ProgramaReturn> getProgramsByDateReset(Date date) {
        return programRepository.findAllByDateResetOrderByProgram(date)
                .stream()
                .map(program -> program.toProgramReturn())
                .collect(Collectors.toList());
    }
}
