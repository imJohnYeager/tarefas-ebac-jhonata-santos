package br.com.ebac.ebac_troggle_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EbacTroggleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbacTroggleServerApplication.class, args);
	}

}
