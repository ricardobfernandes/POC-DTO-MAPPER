package com.ricardo.POCdtomapper.mapper;

import com.ricardo.POCdtomapper.dto.ClientResponse;
import com.ricardo.POCdtomapper.dto.CreateClientRequest;
import com.ricardo.POCdtomapper.model.Client;

public class ClientMapper {

	public static Client toModel(CreateClientRequest request) {
		return new Client(null, request.name(), request.email()); //note that this is the way to access attributes
		//and this converts DTO into client object
	}

	public static ClientResponse toResponse(Client client) {
		return new ClientResponse(client.getId(), client.getName(), client.getEmail());
		//this converts client into DTO object
	}

}
