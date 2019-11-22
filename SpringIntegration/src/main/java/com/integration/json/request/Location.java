
package com.integration.json.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "locationId"
})
public class Location {

    @JsonProperty("locationId")
    private String locationId;
  
    @JsonProperty("locationId")
    public String getLocationId() {
        return locationId;
    }

    @JsonProperty("locationId")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
}
