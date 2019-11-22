
package com.integration.json.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "monthsToAtpExpiry",
    "monthsSinceAtpExpiry",
    "thankyouViewFlag",
    "siteCatalystId",
    "masterId",
    "mbarNumber",
    "popupCounter",
    "riaMigratedIndicator",
    "citiWalletEnrollmentIndicator",
    "thankyouEnrollmentIndicator",
    "popSplit",
    "firstDb",
    "atpMonths",
    "daysSincelastBrowserLogin",
    "dmpPresent",
    "accountIbsxFlag",
    "paymentAccountIndicator",
    "atpEligibilityIndicator",
    "overlaySessionCount",
    "businessSecuredProductEnrollment",
    "daysSinceBrowserEnrollment",
    "overlayPeriodCount",
    "dmpFlag",
    "cuuid",
    "onboardOverlayShown",
    "deviceId"
})
public class AccountIndicatorForOffer {

    @JsonProperty("monthsToAtpExpiry")
    private Integer monthsToAtpExpiry;
    @JsonProperty("monthsSinceAtpExpiry")
    private Integer monthsSinceAtpExpiry;
    @JsonProperty("thankyouViewFlag")
    private Boolean thankyouViewFlag;
    @JsonProperty("siteCatalystId")
    private String siteCatalystId;
    @JsonProperty("masterId")
    private String masterId;
    @JsonProperty("mbarNumber")
    private Integer mbarNumber;
    @JsonProperty("popupCounter")
    private Integer popupCounter;
    @JsonProperty("riaMigratedIndicator")
    private String riaMigratedIndicator;
    @JsonProperty("citiWalletEnrollmentIndicator")
    private String citiWalletEnrollmentIndicator;
    @JsonProperty("thankyouEnrollmentIndicator")
    private String thankyouEnrollmentIndicator;
    @JsonProperty("popSplit")
    private String popSplit;
    @JsonProperty("firstDb")
    private String firstDb;
    @JsonProperty("atpMonths")
    private Integer atpMonths;
    @JsonProperty("daysSincelastBrowserLogin")
    private Integer daysSincelastBrowserLogin;
    @JsonProperty("dmpPresent")
    private String dmpPresent;
    @JsonProperty("accountIbsxFlag")
    private Boolean accountIbsxFlag;
    @JsonProperty("paymentAccountIndicator")
    private String paymentAccountIndicator;
    @JsonProperty("atpEligibilityIndicator")
    private String atpEligibilityIndicator;
    @JsonProperty("overlaySessionCount")
    private Integer overlaySessionCount;
    @JsonProperty("businessSecuredProductEnrollment")
    private Integer businessSecuredProductEnrollment;
    @JsonProperty("daysSinceBrowserEnrollment")
    private Integer daysSinceBrowserEnrollment;
    @JsonProperty("overlayPeriodCount")
    private Integer overlayPeriodCount;
    @JsonProperty("dmpFlag")
    private Boolean dmpFlag;
    @JsonProperty("cuuid")
    private String cuuid;
    @JsonProperty("onboardOverlayShown")
    private String onboardOverlayShown;
    @JsonProperty("deviceId")
    private String deviceId;
 
    @JsonProperty("monthsToAtpExpiry")
    public Integer getMonthsToAtpExpiry() {
        return monthsToAtpExpiry;
    }

    @JsonProperty("monthsToAtpExpiry")
    public void setMonthsToAtpExpiry(Integer monthsToAtpExpiry) {
        this.monthsToAtpExpiry = monthsToAtpExpiry;
    }

    @JsonProperty("monthsSinceAtpExpiry")
    public Integer getMonthsSinceAtpExpiry() {
        return monthsSinceAtpExpiry;
    }

    @JsonProperty("monthsSinceAtpExpiry")
    public void setMonthsSinceAtpExpiry(Integer monthsSinceAtpExpiry) {
        this.monthsSinceAtpExpiry = monthsSinceAtpExpiry;
    }

    @JsonProperty("thankyouViewFlag")
    public Boolean getThankyouViewFlag() {
        return thankyouViewFlag;
    }

    @JsonProperty("thankyouViewFlag")
    public void setThankyouViewFlag(Boolean thankyouViewFlag) {
        this.thankyouViewFlag = thankyouViewFlag;
    }

    @JsonProperty("siteCatalystId")
    public String getSiteCatalystId() {
        return siteCatalystId;
    }

    @JsonProperty("siteCatalystId")
    public void setSiteCatalystId(String siteCatalystId) {
        this.siteCatalystId = siteCatalystId;
    }

    @JsonProperty("masterId")
    public String getMasterId() {
        return masterId;
    }

    @JsonProperty("masterId")
    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    @JsonProperty("mbarNumber")
    public Integer getMbarNumber() {
        return mbarNumber;
    }

    @JsonProperty("mbarNumber")
    public void setMbarNumber(Integer mbarNumber) {
        this.mbarNumber = mbarNumber;
    }

    @JsonProperty("popupCounter")
    public Integer getPopupCounter() {
        return popupCounter;
    }

    @JsonProperty("popupCounter")
    public void setPopupCounter(Integer popupCounter) {
        this.popupCounter = popupCounter;
    }

    @JsonProperty("riaMigratedIndicator")
    public String getRiaMigratedIndicator() {
        return riaMigratedIndicator;
    }

    @JsonProperty("riaMigratedIndicator")
    public void setRiaMigratedIndicator(String riaMigratedIndicator) {
        this.riaMigratedIndicator = riaMigratedIndicator;
    }

    @JsonProperty("citiWalletEnrollmentIndicator")
    public String getCitiWalletEnrollmentIndicator() {
        return citiWalletEnrollmentIndicator;
    }

    @JsonProperty("citiWalletEnrollmentIndicator")
    public void setCitiWalletEnrollmentIndicator(String citiWalletEnrollmentIndicator) {
        this.citiWalletEnrollmentIndicator = citiWalletEnrollmentIndicator;
    }

    @JsonProperty("thankyouEnrollmentIndicator")
    public String getThankyouEnrollmentIndicator() {
        return thankyouEnrollmentIndicator;
    }

    @JsonProperty("thankyouEnrollmentIndicator")
    public void setThankyouEnrollmentIndicator(String thankyouEnrollmentIndicator) {
        this.thankyouEnrollmentIndicator = thankyouEnrollmentIndicator;
    }

    @JsonProperty("popSplit")
    public String getPopSplit() {
        return popSplit;
    }

    @JsonProperty("popSplit")
    public void setPopSplit(String popSplit) {
        this.popSplit = popSplit;
    }

    @JsonProperty("firstDb")
    public String getFirstDb() {
        return firstDb;
    }

    @JsonProperty("firstDb")
    public void setFirstDb(String firstDb) {
        this.firstDb = firstDb;
    }

    @JsonProperty("atpMonths")
    public Integer getAtpMonths() {
        return atpMonths;
    }

    @JsonProperty("atpMonths")
    public void setAtpMonths(Integer atpMonths) {
        this.atpMonths = atpMonths;
    }

    @JsonProperty("daysSincelastBrowserLogin")
    public Integer getDaysSincelastBrowserLogin() {
        return daysSincelastBrowserLogin;
    }

    @JsonProperty("daysSincelastBrowserLogin")
    public void setDaysSincelastBrowserLogin(Integer daysSincelastBrowserLogin) {
        this.daysSincelastBrowserLogin = daysSincelastBrowserLogin;
    }

    @JsonProperty("dmpPresent")
    public String getDmpPresent() {
        return dmpPresent;
    }

    @JsonProperty("dmpPresent")
    public void setDmpPresent(String dmpPresent) {
        this.dmpPresent = dmpPresent;
    }

    @JsonProperty("accountIbsxFlag")
    public Boolean getAccountIbsxFlag() {
        return accountIbsxFlag;
    }

    @JsonProperty("accountIbsxFlag")
    public void setAccountIbsxFlag(Boolean accountIbsxFlag) {
        this.accountIbsxFlag = accountIbsxFlag;
    }

    @JsonProperty("paymentAccountIndicator")
    public String getPaymentAccountIndicator() {
        return paymentAccountIndicator;
    }

    @JsonProperty("paymentAccountIndicator")
    public void setPaymentAccountIndicator(String paymentAccountIndicator) {
        this.paymentAccountIndicator = paymentAccountIndicator;
    }

    @JsonProperty("atpEligibilityIndicator")
    public String getAtpEligibilityIndicator() {
        return atpEligibilityIndicator;
    }

    @JsonProperty("atpEligibilityIndicator")
    public void setAtpEligibilityIndicator(String atpEligibilityIndicator) {
        this.atpEligibilityIndicator = atpEligibilityIndicator;
    }

    @JsonProperty("overlaySessionCount")
    public Integer getOverlaySessionCount() {
        return overlaySessionCount;
    }

    @JsonProperty("overlaySessionCount")
    public void setOverlaySessionCount(Integer overlaySessionCount) {
        this.overlaySessionCount = overlaySessionCount;
    }

    @JsonProperty("businessSecuredProductEnrollment")
    public Integer getBusinessSecuredProductEnrollment() {
        return businessSecuredProductEnrollment;
    }

    @JsonProperty("businessSecuredProductEnrollment")
    public void setBusinessSecuredProductEnrollment(Integer businessSecuredProductEnrollment) {
        this.businessSecuredProductEnrollment = businessSecuredProductEnrollment;
    }

    @JsonProperty("daysSinceBrowserEnrollment")
    public Integer getDaysSinceBrowserEnrollment() {
        return daysSinceBrowserEnrollment;
    }

    @JsonProperty("daysSinceBrowserEnrollment")
    public void setDaysSinceBrowserEnrollment(Integer daysSinceBrowserEnrollment) {
        this.daysSinceBrowserEnrollment = daysSinceBrowserEnrollment;
    }

    @JsonProperty("overlayPeriodCount")
    public Integer getOverlayPeriodCount() {
        return overlayPeriodCount;
    }

    @JsonProperty("overlayPeriodCount")
    public void setOverlayPeriodCount(Integer overlayPeriodCount) {
        this.overlayPeriodCount = overlayPeriodCount;
    }

    @JsonProperty("dmpFlag")
    public Boolean getDmpFlag() {
        return dmpFlag;
    }

    @JsonProperty("dmpFlag")
    public void setDmpFlag(Boolean dmpFlag) {
        this.dmpFlag = dmpFlag;
    }

    @JsonProperty("cuuid")
    public String getCuuid() {
        return cuuid;
    }

    @JsonProperty("cuuid")
    public void setCuuid(String cuuid) {
        this.cuuid = cuuid;
    }

    @JsonProperty("onboardOverlayShown")
    public String getOnboardOverlayShown() {
        return onboardOverlayShown;
    }

    @JsonProperty("onboardOverlayShown")
    public void setOnboardOverlayShown(String onboardOverlayShown) {
        this.onboardOverlayShown = onboardOverlayShown;
    }

    @JsonProperty("deviceId")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("deviceId")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

}
