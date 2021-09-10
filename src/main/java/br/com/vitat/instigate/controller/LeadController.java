package br.com.vitat.instigate.controller;

import br.com.vitat.instigate.domain.retorno.LeadBoardReturn;
import br.com.vitat.instigate.domain.retorno.ProgramaReturn;
import br.com.vitat.instigate.service.ProgramService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class LeadController {

    private final ProgramService programService;

    @GetMapping("/leadboard/program/{programId}")
    @ResponseStatus(code = HttpStatus.OK)
    public LeadBoardReturn getLeadBoardGeral(@PathVariable Long programId) {
        return programService.getLeadBoard(programId);
    }


    @GetMapping("/program/date/{date}")
    public List<ProgramaReturn> getProgramsByDate(@PathVariable String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dateReset = sdf.parse(date);
        return programService.getProgramsByDateReset(dateReset);
    }


}
