package com.jyeager.atividade.services;

import com.jyeager.atividade.domain.user.User;
import com.jyeager.atividade.domain.user.UserType;
import com.jyeager.atividade.dtos.UserDTO;
import com.jyeager.atividade.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class UserService {
    @Autowired
    private IUserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() == UserType.MERCHANT){
            throw new Exception("Você não pode realizar transação, por ser lojista.");
        }
        if (sender.getBalance().compareTo(amount) < 0 ){
            throw new Exception("Você não possui saldo.");
        }

    }

    public User findUserById(Long id) throws Exception {
        return this.repository.findUserById(id).orElseThrow(()-> new Exception("Usuário não encontrado."));
    }

    public User createUser(UserDTO data){
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }

    public void saveUser(User user){
        this.repository.save(user);
    }
}
