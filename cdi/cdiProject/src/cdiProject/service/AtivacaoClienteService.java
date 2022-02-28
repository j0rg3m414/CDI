package cdiProject.service;

import cdiProject.modelo.Cliente;
import cdiProject.notificacao.NotificadorEmail;

public class AtivacaoClienteService {
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		NotificadorEmail notificador = new NotificadorEmail();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
