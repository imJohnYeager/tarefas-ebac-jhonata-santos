package com.jyeager.repository;

import com.jyeager.domain.Cliente;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;


public interface IClienteRepository extends CrudRepository<Cliente,Long> {
}
