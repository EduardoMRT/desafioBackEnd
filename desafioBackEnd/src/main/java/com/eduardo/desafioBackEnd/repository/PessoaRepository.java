package com.eduardo.desafioBackEnd.repository;

import com.eduardo.desafioBackEnd.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    Pessoa findByCpf(String cpf);
}
