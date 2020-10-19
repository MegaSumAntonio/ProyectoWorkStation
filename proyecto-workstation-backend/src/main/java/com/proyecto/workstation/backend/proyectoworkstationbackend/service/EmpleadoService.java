package com.proyecto.workstation.backend.proyectoworkstationbackend.service;

import java.util.List;

import com.proyecto.workstation.backend.proyectoworkstationbackend.entity.Empleado;

public interface EmpleadoService {

	public List<Empleado> listarEmpleados();
	
	public void guardar(Empleado objEmpleado);
	
	public void eliminar(Empleado objEmpleado);
	
	public Empleado encontrarEmpleado(Empleado objEmpleado);
}
