package com.aib.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aib.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
