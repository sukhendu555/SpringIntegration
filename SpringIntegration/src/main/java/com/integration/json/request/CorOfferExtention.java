
package com.integration.json.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "feedback",
    "specialOfferCode",
    "balcon",
    "dynamicOfferEngine",
    "ced",
    "rat",
    "maxFeedback",
    "maxSoc",
    "maxBalcon",
    "maxDoe",
    "maxCed",
    "accountIndicatorForOffers",
    "accountData",
    "corData",
    "location",
    "event",
    "screenId",
    "languageId",
    "relationship"
})
public class CorOfferExtention {

    @JsonProperty("feedback")
    private String feedback;
    @JsonProperty("specialOfferCode")
    private String specialOfferCode;
    @JsonProperty("balcon")
    private String balcon;
    @JsonProperty("dynamicOfferEngine")
    private String dynamicOfferEngine;
    @JsonProperty("ced")
    private String ced;
    @JsonProperty("rat")
    private String rat;
    @JsonProperty("maxFeedback")
    private Integer maxFeedback;
    @JsonProperty("maxSoc")
    private Integer maxSoc;
    @JsonProperty("maxBalcon")
    private Integer maxBalcon;
    @JsonProperty("maxDoe")
    private Integer maxDoe;
    @JsonProperty("maxCed")
    private Integer maxCed;
    @JsonProperty("accountIndicatorForOffers")
    private List<AccountIndicatorForOffer> accountIndicatorForOffers = new ArrayList<AccountIndicatorForOffer>();
    @JsonProperty("accountData")
    private List<AccountDatum> accountData = new ArrayList<AccountDatum>();
    @JsonProperty("corData")
    private List<CorDatum> corData = new ArrayList<CorDatum>();
    @JsonProperty("location")
    private List<Location> location = new ArrayList<Location>();
    @JsonProperty("event")
    private String event;
    @JsonProperty("screenId")
    private String screenId;
    @JsonProperty("languageId")
    private String languageId;
    @JsonProperty("relationship")
    private String relationship;
   
    @JsonProperty("feedback")
    public String getFeedback() {
        return feedback;
    }

    @JsonProperty("feedback")
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @JsonProperty("specialOfferCode")
    public String getSpecialOfferCode() {
        return specialOfferCode;
    }

    @JsonProperty("specialOfferCode")
    public void setSpecialOfferCode(String specialOfferCode) {
        this.specialOfferCode = specialOfferCode;
    }

    @JsonProperty("balcon")
    public String getBalcon() {
        return balcon;
    }

    @JsonProperty("balcon")
    public void setBalcon(String balcon) {
        this.balcon = balcon;
    }

    @JsonProperty("dynamicOfferEngine")
    public String getDynamicOfferEngine() {
        return dynamicOfferEngine;
    }

    @JsonProperty("dynamicOfferEngine")
    public void setDynamicOfferEngine(String dynamicOfferEngine) {
        this.dynamicOfferEngine = dynamicOfferEngine;
    }

    @JsonProperty("ced")
    public String getCed() {
        return ced;
    }

    @JsonProperty("ced")
    public void setCed(String ced) {
        this.ced = ced;
    }

    @JsonProperty("rat")
    public String getRat() {
        return rat;
    }

    @JsonProperty("rat")
    public void setRat(String rat) {
        this.rat = rat;
    }

    @JsonProperty("maxFeedback")
    public Integer getMaxFeedback() {
        return maxFeedback;
    }

    @JsonProperty("maxFeedback")
    public void setMaxFeedback(Integer maxFeedback) {
        this.maxFeedback = maxFeedback;
    }

    @JsonProperty("maxSoc")
    public Integer getMaxSoc() {
        return maxSoc;
    }

    @JsonProperty("maxSoc")
    public void setMaxSoc(Integer maxSoc) {
        this.maxSoc = maxSoc;
    }

    @JsonProperty("maxBalcon")
    public Integer getMaxBalcon() {
        return maxBalcon;
    }

    @JsonProperty("maxBalcon")
    public void setMaxBalcon(Integer maxBalcon) {
        this.maxBalcon = maxBalcon;
    }

    @JsonProperty("maxDoe")
    public Integer getMaxDoe() {
        return maxDoe;
    }

    @JsonProperty("maxDoe")
    public void setMaxDoe(Integer maxDoe) {
        this.maxDoe = maxDoe;
    }

    @JsonProperty("maxCed")
    public Integer getMaxCed() {
        return maxCed;
    }

    @JsonProperty("maxCed")
    public void setMaxCed(Integer maxCed) {
        this.maxCed = maxCed;
    }

    @JsonProperty("accountIndicatorForOffers")
    public List<AccountIndicatorForOffer> getAccountIndicatorForOffers() {
        return accountIndicatorForOffers;
    }

    @JsonProperty("accountIndicatorForOffers")
    public void setAccountIndicatorForOffers(List<AccountIndicatorForOffer> accountIndicatorForOffers) {
        this.accountIndicatorForOffers = accountIndicatorForOffers;
    }

    @JsonProperty("accountData")
    public List<AccountDatum> getAccountData() {
        return accountData;
    }

    @JsonProperty("accountData")
    public void setAccountData(List<AccountDatum> accountData) {
        this.accountData = accountData;
    }

    @JsonProperty("corData")
    public List<CorDatum> getCorData() {
        return corData;
    }

    @JsonProperty("corData")
    public void setCorData(List<CorDatum> corData) {
        this.corData = corData;
    }

    @JsonProperty("location")
    public List<Location> getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(List<Location> location) {
        this.location = location;
    }

    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    @JsonProperty("screenId")
    public String getScreenId() {
        return screenId;
    }

    @JsonProperty("screenId")
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    @JsonProperty("languageId")
    public String getLanguageId() {
        return languageId;
    }

    @JsonProperty("languageId")
    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    @JsonProperty("relationship")
    public String getRelationship() {
        return relationship;
    }

    @JsonProperty("relationship")
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
