package br.jyeager;

import br.jyeager.dao.*;
import br.jyeager.domain.Carro;
import junit.framework.Assert;
import org.junit.Test;

public class CarroTest {
    private ICarroDao carroDao;

    public CarroTest(){
        carroDao = new CarroDao();
    }

    @Test
    public void Estocar(){
        Carro carro = new Carro();
        carro.setCodigo("001A");
        carro.setKm("0 km");
        carro.setTipo("Esportivo");
        carro = carroDao.estocar(carro);

        Assert.assertNotNull(carro);
        Assert.assertNotNull(carro.getId());

    }
}
