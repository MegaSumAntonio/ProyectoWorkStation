package com.proyecto.workstation.backend.proyectoworkstationbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.workstation.backend.proyectoworkstationbackend.dao.EmpleadoDao;
import com.proyecto.workstation.backend.proyectoworkstationbackend.entity.Empleado;

@Service
public class EmpeladoServiceImp implements EmpleadoService{

	@Autowired
	EmpleadoDao empleadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Empleado> listarEmpleados() {
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Empleado objEmpleado) {
		empleadoDao.save(objEmpleado);
	}

	@Override
	@Transactional
	public void eliminar(Empleado objEmpleado) {
		empleadoDao.delete(objEmpleado);
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado encontrarEmpleado(Empleado objEmpleado) {
		return empleadoDao.findById((long) objEmpleado.getFcEmpNo()).orElse(null);
	}
}
