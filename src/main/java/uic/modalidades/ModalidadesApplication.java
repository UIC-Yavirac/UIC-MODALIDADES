package uic.modalidades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class ModalidadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModalidadesApplication.class, args);
	}

}
