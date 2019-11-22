
package com.integration.json.request;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "frPNCNAccountNumber",
    "accountNumber"
})
public class CorDatum {

    @JsonProperty("frPNCNAccountNumber")
    private String frPNCNAccountNumber;
    @JsonProperty("accountNumber")
    private String accountNumber;
   
    @JsonProperty("frPNCNAccountNumber")
    public String getFrPNCNAccountNumber() {
        return frPNCNAccountNumber;
    }

    @JsonProperty("frPNCNAccountNumber")
    public void setFrPNCNAccountNumber(String frPNCNAccountNumber) {
        this.frPNCNAccountNumber = frPNCNAccountNumber;
    }

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
