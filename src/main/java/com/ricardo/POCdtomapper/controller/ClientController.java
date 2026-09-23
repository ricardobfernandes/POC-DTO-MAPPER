package com.ricardo.POCdtomapper.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.POCdtomapper.dto.ClientResponse;
import com.ricardo.POCdtomapper.dto.CreateClientRequest;
import com.ricardo.POCdtomapper.mapper.ClientMapper;
import com.ricardo.POCdtomapper.model.Client;
import com.ricardo.POCdtomapper.service.ClientService;

@RestController
@RequestMapping("/clientes")
public class ClientController {

	private final ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@PostMapping
	public ClientResponse create(@RequestBody CreateClientRequest request) {

		Client client = ClientMapper.toModel(request);

		Client clientCreated = clientService.create(client);

		return ClientMapper.toResponse(clientCreated);
	}
}
