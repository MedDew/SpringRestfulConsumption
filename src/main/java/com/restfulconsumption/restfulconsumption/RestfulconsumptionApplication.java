package com.restfulconsumption.restfulconsumption;

//import java.util.logging.Logger;
import com.restfulconsumption.restfulconsumption.dto.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//METHOD 2 TO CONSUME A Restful WEBSERVICE
@SpringBootApplication
public class RestfulconsumptionApplication {
        private static final Logger log = LoggerFactory.getLogger(RestfulconsumptionApplication.class);

	public static void main(String[] args) {
            //METHOD 1 TO CONSUME A Restful WEBSERVICE
            /*
            RestTemplate restTemplate = new RestTemplate();
            Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            log.info(quote.toString());
            */
            
            
            
            //METHOD 2 TO CONSUME A Restful WEBSERVICE
            SpringApplication.run(RestfulconsumptionApplication.class, args);
	}
        
        //METHOD 2 TO CONSUME A Restful WEBSERVICE
        @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
        
        //METHOD 2 TO CONSUME A Restful WEBSERVICE
        @Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					"http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
			log.info(quote.toString());
		};
	}
}
