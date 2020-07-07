package pl.brych.spring_currency_game.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameAppBeanConfig {

    @Bean
    public ObjectMapper mapper(){
        return new ObjectMapper();
    }
}
