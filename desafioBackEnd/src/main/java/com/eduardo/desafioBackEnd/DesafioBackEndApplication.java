package com.eduardo.desafioBackEnd;

import com.eduardo.desafioBackEnd.JPA.Pessoa.BuscaPessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DesafioBackEndApplication {

	static BuscaPessoa buscaPessoa;

    public DesafioBackEndApplication(BuscaPessoa buscaPessoa) {
        DesafioBackEndApplication.buscaPessoa = buscaPessoa;
    }

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DesafioBackEndApplication.class, args);
		System.out.println(buscaPessoa.buscaPessoaPorCPF("123.456.789-10").getNomeCompleto());
	}

}
