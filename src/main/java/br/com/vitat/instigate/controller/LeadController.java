package br.com.vitat.instigate.controller;

import br.com.vitat.instigate.domain.LeadBoard;
import br.com.vitat.instigate.domain.Program;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("")
public class LeadController {


    @GetMapping("/leadboard/program/{programId}")
    @ResponseStatus(code = HttpStatus.OK)
    public LeadBoard getLeadBoardGeral(@PathVariable Long programId) {
        return new LeadBoard();
    }


    @GetMapping("/program/date/{date}")
    public List<Program> getProgramsByDate(@PathVariable String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date dateReset = sdf.parse(date);
        return Arrays.asList(new Program(), new Program(), new Program());
    }


}
