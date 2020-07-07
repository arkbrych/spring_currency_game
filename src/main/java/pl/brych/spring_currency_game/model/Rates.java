package pl.brych.spring_currency_game.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Rates {

    @JsonProperty("AUD")
    private Double aUD;
    @JsonProperty("BGN")
    private Double bGN;
    @JsonProperty("BRL")
    private Double bRL;
    @JsonProperty("CAD")
    private Double cAD;
    @JsonProperty("CHF")
    private Double cHF;
    @JsonProperty("CNY")
    private Double cNY;
    @JsonProperty("CZK")
    private Double cZK;
    @JsonProperty("DKK")
    private Double dKK;
    @JsonProperty("EUR")
    private Double eUR;
    @JsonProperty("GBP")
    private Double gBP;
    @JsonProperty("HKD")
    private Double hKD;
    @JsonProperty("HRK")
    private Double hRK;
    @JsonProperty("HUF")
    private Double hUF;
    @JsonProperty("IDR")
    private Double iDR;
    @JsonProperty("ILS")
    private Double iLS;
    @JsonProperty("INR")
    private Double iNR;
    @JsonProperty("ISK")
    private Double iSK;
    @JsonProperty("JPY")
    private Double jPY;
    @JsonProperty("KRW")
    private Double kRW;
    @JsonProperty("MXN")
    private Double mXN;
    @JsonProperty("MYR")
    private Double mYR;
    @JsonProperty("NOK")
    private Double nOK;
    @JsonProperty("NZD")
    private Double nZD;
    @JsonProperty("PHP")
    private Double pHP;
    @JsonProperty("RON")
    private Double rON;
    @JsonProperty("RUB")
    private Double rUB;
    @JsonProperty("SEK")
    private Double sEK;
    @JsonProperty("SGD")
    private Double sGD;
    @JsonProperty("THB")
    private Double tHB;
    @JsonProperty("TRY")
    private Double tRY;
    @JsonProperty("USD")
    private Double uSD;
    @JsonProperty("ZAR")
    private Double zAR;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
