package com.saiyans.programming.service;

import java.util.List;

import com.saiyans.programming.entity.Ropa;

public interface IntRopaService {

	public void guardar(Ropa ropa);
	public List<Ropa> obtenerRopa();
	public Ropa buscarPorId(Integer idRopa);
	public void eliminar(Integer idRopa);
	public int numeroRopa();
}
