package com.integration.controller;

import com.integration.json.request.Account;
import com.integration.json.request.RootModel;
import com.integration.json.response.GetOfferResponse;
import com.integration.json.response.Offer;
import com.integration.json.response.Party;
import com.integration.json.response.PartyDetail;
import com.integration.json.response.RootResponse;
import com.integration.soap.client.EMSClient;
import com.integration.soap.client.EMSConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 
 */

@RestController
@RequestMapping("/integration")
public class IntegrationController {
 
    
    @Autowired
     private EMSClient eMSClient;
    
    @PostMapping("/liteOffer")
    @ResponseStatus(HttpStatus.OK)
    public RootResponse liteOffer(@RequestBody RootModel rootModel) {
        
        // Perform Business Logic
//       3. XML Request going to Backend ( XML / EMS )
         eMSClient.callEms("");
        
         
         
        
        // Prepare Response to send return
        RootResponse response=new RootResponse();
        GetOfferResponse offerResp=new GetOfferResponse();
        Offer offer=new Offer();
        Party party=new Party();
        party.setAccount(rootModel.getParty().getAccount());
        party.setCardNumber(rootModel.getParty().getCardAccountNumber());
        party.setAccount(party.getAccount());
        for(Account act:rootModel.getParty().getAccount()){
            PartyDetail pd=new PartyDetail();
            pd.setAccountNumber(act.getAccountNumber());
            pd.setBalanceTransferCreditRiskIndicator("N");
            pd.setBalanceTransferCreditRiskIndicator("N");
            party.getPartyDetails().add(pd);
        }
         offer.setParty(party);
         offerResp.getOffer().add(offer);
         response.setGetOfferResponse(offerResp);
        
        return response;
    }
    
}
