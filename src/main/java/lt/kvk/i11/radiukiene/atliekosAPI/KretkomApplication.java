package lt.kvk.i11.radiukiene.atliekosAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KretkomApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(KretkomApplication.class, args);
	}

}




