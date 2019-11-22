
package com.integration.json.request;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cardAccountNumber",
    "customerId",
    "account"
})
public class Party {

    @JsonProperty("cardAccountNumber")
    private String cardAccountNumber;
    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("account")
    private List<Account> account = new ArrayList<Account>();
   
    @JsonProperty("cardAccountNumber")
    public String getCardAccountNumber() {
        return cardAccountNumber;
    }

    @JsonProperty("cardAccountNumber")
    public void setCardAccountNumber(String cardAccountNumber) {
        this.cardAccountNumber = cardAccountNumber;
    }

    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("account")
    public List<Account> getAccount() {
        return account;
    }

    @JsonProperty("account")
    public void setAccount(List<Account> account) {
        this.account = account;
    }
}
