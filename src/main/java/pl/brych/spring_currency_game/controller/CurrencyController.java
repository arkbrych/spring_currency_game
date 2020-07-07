package pl.brych.spring_currency_game.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.brych.spring_currency_game.service.UserInterface;

@Controller
public class CurrencyController {

    private UserInterface userInterface;

    public CurrencyController() throws JsonProcessingException {
        userInterface = new UserInterface();
        userInterface.showOptions(getRatesValuesFromApi());
    }

    private String getRatesValuesFromApi() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.frankfurter.app/latest?from=PLN", String.class);
    }

}
