package br.jyeager;

import br.jyeager.dao.IMatriculaDao;
import br.jyeager.dao.MatriculaDao;
import br.jyeager.domain.Matricula;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class MatriculaTeste {
    private IMatriculaDao matriculaDao;

    public MatriculaTeste(){
        matriculaDao = new MatriculaDao();
    }

    @Test
    public void cadastrar(){
        Matricula mat = new Matricula();
        mat.setCodigo("A!");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValorMatricula(2000d);
        matriculaDao.cadastrar(mat);

        Assert.assertNotNull(mat);
        Assert.assertNotNull(mat.getId());
    }
}
