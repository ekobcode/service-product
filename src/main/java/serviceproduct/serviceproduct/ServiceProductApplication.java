package serviceproduct.serviceproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class ServiceProductApplication {

	@RequestMapping("/product")
	public String home() {
		return "Hello This is Product Page";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceProductApplication.class, args);
	}

}
