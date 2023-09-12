package br.jyeager;

import org.junit.Assert;
import org.junit.*;
import br.jyeager.dao.CursoDao;
import br.jyeager.dao.ICursoDao;
import br.jyeager.domain.Curso;

public class CursoTeste {
    private ICursoDao cursoDao;

    public CursoTeste() {
        cursoDao = new CursoDao();
    }

    @Test
    public void Cadastrar(){
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("Do zero ao pro em Java");
        curso.setNome("Curso Backend em Java");
        curso = cursoDao.cadastrar(curso);

        Assert.assertNotNull(curso);
        Assert.assertNotNull(curso.getId());
    }
}