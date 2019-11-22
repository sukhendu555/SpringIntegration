
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
    "party"
})
public class Offer {

    @JsonProperty("party")
    private Party party;
 
    @JsonProperty("party")
    public Party getParty() {
        return party;
    }

    @JsonProperty("party")
    public void setParty(Party party) {
        this.party = party;
    }

}
