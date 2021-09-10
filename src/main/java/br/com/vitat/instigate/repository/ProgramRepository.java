package br.com.vitat.instigate.repository;

import br.com.vitat.instigate.domain.entities.Program;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ProgramRepository extends CrudRepository<Program, Long> {

    List<Program> findAllByDateResetOrderByProgram(Date dateReset);

}
