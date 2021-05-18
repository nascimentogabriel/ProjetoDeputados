package br.edu.infnet.trabalhoapiaula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TrabalhoapiaulaApplication implements CommandLineRunner {

	public static void main(String[] args)   {
		SpringApplication.run(TrabalhoapiaulaApplication.class, args);
	}

	@Autowired
	DeputadoService deputadoService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(deputadoService.buscarDeputados("10").dados.get(0).getNome());
		
	}

}
