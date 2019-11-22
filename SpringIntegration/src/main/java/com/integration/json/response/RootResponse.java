
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
    "getOfferResponse"
})
public class RootResponse {

    @JsonProperty("getOfferResponse")
    private GetOfferResponse getOfferResponse;
  
    @JsonProperty("getOfferResponse")
    public GetOfferResponse getGetOfferResponse() {
        return getOfferResponse;
    }

    @JsonProperty("getOfferResponse")
    public void setGetOfferResponse(GetOfferResponse getOfferResponse) {
        this.getOfferResponse = getOfferResponse;
    }

}
