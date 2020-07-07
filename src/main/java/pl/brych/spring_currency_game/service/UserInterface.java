package pl.brych.spring_currency_game.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class UserInterface {

    private RandomRate randomRate;
    private ObjectMapper objectMapper;
    private JsonNode jsonNode;

    public UserInterface() {
        randomRate = new RandomRate();
        objectMapper = new ObjectMapper();
    }

    public void showOptions(String ratesValuesFromApi) throws JsonProcessingException {
        getRatesAsJasonNode(ratesValuesFromApi);
        System.out.println("Base currency is " + jsonNode.get("base"));
        String randomRateName = randomRate.getRandomRate();
        double valueOfRandomRateName = jsonNode.at("/rates/" + randomRateName).asDouble();
//        Uncomment below to start cheat mode
//        System.out.println("Value of currency " + valueOfRandomRateName);
        compareUserInput(valueOfRandomRateName);
    }

    public void getRatesAsJasonNode(String ratesValuesFromApi) throws JsonProcessingException {
        System.out.println("JSON as String = " + ratesValuesFromApi);
        jsonNode = objectMapper.readTree(ratesValuesFromApi);
    }

    public void compareUserInput(double valueOfRandomRateName) {
        double userAnswer;
        boolean isAnswerCorrect;
        try (Scanner userInput = new Scanner(System.in)) {

            do {
                System.out.println("Write number ");
                userAnswer = userInput.nextDouble();
                isAnswerCorrect = compareAnswer(userAnswer, valueOfRandomRateName);
            } while (!isAnswerCorrect);
            System.out.println("You win game :)");
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
