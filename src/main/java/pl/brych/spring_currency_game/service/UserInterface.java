package pl.brych.spring_currency_game.service;

import org.springframework.stereotype.Service;
import pl.brych.spring_currency_game.model.ExchangeRates;

import java.util.Scanner;

@Service
public class UserInterface {

    private RandomRate randomRate;

    public UserInterface() {
        randomRate = new RandomRate();
    }

    public void showOptions(ExchangeRates ratesValuesFromApi) {

        System.out.println("Base currency is " + ratesValuesFromApi.getBase());
        String randomRateName = randomRate.getRandomRate();
        double valueOfRandomRateName = ratesValuesFromApi.getRates().get(randomRateName);
//        Uncomment below to start cheat mode
        System.out.println("Value of currency " + valueOfRandomRateName);
        compareUserInput(valueOfRandomRateName);
    }

    public void compareUserInput(double valueOfRandomRateName) {
        double userAnswer;
        boolean isAnswerCorrect;
        try (Scanner userInput = new Scanner(System.in)) {

            do {
                System.out.println("Write number ");
                userAnswer = userInput.nextDouble();
                double formatUserAnswer = (double) Math.round(userAnswer * 100d) / 100d;
                double formatValueOfRandomRateName = (double) Math.round(valueOfRandomRateName * 100d) / 100d;
                isAnswerCorrect = compareAnswer(formatUserAnswer, formatValueOfRandomRateName);
            } while (!isAnswerCorrect);
            System.out.println("You win the game :)");
        }
    }

    public boolean compareAnswer(double userValue, double apiValue) {

        if (userValue == apiValue) {
            System.out.println("Result is correct");
            return true;
        } else if (userValue > apiValue) {
            System.out.println("Answer is to big. Try with lower value");
            return false;
        }
        System.out.println("Answer is to low. Try with bigger value");
        return false;
    }
}
