package pl.brych.spring_currency_game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.brych.spring_currency_game.model.ExchangeRates;
import pl.brych.spring_currency_game.service.UserInterface;

@Controller
public class CurrencyController {

    private UserInterface userInterface;

    public CurrencyController() {
        userInterface = new UserInterface();
        userInterface.showOptions(getRatesValuesFromApi());
    }

    private ExchangeRates getRatesValuesFromApi() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.frankfurter.app/latest?from=PLN", ExchangeRates.class);
    }

}
