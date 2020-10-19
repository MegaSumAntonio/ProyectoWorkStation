package com.proyecto.workstation.backend.proyectoworkstationbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.workstation.backend.proyectoworkstationbackend.entity.Empleado;
import com.proyecto.workstation.backend.proyectoworkstationbackend.entity.EstacTrae;
import com.proyecto.workstation.backend.proyectoworkstationbackend.service.EmpleadoService;
import com.proyecto.workstation.backend.proyectoworkstationbackend.service.EstacTraeService;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class ApiController {

	@Autowired
	private EstacTraeService estacTraeService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/workstation/use")
	public List<EstacTrae> getWSUse(){
		return estacTraeService.getWSEnUso();
	}
	
	@GetMapping("/workstation/empleados")
	public List<Empleado> getEmpleados(){
		return empleadoService.listarEmpleados();
	}
}
