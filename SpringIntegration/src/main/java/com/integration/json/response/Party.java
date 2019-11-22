
package com.integration.json.response;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.integration.json.request.Account;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerId",
    "account",
    "cardNumber",
    "partyDetails"
})
public class Party {

    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("account")
    private List<Account> account = new ArrayList<Account>();
    @JsonProperty("cardNumber")
    private String cardNumber;
    @JsonProperty("partyDetails")
    private List<PartyDetail> partyDetails = new ArrayList<PartyDetail>();
   
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

    @JsonProperty("cardNumber")
    public String getCardNumber() {
        return cardNumber;
    }

    @JsonProperty("cardNumber")
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @JsonProperty("partyDetails")
    public List<PartyDetail> getPartyDetails() {
        return partyDetails;
    }

    @JsonProperty("partyDetails")
    public void setPartyDetails(List<PartyDetail> partyDetails) {
        this.partyDetails = partyDetails;
    }

}
