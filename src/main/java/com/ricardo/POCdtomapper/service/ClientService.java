package com.ricardo.POCdtomapper.service;

import org.springframework.stereotype.Service;
import com.ricardo.POCdtomapper.model.Client;

@Service
public class ClientService {

		public Client create(Client client) {
			// In the future here we would save in BD.
			return new Client(1L, client.getName(), client.getEmail());
	}
}
