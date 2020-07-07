package pl.brych.spring_currency_game.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "amount",
        "base",
        "date",
        "rates"
})
public class ExchangeRates {

    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("base")
    private String base;
    @JsonProperty("date")
    private String date;
    @JsonProperty("rates")
    private Map<String, Double> rates;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
