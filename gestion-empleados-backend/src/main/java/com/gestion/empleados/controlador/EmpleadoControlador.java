package com.gestion.empleados.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.modelo.Empleado;
import com.gestion.empleados.repositorios.EmpleadoRepositorio;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadoControlador {

	@Autowired
	private EmpleadoRepositorio empleadoRepositorio;

	@GetMapping("/empleados")
	public List<Empleado> listarTodosLosEmpleados() {
		return empleadoRepositorio.findAll();
	}

}
