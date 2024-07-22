package com.eduardo.desafioBackEnd.JPA.Pessoa;

import com.eduardo.desafioBackEnd.domain.Pessoa;
import com.eduardo.desafioBackEnd.repository.PessoaRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscaPessoa {
    private final ApplicationContext applicationContext;

    @Autowired
    private PessoaRepository pessoaRepository;

    public BuscaPessoa(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }



    public Pessoa buscaPessoaPorCPF(String cpf) throws Exception {
        try{
            return pessoaRepository.findByCpf(cpf);
        }catch (Exception e){
            throw new Exception(e);
        }
    }
}
