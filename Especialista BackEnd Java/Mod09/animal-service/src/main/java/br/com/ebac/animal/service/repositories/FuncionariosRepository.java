package br.com.ebac.animal.service.repositories;

import br.com.ebac.animal.service.entidades.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FuncionariosRepository extends JpaRepository<Funcionarios, Integer> {
    @Query("SELECT f.nome as nomeFuncionario, COUNT(a) as quantidadeAnimaisResgatados " +
            "FROM Funcionarios f LEFT JOIN f.animaisResgatados a " +
            "GROUP BY f.nome")
    List<Object[]> countAnimaisResgatadosPorFuncionario();
}
