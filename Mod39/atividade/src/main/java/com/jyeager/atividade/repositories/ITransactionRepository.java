package com.jyeager.atividade.repositories;

import com.jyeager.atividade.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
}
