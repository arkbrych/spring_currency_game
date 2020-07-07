package pl.brych.spring_currency_game.service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomRate {

    public String getRandomRate() {
        List<String> ratesList = Arrays.asList(
                "AUD",
                "BGN",
                "BRL",
                "CAD",
                "CHF",
                "CNY",
                "CZK",
                "DKK",
                "EUR",
                "GBP",
                "HKD",
                "HRK",
                "HUF",
                "IDR",
                "ILS",
                "INR",
                "ISK",
                "JPY",
                "KRW",
                "MXN",
                "MYR",
                "NOK",
                "NZD",
                "PHP",
                "RON",
                "RUB",
                "SEK",
                "SGD",
                "THB",
                "TRY",
                "USD",
                "ZAR"
        );
        Random random = new Random();
        int randomIndex = random.nextInt(ratesList.size());

        return ratesList.get(randomIndex);
    }
}
