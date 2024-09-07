package med.voll.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/medicos")
						.uri("http://localhost:8081/medicos"))
				.route(p -> p
						.path("/pacientes")
						.uri("http://localhost:8082/pacientes"))
				//.route( r -> r.path("/**")
				//		//.filters(f -> f.stripPrefix(1))
				//		.uri("lb://VEICULO-SERVICE"))
				.build();
	}
}
