
package com.integration.json.response;

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
    "offer"
})
public class GetOfferResponse {

    @JsonProperty("offer")
    private List<Offer> offer = new ArrayList<Offer>();
  
    @JsonProperty("offer")
    public List<Offer> getOffer() {
        return offer;
    }

    @JsonProperty("offer")
    public void setOffer(List<Offer> offer) {
        this.offer = offer;
    }

}
