/**
 * 
 */
package com.jyeager.vendasonline.repository;

import java.util.Optional;

import com.jyeager.vendasonline.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String>{

	Optional<Cliente> findByCpf(Long cpf);
}
