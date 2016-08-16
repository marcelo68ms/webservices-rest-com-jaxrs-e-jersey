package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void testaQueAConexaoFunciona() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://www.mocky.io");
		
	}

}
