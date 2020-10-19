package com.proyecto.workstation.backend.proyectoworkstationbackend.service;

import java.util.List;

import com.proyecto.workstation.backend.proyectoworkstationbackend.entity.EstacTrae;

public interface EstacTraeService {

	public List<EstacTrae> listarEstacTrae();
	
	public void guardar(EstacTrae objEstacTrae);
	
	public void eliminar(EstacTrae objEstacTrae);
	
	public EstacTrae encontrarEstacTrae(EstacTrae objEstacTrae);
	
	public List<EstacTrae> getWSEnUso();
}
