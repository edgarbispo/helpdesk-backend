package com.aib.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aib.helpdesk.domain.Chamado;
import com.aib.helpdesk.domain.Cliente;
import com.aib.helpdesk.domain.Tecnico;
import com.aib.helpdesk.domain.enums.Perfil;
import com.aib.helpdesk.domain.enums.Prioridade;
import com.aib.helpdesk.domain.enums.Status;
import com.aib.helpdesk.repositories.ChamadoRepository;
import com.aib.helpdesk.repositories.ClienteRepository;
import com.aib.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	
	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Edgar Bispo", "17917525864", "edgarbispo@hotmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "11111111111", "linus@hotmail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
				
	}
	
}