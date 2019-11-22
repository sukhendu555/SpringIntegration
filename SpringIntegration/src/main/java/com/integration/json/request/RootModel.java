
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
    "party",
    "copsGetPartyOfferListRequest",
    "corOfferExtention"
})
public class RootModel {

    @JsonProperty("party")
    private Party party;
    @JsonProperty("copsGetPartyOfferListRequest")
    private CopsGetPartyOfferListRequest copsGetPartyOfferListRequest;
    @JsonProperty("corOfferExtention")
    private CorOfferExtention corOfferExtention;
   
    @JsonProperty("party")
    public Party getParty() {
        return party;
    }

    @JsonProperty("party")
    public void setParty(Party party) {
        this.party = party;
    }

    @JsonProperty("copsGetPartyOfferListRequest")
    public CopsGetPartyOfferListRequest getCopsGetPartyOfferListRequest() {
        return copsGetPartyOfferListRequest;
    }

    @JsonProperty("copsGetPartyOfferListRequest")
    public void setCopsGetPartyOfferListRequest(CopsGetPartyOfferListRequest copsGetPartyOfferListRequest) {
        this.copsGetPartyOfferListRequest = copsGetPartyOfferListRequest;
    }

    @JsonProperty("corOfferExtention")
    public CorOfferExtention getCorOfferExtention() {
        return corOfferExtention;
    }

    @JsonProperty("corOfferExtention")
    public void setCorOfferExtention(CorOfferExtention corOfferExtention) {
        this.corOfferExtention = corOfferExtention;
    }
}
