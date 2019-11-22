
package com.integration.json.response;

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
    "accountNumber",
    "balanceTransferIndicator",
    "balanceTransferCreditRiskIndicator"
})
public class PartyDetail {

    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("balanceTransferIndicator")
    private String balanceTransferIndicator;
    @JsonProperty("balanceTransferCreditRiskIndicator")
    private String balanceTransferCreditRiskIndicator;
   
    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("balanceTransferIndicator")
    public String getBalanceTransferIndicator() {
        return balanceTransferIndicator;
    }

    @JsonProperty("balanceTransferIndicator")
    public void setBalanceTransferIndicator(String balanceTransferIndicator) {
        this.balanceTransferIndicator = balanceTransferIndicator;
    }

    @JsonProperty("balanceTransferCreditRiskIndicator")
    public String getBalanceTransferCreditRiskIndicator() {
        return balanceTransferCreditRiskIndicator;
    }

    @JsonProperty("balanceTransferCreditRiskIndicator")
    public void setBalanceTransferCreditRiskIndicator(String balanceTransferCreditRiskIndicator) {
        this.balanceTransferCreditRiskIndicator = balanceTransferCreditRiskIndicator;
    }

}
