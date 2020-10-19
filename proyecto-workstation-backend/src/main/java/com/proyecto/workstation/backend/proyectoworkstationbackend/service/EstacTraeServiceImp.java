package com.proyecto.workstation.backend.proyectoworkstationbackend.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.workstation.backend.proyectoworkstationbackend.dao.EstacTraeDao;
import com.proyecto.workstation.backend.proyectoworkstationbackend.entity.EstacTrae;

@Service
public class EstacTraeServiceImp implements EstacTraeService{
	
	@Autowired
	EstacTraeDao estacTraeDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<EstacTrae> listarEstacTrae() {
		return (List<EstacTrae>) estacTraeDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(EstacTrae objEstacTrae) {
		estacTraeDao.save(objEstacTrae);
	}

	@Override
	@Transactional
	public void eliminar(EstacTrae objEstacTrae) {
		estacTraeDao.delete(objEstacTrae);
	}

	@Override
	@Transactional(readOnly = true)
	public EstacTrae encontrarEstacTrae(EstacTrae objEstacTrae) {
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<EstacTrae> getWSEnUso() {
		List<EstacTrae> list = (List<EstacTrae>) estacTraeDao.findAll();
		List<EstacTrae> listAuxiliar = new ArrayList<>();
		EstacTrae objSTAuxiliar;
		Iterator i = list.iterator();
		while(i.hasNext()) {
			objSTAuxiliar = (EstacTrae) i.next();
			if(objSTAuxiliar.getFcWSDesc() != null) {
				if(!objSTAuxiliar.getFcWSDesc().startsWith("WS_")) {
					objSTAuxiliar.setFd_fec_install(objSTAuxiliar.getFd_fec_install().substring(11,objSTAuxiliar.getFd_fec_install().length()-1));
					if(objSTAuxiliar.getFc_emp_no()== null) {
						objSTAuxiliar.setFc_emp_no(0);
					}
					listAuxiliar.add(objSTAuxiliar);
				}
			}
		}
		return listAuxiliar;
	}

}
