
package com.integration.json.request;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountNumber",
    "accountIndex",
    "accountType",
    "thankyouPoint",
    "authorizedUserIndicator",
    "selectedAccount",
    "cashbackBalance",
    "currentBalance",
    "cops",
    "alerts",
    "cardsData",
    "cltId",
    "dltId",
    "bcEligibilityIndicator",
    "travelEligibilityIndicator",
    "mobileEligibilityIndicator",
    "transactionData"
})
public class AccountDatum {

    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("accountIndex")
    private String accountIndex;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("thankyouPoint")
    private String thankyouPoint;
    @JsonProperty("authorizedUserIndicator")
    private String authorizedUserIndicator;
    @JsonProperty("selectedAccount")
    private String selectedAccount;
    @JsonProperty("cashbackBalance")
    private Integer cashbackBalance;
    @JsonProperty("currentBalance")
    private Integer currentBalance;
    @JsonProperty("cops")
    private String cops;
    @JsonProperty("alerts")
    private String alerts;
    @JsonProperty("cardsData")
    private CardsData cardsData;
    @JsonProperty("cltId")
    private String cltId;
    @JsonProperty("dltId")
    private String dltId;
    @JsonProperty("bcEligibilityIndicator")
    private String bcEligibilityIndicator;
    @JsonProperty("travelEligibilityIndicator")
    private String travelEligibilityIndicator;
    @JsonProperty("mobileEligibilityIndicator")
    private String mobileEligibilityIndicator;
    @JsonProperty("transactionData")
    private List<Object> transactionData = new ArrayList<Object>();
  
    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("accountIndex")
    public String getAccountIndex() {
        return accountIndex;
    }

    @JsonProperty("accountIndex")
    public void setAccountIndex(String accountIndex) {
        this.accountIndex = accountIndex;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("thankyouPoint")
    public String getThankyouPoint() {
        return thankyouPoint;
    }

    @JsonProperty("thankyouPoint")
    public void setThankyouPoint(String thankyouPoint) {
        this.thankyouPoint = thankyouPoint;
    }

    @JsonProperty("authorizedUserIndicator")
    public String getAuthorizedUserIndicator() {
        return authorizedUserIndicator;
    }

    @JsonProperty("authorizedUserIndicator")
    public void setAuthorizedUserIndicator(String authorizedUserIndicator) {
        this.authorizedUserIndicator = authorizedUserIndicator;
    }

    @JsonProperty("selectedAccount")
    public String getSelectedAccount() {
        return selectedAccount;
    }

    @JsonProperty("selectedAccount")
    public void setSelectedAccount(String selectedAccount) {
        this.selectedAccount = selectedAccount;
    }

    @JsonProperty("cashbackBalance")
    public Integer getCashbackBalance() {
        return cashbackBalance;
    }

    @JsonProperty("cashbackBalance")
    public void setCashbackBalance(Integer cashbackBalance) {
        this.cashbackBalance = cashbackBalance;
    }

    @JsonProperty("currentBalance")
    public Integer getCurrentBalance() {
        return currentBalance;
    }

    @JsonProperty("currentBalance")
    public void setCurrentBalance(Integer currentBalance) {
        this.currentBalance = currentBalance;
    }

    @JsonProperty("cops")
    public String getCops() {
        return cops;
    }

    @JsonProperty("cops")
    public void setCops(String cops) {
        this.cops = cops;
    }

    @JsonProperty("alerts")
    public String getAlerts() {
        return alerts;
    }

    @JsonProperty("alerts")
    public void setAlerts(String alerts) {
        this.alerts = alerts;
    }

    @JsonProperty("cardsData")
    public CardsData getCardsData() {
        return cardsData;
    }

    @JsonProperty("cardsData")
    public void setCardsData(CardsData cardsData) {
        this.cardsData = cardsData;
    }

    @JsonProperty("cltId")
    public String getCltId() {
        return cltId;
    }

    @JsonProperty("cltId")
    public void setCltId(String cltId) {
        this.cltId = cltId;
    }

    @JsonProperty("dltId")
    public String getDltId() {
        return dltId;
    }

    @JsonProperty("dltId")
    public void setDltId(String dltId) {
        this.dltId = dltId;
    }

    @JsonProperty("bcEligibilityIndicator")
    public String getBcEligibilityIndicator() {
        return bcEligibilityIndicator;
    }

    @JsonProperty("bcEligibilityIndicator")
    public void setBcEligibilityIndicator(String bcEligibilityIndicator) {
        this.bcEligibilityIndicator = bcEligibilityIndicator;
    }

    @JsonProperty("travelEligibilityIndicator")
    public String getTravelEligibilityIndicator() {
        return travelEligibilityIndicator;
    }

    @JsonProperty("travelEligibilityIndicator")
    public void setTravelEligibilityIndicator(String travelEligibilityIndicator) {
        this.travelEligibilityIndicator = travelEligibilityIndicator;
    }

    @JsonProperty("mobileEligibilityIndicator")
    public String getMobileEligibilityIndicator() {
        return mobileEligibilityIndicator;
    }

    @JsonProperty("mobileEligibilityIndicator")
    public void setMobileEligibilityIndicator(String mobileEligibilityIndicator) {
        this.mobileEligibilityIndicator = mobileEligibilityIndicator;
    }

    @JsonProperty("transactionData")
    public List<Object> getTransactionData() {
        return transactionData;
    }

    @JsonProperty("transactionData")
    public void setTransactionData(List<Object> transactionData) {
        this.transactionData = transactionData;
    }

}
