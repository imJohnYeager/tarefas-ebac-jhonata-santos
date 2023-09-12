package br.jyeager;

import br.jyeager.dao.*;
import br.jyeager.domain.Acessorio;
import br.jyeager.domain.Carro;
import br.jyeager.domain.Marca;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class MarcaTest {
    private IMarcaDao marcaDao;
    private ICarroDao carroDao;
    private IAcessorioDao acessorioDao;

    public MarcaTest(){
        marcaDao = new MarcaDao();
        carroDao = new CarroDao();
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void inserir(){
        Carro carro = criarCarro("001A");
        Acessorio acessorio = criarAcessorio("001A");
        Marca marca = new Marca();
        marca.setCodigo("001A");
        //mat.setDataMarca(Instant.now());
        marca.setNome("Toyota");
        marca.setCarro(carro);
        marca.setAcessorio(acessorio);
        marcaDao.cadastrar(marca);

        Assert.assertNotNull(marca);
        Assert.assertNotNull(marca.getId());
    }

    private Acessorio criarAcessorio(String codigo) {
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo(codigo);
        acessorio.setMaterial("Metal");
        return acessorioDao.implementar(acessorio);
    }

    private Carro criarCarro(String codigo) {
        Carro carro = new Carro();
        carro.setCodigo(codigo);
        carro.setKm("0 km");
        carro.setTipo("Esportivo");
        return carroDao.estocar(carro);
    }
}
