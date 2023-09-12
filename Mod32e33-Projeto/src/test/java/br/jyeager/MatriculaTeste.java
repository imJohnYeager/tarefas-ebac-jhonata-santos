package br.jyeager;

import br.jyeager.dao.*;
import br.jyeager.domain.Aluno;
import br.jyeager.domain.Computador;
import br.jyeager.domain.Curso;
import br.jyeager.domain.Matricula;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class MatriculaTeste {
    private IMatriculaDao matriculaDao;
    private ICursoDao cursoDao;
    private IAlunoDao alunoDao;
    private IComputadorDao computadorDao;

    public MatriculaTeste(){
        matriculaDao = new MatriculaDao();
        cursoDao = new CursoDao();
        alunoDao = new AlunoDao();
        computadorDao = new ComputadorDao();
    }

    @Test
    public void cadastrar(){
        Curso curso = criarCurso("A1");
        Aluno aluno = criarAluno("A1");
        Matricula mat = new Matricula();
        mat.setCodigo("A1");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValorMatricula(2000d);
        mat.setCurso(curso);
        mat.setAluno(aluno);
        aluno.setMatricula(mat);
        matriculaDao.cadastrar(mat);

        Assert.assertNotNull(mat);
        Assert.assertNotNull(mat.getId());
    }

    private Computador criarComputador(String codigo) {
        Computador comp = new Computador();
        comp.setCodigo(codigo);
        comp.setDescricao("Computador gamer");
        return comp;
        //return computadorDao.cadastrar(comp);
    }

    private Aluno criarAluno(String codigo) {
        Computador comp = criarComputador("A1");
        Computador comp2 = criarComputador("A2");
        Aluno aluno = new Aluno();
        aluno.setCodigo(codigo);
        aluno.setMatricula(null);
        aluno.setNome("Dionisio");
        aluno.add(comp);
        aluno.add(comp2);
//        comp.add(aluno);
//        comp2.add(aluno);
        return alunoDao.cadastrar(aluno);
    }

    private Curso criarCurso(String codigo){
        Curso curso = new Curso();
        curso.setCodigo(codigo);
        curso.setDescricao("Do zero ao pro em Java");
        curso.setNome("Curso Backend em Java");
        return cursoDao.cadastrar(curso);
    }
}
