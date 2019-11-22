package com.integration.soap.client;
import com.integration.soap.response.GenericResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
/**
 *
 * @author
 */
public class EMSClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(EMSClient.class);

	public GenericResponse callEms(String request) {

//		GetCountryRequest request = new GetCountryRequest();
//		request.setName(country);
//
//		log.info("Requesting location for " + country);
//
//		GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate()
//				.marshalSendAndReceive("http://localhost:8080/ws/countries", request,
//						new SoapActionCallback(
//								"http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));
//
//		return response;
return null;
	}
}
