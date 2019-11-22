
package com.integration.json.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productCode",
    "gotoProductCode",
    "rewardsAccountIndicator",
    "mobileIndicator",
    "benefitBuilderIndicator",
    "thankYouIndicator",
    "atpEligibilityIndicator",
    "cashAccessEligibilityIndicator",
    "plet",
    "totalBalance",
    "creditLimit",
    "lastAmountPaid",
    "lastPurchaseDate",
    "openToBuy",
    "creditLimitChangeDate",
    "statusCode",
    "vanEligibilityIndicator",
    "vanEnrollmentIndicator",
    "daysDelinquent",
    "expiryDate",
    "hotCardIndicator",
    "statementReasonCode",
    "cpEnrollmentIndicator",
    "plasticIssueReason",
    "referCode",
    "plasticIssueDate",
    "cliIndicator",
    "allEIndicator",
    "autoPayEnrollmentIndicator",
    "mailState",
    "sharedLineIndicator",
    "atpIncomeUpdateDate",
    "motOfferKey",
    "emailUsabilityIndicator",
    "monthsOnBooks",
    "noPresetSpendLimitIndicator",
    "memberDate",
    "purchaseApr",
    "bcEligibilityIndicator",
    "travelEligibilityIndicator",
    "mobileEligibilityIndicator",
    "birthDate",
    "emvEligibilityIndicator",
    "cityState",
    "plasticChipIndicator",
    "totalRewardsPointsAsOfLastStmt",
    "accumulationType",
    "vanEnrollmentDate",
    "lastMobileAppAccessDate",
    "pcliPendingApprovalAmount",
    "walletEligibilityIndicator",
    "physicalCity",
    "ranEligibilityIndicator",
    "autoPayAmount",
    "cop",
    "processingSiteSystemVariable",
    "attRewardsIndicator",
    "icliOfferIndicator",
    "citiWalletEligibilityIndicator",
    "ratSaleOffer",
    "accountIbsxFlag",
    "familyIndicator",
    "partnerStateUs",
    "availablePoints",
    "daysSinceActivation",
    "ficoScore",
    "balanceTransferCreditRiskFlag",
    "seniorPublicFigureFlag",
    "flexPayIndicator",
    "citiFlexLoanIndicator",
    "primaryAccountHolderFlag",
    "alert"
})
public class CardsData {

    @JsonProperty("productCode")
    private String productCode;
    @JsonProperty("gotoProductCode")
    private String gotoProductCode;
    @JsonProperty("rewardsAccountIndicator")
    private String rewardsAccountIndicator;
    @JsonProperty("mobileIndicator")
    private String mobileIndicator;
    @JsonProperty("benefitBuilderIndicator")
    private String benefitBuilderIndicator;
    @JsonProperty("thankYouIndicator")
    private String thankYouIndicator;
    @JsonProperty("atpEligibilityIndicator")
    private String atpEligibilityIndicator;
    @JsonProperty("cashAccessEligibilityIndicator")
    private String cashAccessEligibilityIndicator;
    @JsonProperty("plet")
    private String plet;
    @JsonProperty("totalBalance")
    private Double totalBalance;
    @JsonProperty("creditLimit")
    private Integer creditLimit;
    @JsonProperty("lastAmountPaid")
    private Double lastAmountPaid;
    @JsonProperty("lastPurchaseDate")
    private String lastPurchaseDate;
    @JsonProperty("openToBuy")
    private Double openToBuy;
    @JsonProperty("creditLimitChangeDate")
    private String creditLimitChangeDate;
    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("vanEligibilityIndicator")
    private String vanEligibilityIndicator;
    @JsonProperty("vanEnrollmentIndicator")
    private String vanEnrollmentIndicator;
    @JsonProperty("daysDelinquent")
    private String daysDelinquent;
    @JsonProperty("expiryDate")
    private String expiryDate;
    @JsonProperty("hotCardIndicator")
    private Integer hotCardIndicator;
    @JsonProperty("statementReasonCode")
    private String statementReasonCode;
    @JsonProperty("cpEnrollmentIndicator")
    private String cpEnrollmentIndicator;
    @JsonProperty("plasticIssueReason")
    private String plasticIssueReason;
    @JsonProperty("referCode")
    private String referCode;
    @JsonProperty("plasticIssueDate")
    private String plasticIssueDate;
    @JsonProperty("cliIndicator")
    private String cliIndicator;
    @JsonProperty("allEIndicator")
    private String allEIndicator;
    @JsonProperty("autoPayEnrollmentIndicator")
    private String autoPayEnrollmentIndicator;
    @JsonProperty("mailState")
    private String mailState;
    @JsonProperty("sharedLineIndicator")
    private String sharedLineIndicator;
    @JsonProperty("atpIncomeUpdateDate")
    private String atpIncomeUpdateDate;
    @JsonProperty("motOfferKey")
    private String motOfferKey;
    @JsonProperty("emailUsabilityIndicator")
    private String emailUsabilityIndicator;
    @JsonProperty("monthsOnBooks")
    private String monthsOnBooks;
    @JsonProperty("noPresetSpendLimitIndicator")
    private String noPresetSpendLimitIndicator;
    @JsonProperty("memberDate")
    private String memberDate;
    @JsonProperty("purchaseApr")
    private Double purchaseApr;
    @JsonProperty("bcEligibilityIndicator")
    private String bcEligibilityIndicator;
    @JsonProperty("travelEligibilityIndicator")
    private String travelEligibilityIndicator;
    @JsonProperty("mobileEligibilityIndicator")
    private String mobileEligibilityIndicator;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("emvEligibilityIndicator")
    private String emvEligibilityIndicator;
    @JsonProperty("cityState")
    private String cityState;
    @JsonProperty("plasticChipIndicator")
    private String plasticChipIndicator;
    @JsonProperty("totalRewardsPointsAsOfLastStmt")
    private Integer totalRewardsPointsAsOfLastStmt;
    @JsonProperty("accumulationType")
    private String accumulationType;
    @JsonProperty("vanEnrollmentDate")
    private String vanEnrollmentDate;
    @JsonProperty("lastMobileAppAccessDate")
    private String lastMobileAppAccessDate;
    @JsonProperty("pcliPendingApprovalAmount")
    private Integer pcliPendingApprovalAmount;
    @JsonProperty("walletEligibilityIndicator")
    private String walletEligibilityIndicator;
    @JsonProperty("physicalCity")
    private String physicalCity;
    @JsonProperty("ranEligibilityIndicator")
    private String ranEligibilityIndicator;
    @JsonProperty("autoPayAmount")
    private Integer autoPayAmount;
    @JsonProperty("cop")
    private String cop;
    @JsonProperty("processingSiteSystemVariable")
    private String processingSiteSystemVariable;
    @JsonProperty("attRewardsIndicator")
    private String attRewardsIndicator;
    @JsonProperty("icliOfferIndicator")
    private String icliOfferIndicator;
    @JsonProperty("citiWalletEligibilityIndicator")
    private String citiWalletEligibilityIndicator;
    @JsonProperty("ratSaleOffer")
    private String ratSaleOffer;
    @JsonProperty("accountIbsxFlag")
    private Boolean accountIbsxFlag;
    @JsonProperty("familyIndicator")
    private String familyIndicator;
    @JsonProperty("partnerStateUs")
    private String partnerStateUs;
    @JsonProperty("availablePoints")
    private Integer availablePoints;
    @JsonProperty("daysSinceActivation")
    private Integer daysSinceActivation;
    @JsonProperty("ficoScore")
    private Integer ficoScore;
    @JsonProperty("balanceTransferCreditRiskFlag")
    private Boolean balanceTransferCreditRiskFlag;
    @JsonProperty("seniorPublicFigureFlag")
    private Boolean seniorPublicFigureFlag;
    @JsonProperty("flexPayIndicator")
    private String flexPayIndicator;
    @JsonProperty("citiFlexLoanIndicator")
    private String citiFlexLoanIndicator;
    @JsonProperty("primaryAccountHolderFlag")
    private Boolean primaryAccountHolderFlag;
    @JsonProperty("alert")
    private String alert;
  
    @JsonProperty("productCode")
    public String getProductCode() {
        return productCode;
    }

    @JsonProperty("productCode")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @JsonProperty("gotoProductCode")
    public String getGotoProductCode() {
        return gotoProductCode;
    }

    @JsonProperty("gotoProductCode")
    public void setGotoProductCode(String gotoProductCode) {
        this.gotoProductCode = gotoProductCode;
    }

    @JsonProperty("rewardsAccountIndicator")
    public String getRewardsAccountIndicator() {
        return rewardsAccountIndicator;
    }

    @JsonProperty("rewardsAccountIndicator")
    public void setRewardsAccountIndicator(String rewardsAccountIndicator) {
        this.rewardsAccountIndicator = rewardsAccountIndicator;
    }

    @JsonProperty("mobileIndicator")
    public String getMobileIndicator() {
        return mobileIndicator;
    }

    @JsonProperty("mobileIndicator")
    public void setMobileIndicator(String mobileIndicator) {
        this.mobileIndicator = mobileIndicator;
    }

    @JsonProperty("benefitBuilderIndicator")
    public String getBenefitBuilderIndicator() {
        return benefitBuilderIndicator;
    }

    @JsonProperty("benefitBuilderIndicator")
    public void setBenefitBuilderIndicator(String benefitBuilderIndicator) {
        this.benefitBuilderIndicator = benefitBuilderIndicator;
    }

    @JsonProperty("thankYouIndicator")
    public String getThankYouIndicator() {
        return thankYouIndicator;
    }

    @JsonProperty("thankYouIndicator")
    public void setThankYouIndicator(String thankYouIndicator) {
        this.thankYouIndicator = thankYouIndicator;
    }

    @JsonProperty("atpEligibilityIndicator")
    public String getAtpEligibilityIndicator() {
        return atpEligibilityIndicator;
    }

    @JsonProperty("atpEligibilityIndicator")
    public void setAtpEligibilityIndicator(String atpEligibilityIndicator) {
        this.atpEligibilityIndicator = atpEligibilityIndicator;
    }

    @JsonProperty("cashAccessEligibilityIndicator")
    public String getCashAccessEligibilityIndicator() {
        return cashAccessEligibilityIndicator;
    }

    @JsonProperty("cashAccessEligibilityIndicator")
    public void setCashAccessEligibilityIndicator(String cashAccessEligibilityIndicator) {
        this.cashAccessEligibilityIndicator = cashAccessEligibilityIndicator;
    }

    @JsonProperty("plet")
    public String getPlet() {
        return plet;
    }

    @JsonProperty("plet")
    public void setPlet(String plet) {
        this.plet = plet;
    }

    @JsonProperty("totalBalance")
    public Double getTotalBalance() {
        return totalBalance;
    }

    @JsonProperty("totalBalance")
    public void setTotalBalance(Double totalBalance) {
        this.totalBalance = totalBalance;
    }

    @JsonProperty("creditLimit")
    public Integer getCreditLimit() {
        return creditLimit;
    }

    @JsonProperty("creditLimit")
    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    @JsonProperty("lastAmountPaid")
    public Double getLastAmountPaid() {
        return lastAmountPaid;
    }

    @JsonProperty("lastAmountPaid")
    public void setLastAmountPaid(Double lastAmountPaid) {
        this.lastAmountPaid = lastAmountPaid;
    }

    @JsonProperty("lastPurchaseDate")
    public String getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    @JsonProperty("lastPurchaseDate")
    public void setLastPurchaseDate(String lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
    }

    @JsonProperty("openToBuy")
    public Double getOpenToBuy() {
        return openToBuy;
    }

    @JsonProperty("openToBuy")
    public void setOpenToBuy(Double openToBuy) {
        this.openToBuy = openToBuy;
    }

    @JsonProperty("creditLimitChangeDate")
    public String getCreditLimitChangeDate() {
        return creditLimitChangeDate;
    }

    @JsonProperty("creditLimitChangeDate")
    public void setCreditLimitChangeDate(String creditLimitChangeDate) {
        this.creditLimitChangeDate = creditLimitChangeDate;
    }

    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("vanEligibilityIndicator")
    public String getVanEligibilityIndicator() {
        return vanEligibilityIndicator;
    }

    @JsonProperty("vanEligibilityIndicator")
    public void setVanEligibilityIndicator(String vanEligibilityIndicator) {
        this.vanEligibilityIndicator = vanEligibilityIndicator;
    }

    @JsonProperty("vanEnrollmentIndicator")
    public String getVanEnrollmentIndicator() {
        return vanEnrollmentIndicator;
    }

    @JsonProperty("vanEnrollmentIndicator")
    public void setVanEnrollmentIndicator(String vanEnrollmentIndicator) {
        this.vanEnrollmentIndicator = vanEnrollmentIndicator;
    }

    @JsonProperty("daysDelinquent")
    public String getDaysDelinquent() {
        return daysDelinquent;
    }

    @JsonProperty("daysDelinquent")
    public void setDaysDelinquent(String daysDelinquent) {
        this.daysDelinquent = daysDelinquent;
    }

    @JsonProperty("expiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("expiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("hotCardIndicator")
    public Integer getHotCardIndicator() {
        return hotCardIndicator;
    }

    @JsonProperty("hotCardIndicator")
    public void setHotCardIndicator(Integer hotCardIndicator) {
        this.hotCardIndicator = hotCardIndicator;
    }

    @JsonProperty("statementReasonCode")
    public String getStatementReasonCode() {
        return statementReasonCode;
    }

    @JsonProperty("statementReasonCode")
    public void setStatementReasonCode(String statementReasonCode) {
        this.statementReasonCode = statementReasonCode;
    }

    @JsonProperty("cpEnrollmentIndicator")
    public String getCpEnrollmentIndicator() {
        return cpEnrollmentIndicator;
    }

    @JsonProperty("cpEnrollmentIndicator")
    public void setCpEnrollmentIndicator(String cpEnrollmentIndicator) {
        this.cpEnrollmentIndicator = cpEnrollmentIndicator;
    }

    @JsonProperty("plasticIssueReason")
    public String getPlasticIssueReason() {
        return plasticIssueReason;
    }

    @JsonProperty("plasticIssueReason")
    public void setPlasticIssueReason(String plasticIssueReason) {
        this.plasticIssueReason = plasticIssueReason;
    }

    @JsonProperty("referCode")
    public String getReferCode() {
        return referCode;
    }

    @JsonProperty("referCode")
    public void setReferCode(String referCode) {
        this.referCode = referCode;
    }

    @JsonProperty("plasticIssueDate")
    public String getPlasticIssueDate() {
        return plasticIssueDate;
    }

    @JsonProperty("plasticIssueDate")
    public void setPlasticIssueDate(String plasticIssueDate) {
        this.plasticIssueDate = plasticIssueDate;
    }

    @JsonProperty("cliIndicator")
    public String getCliIndicator() {
        return cliIndicator;
    }

    @JsonProperty("cliIndicator")
    public void setCliIndicator(String cliIndicator) {
        this.cliIndicator = cliIndicator;
    }

    @JsonProperty("allEIndicator")
    public String getAllEIndicator() {
        return allEIndicator;
    }

    @JsonProperty("allEIndicator")
    public void setAllEIndicator(String allEIndicator) {
        this.allEIndicator = allEIndicator;
    }

    @JsonProperty("autoPayEnrollmentIndicator")
    public String getAutoPayEnrollmentIndicator() {
        return autoPayEnrollmentIndicator;
    }

    @JsonProperty("autoPayEnrollmentIndicator")
    public void setAutoPayEnrollmentIndicator(String autoPayEnrollmentIndicator) {
        this.autoPayEnrollmentIndicator = autoPayEnrollmentIndicator;
    }

    @JsonProperty("mailState")
    public String getMailState() {
        return mailState;
    }

    @JsonProperty("mailState")
    public void setMailState(String mailState) {
        this.mailState = mailState;
    }

    @JsonProperty("sharedLineIndicator")
    public String getSharedLineIndicator() {
        return sharedLineIndicator;
    }

    @JsonProperty("sharedLineIndicator")
    public void setSharedLineIndicator(String sharedLineIndicator) {
        this.sharedLineIndicator = sharedLineIndicator;
    }

    @JsonProperty("atpIncomeUpdateDate")
    public String getAtpIncomeUpdateDate() {
        return atpIncomeUpdateDate;
    }

    @JsonProperty("atpIncomeUpdateDate")
    public void setAtpIncomeUpdateDate(String atpIncomeUpdateDate) {
        this.atpIncomeUpdateDate = atpIncomeUpdateDate;
    }

    @JsonProperty("motOfferKey")
    public String getMotOfferKey() {
        return motOfferKey;
    }

    @JsonProperty("motOfferKey")
    public void setMotOfferKey(String motOfferKey) {
        this.motOfferKey = motOfferKey;
    }

    @JsonProperty("emailUsabilityIndicator")
    public String getEmailUsabilityIndicator() {
        return emailUsabilityIndicator;
    }

    @JsonProperty("emailUsabilityIndicator")
    public void setEmailUsabilityIndicator(String emailUsabilityIndicator) {
        this.emailUsabilityIndicator = emailUsabilityIndicator;
    }

    @JsonProperty("monthsOnBooks")
    public String getMonthsOnBooks() {
        return monthsOnBooks;
    }

    @JsonProperty("monthsOnBooks")
    public void setMonthsOnBooks(String monthsOnBooks) {
        this.monthsOnBooks = monthsOnBooks;
    }

    @JsonProperty("noPresetSpendLimitIndicator")
    public String getNoPresetSpendLimitIndicator() {
        return noPresetSpendLimitIndicator;
    }

    @JsonProperty("noPresetSpendLimitIndicator")
    public void setNoPresetSpendLimitIndicator(String noPresetSpendLimitIndicator) {
        this.noPresetSpendLimitIndicator = noPresetSpendLimitIndicator;
    }

    @JsonProperty("memberDate")
    public String getMemberDate() {
        return memberDate;
    }

    @JsonProperty("memberDate")
    public void setMemberDate(String memberDate) {
        this.memberDate = memberDate;
    }

    @JsonProperty("purchaseApr")
    public Double getPurchaseApr() {
        return purchaseApr;
    }

    @JsonProperty("purchaseApr")
    public void setPurchaseApr(Double purchaseApr) {
        this.purchaseApr = purchaseApr;
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

    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("emvEligibilityIndicator")
    public String getEmvEligibilityIndicator() {
        return emvEligibilityIndicator;
    }

    @JsonProperty("emvEligibilityIndicator")
    public void setEmvEligibilityIndicator(String emvEligibilityIndicator) {
        this.emvEligibilityIndicator = emvEligibilityIndicator;
    }

    @JsonProperty("cityState")
    public String getCityState() {
        return cityState;
    }

    @JsonProperty("cityState")
    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    @JsonProperty("plasticChipIndicator")
    public String getPlasticChipIndicator() {
        return plasticChipIndicator;
    }

    @JsonProperty("plasticChipIndicator")
    public void setPlasticChipIndicator(String plasticChipIndicator) {
        this.plasticChipIndicator = plasticChipIndicator;
    }

    @JsonProperty("totalRewardsPointsAsOfLastStmt")
    public Integer getTotalRewardsPointsAsOfLastStmt() {
        return totalRewardsPointsAsOfLastStmt;
    }

    @JsonProperty("totalRewardsPointsAsOfLastStmt")
    public void setTotalRewardsPointsAsOfLastStmt(Integer totalRewardsPointsAsOfLastStmt) {
        this.totalRewardsPointsAsOfLastStmt = totalRewardsPointsAsOfLastStmt;
    }

    @JsonProperty("accumulationType")
    public String getAccumulationType() {
        return accumulationType;
    }

    @JsonProperty("accumulationType")
    public void setAccumulationType(String accumulationType) {
        this.accumulationType = accumulationType;
    }

    @JsonProperty("vanEnrollmentDate")
    public String getVanEnrollmentDate() {
        return vanEnrollmentDate;
    }

    @JsonProperty("vanEnrollmentDate")
    public void setVanEnrollmentDate(String vanEnrollmentDate) {
        this.vanEnrollmentDate = vanEnrollmentDate;
    }

    @JsonProperty("lastMobileAppAccessDate")
    public String getLastMobileAppAccessDate() {
        return lastMobileAppAccessDate;
    }

    @JsonProperty("lastMobileAppAccessDate")
    public void setLastMobileAppAccessDate(String lastMobileAppAccessDate) {
        this.lastMobileAppAccessDate = lastMobileAppAccessDate;
    }

    @JsonProperty("pcliPendingApprovalAmount")
    public Integer getPcliPendingApprovalAmount() {
        return pcliPendingApprovalAmount;
    }

    @JsonProperty("pcliPendingApprovalAmount")
    public void setPcliPendingApprovalAmount(Integer pcliPendingApprovalAmount) {
        this.pcliPendingApprovalAmount = pcliPendingApprovalAmount;
    }

    @JsonProperty("walletEligibilityIndicator")
    public String getWalletEligibilityIndicator() {
        return walletEligibilityIndicator;
    }

    @JsonProperty("walletEligibilityIndicator")
    public void setWalletEligibilityIndicator(String walletEligibilityIndicator) {
        this.walletEligibilityIndicator = walletEligibilityIndicator;
    }

    @JsonProperty("physicalCity")
    public String getPhysicalCity() {
        return physicalCity;
    }

    @JsonProperty("physicalCity")
    public void setPhysicalCity(String physicalCity) {
        this.physicalCity = physicalCity;
    }

    @JsonProperty("ranEligibilityIndicator")
    public String getRanEligibilityIndicator() {
        return ranEligibilityIndicator;
    }

    @JsonProperty("ranEligibilityIndicator")
    public void setRanEligibilityIndicator(String ranEligibilityIndicator) {
        this.ranEligibilityIndicator = ranEligibilityIndicator;
    }

    @JsonProperty("autoPayAmount")
    public Integer getAutoPayAmount() {
        return autoPayAmount;
    }

    @JsonProperty("autoPayAmount")
    public void setAutoPayAmount(Integer autoPayAmount) {
        this.autoPayAmount = autoPayAmount;
    }

    @JsonProperty("cop")
    public String getCop() {
        return cop;
    }

    @JsonProperty("cop")
    public void setCop(String cop) {
        this.cop = cop;
    }

    @JsonProperty("processingSiteSystemVariable")
    public String getProcessingSiteSystemVariable() {
        return processingSiteSystemVariable;
    }

    @JsonProperty("processingSiteSystemVariable")
    public void setProcessingSiteSystemVariable(String processingSiteSystemVariable) {
        this.processingSiteSystemVariable = processingSiteSystemVariable;
    }

    @JsonProperty("attRewardsIndicator")
    public String getAttRewardsIndicator() {
        return attRewardsIndicator;
    }

    @JsonProperty("attRewardsIndicator")
    public void setAttRewardsIndicator(String attRewardsIndicator) {
        this.attRewardsIndicator = attRewardsIndicator;
    }

    @JsonProperty("icliOfferIndicator")
    public String getIcliOfferIndicator() {
        return icliOfferIndicator;
    }

    @JsonProperty("icliOfferIndicator")
    public void setIcliOfferIndicator(String icliOfferIndicator) {
        this.icliOfferIndicator = icliOfferIndicator;
    }

    @JsonProperty("citiWalletEligibilityIndicator")
    public String getCitiWalletEligibilityIndicator() {
        return citiWalletEligibilityIndicator;
    }

    @JsonProperty("citiWalletEligibilityIndicator")
    public void setCitiWalletEligibilityIndicator(String citiWalletEligibilityIndicator) {
        this.citiWalletEligibilityIndicator = citiWalletEligibilityIndicator;
    }

    @JsonProperty("ratSaleOffer")
    public String getRatSaleOffer() {
        return ratSaleOffer;
    }

    @JsonProperty("ratSaleOffer")
    public void setRatSaleOffer(String ratSaleOffer) {
        this.ratSaleOffer = ratSaleOffer;
    }

    @JsonProperty("accountIbsxFlag")
    public Boolean getAccountIbsxFlag() {
        return accountIbsxFlag;
    }

    @JsonProperty("accountIbsxFlag")
    public void setAccountIbsxFlag(Boolean accountIbsxFlag) {
        this.accountIbsxFlag = accountIbsxFlag;
    }

    @JsonProperty("familyIndicator")
    public String getFamilyIndicator() {
        return familyIndicator;
    }

    @JsonProperty("familyIndicator")
    public void setFamilyIndicator(String familyIndicator) {
        this.familyIndicator = familyIndicator;
    }

    @JsonProperty("partnerStateUs")
    public String getPartnerStateUs() {
        return partnerStateUs;
    }

    @JsonProperty("partnerStateUs")
    public void setPartnerStateUs(String partnerStateUs) {
        this.partnerStateUs = partnerStateUs;
    }

    @JsonProperty("availablePoints")
    public Integer getAvailablePoints() {
        return availablePoints;
    }

    @JsonProperty("availablePoints")
    public void setAvailablePoints(Integer availablePoints) {
        this.availablePoints = availablePoints;
    }

    @JsonProperty("daysSinceActivation")
    public Integer getDaysSinceActivation() {
        return daysSinceActivation;
    }

    @JsonProperty("daysSinceActivation")
    public void setDaysSinceActivation(Integer daysSinceActivation) {
        this.daysSinceActivation = daysSinceActivation;
    }

    @JsonProperty("ficoScore")
    public Integer getFicoScore() {
        return ficoScore;
    }

    @JsonProperty("ficoScore")
    public void setFicoScore(Integer ficoScore) {
        this.ficoScore = ficoScore;
    }

    @JsonProperty("balanceTransferCreditRiskFlag")
    public Boolean getBalanceTransferCreditRiskFlag() {
        return balanceTransferCreditRiskFlag;
    }

    @JsonProperty("balanceTransferCreditRiskFlag")
    public void setBalanceTransferCreditRiskFlag(Boolean balanceTransferCreditRiskFlag) {
        this.balanceTransferCreditRiskFlag = balanceTransferCreditRiskFlag;
    }

    @JsonProperty("seniorPublicFigureFlag")
    public Boolean getSeniorPublicFigureFlag() {
        return seniorPublicFigureFlag;
    }

    @JsonProperty("seniorPublicFigureFlag")
    public void setSeniorPublicFigureFlag(Boolean seniorPublicFigureFlag) {
        this.seniorPublicFigureFlag = seniorPublicFigureFlag;
    }

    @JsonProperty("flexPayIndicator")
    public String getFlexPayIndicator() {
        return flexPayIndicator;
    }

    @JsonProperty("flexPayIndicator")
    public void setFlexPayIndicator(String flexPayIndicator) {
        this.flexPayIndicator = flexPayIndicator;
    }

    @JsonProperty("citiFlexLoanIndicator")
    public String getCitiFlexLoanIndicator() {
        return citiFlexLoanIndicator;
    }

    @JsonProperty("citiFlexLoanIndicator")
    public void setCitiFlexLoanIndicator(String citiFlexLoanIndicator) {
        this.citiFlexLoanIndicator = citiFlexLoanIndicator;
    }

    @JsonProperty("primaryAccountHolderFlag")
    public Boolean getPrimaryAccountHolderFlag() {
        return primaryAccountHolderFlag;
    }

    @JsonProperty("primaryAccountHolderFlag")
    public void setPrimaryAccountHolderFlag(Boolean primaryAccountHolderFlag) {
        this.primaryAccountHolderFlag = primaryAccountHolderFlag;
    }

    @JsonProperty("alert")
    public String getAlert() {
        return alert;
    }

    @JsonProperty("alert")
    public void setAlert(String alert) {
        this.alert = alert;
    }

  

}
