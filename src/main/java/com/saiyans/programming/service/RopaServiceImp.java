package com.saiyans.programming.service;

import java.util.LinkedList;
import java.util.List;

import com.saiyans.programming.entity.Ropa;
import org.springframework.stereotype.Service;

@Service
public class RopaServiceImp implements IntRopaService{
	
	private List<Ropa> categoriasRopa;
	
	public RopaServiceImp() {
		categoriasRopa = new LinkedList<>();
		
		Ropa r1 = new Ropa();
		r1.setId(1);
		r1.setTipo("Conjunto");
		r1.setTalla(23);
		r1.setPrecio(256.99);
		
		Ropa r2 = new Ropa();
		r2.setId(1);
		r2.setTipo("Pans");
		r2.setTalla(23);
		r2.setPrecio(256.99);
		
		Ropa r3 = new Ropa();
		r3.setId(1);
		r3.setTipo("Camiseta");
		r3.setTalla(23);
		r3.setPrecio(256.99);
		
		categoriasRopa.add(r1);
		categoriasRopa.add(r2);
		categoriasRopa.add(r3);
	}

	@Override
	public void guardar(Ropa ropa) {
		categoriasRopa.add(ropa);
	}

	@Override
	public List<Ropa> obtenerRopa() {
		return categoriasRopa;
	}

	@Override
	public Ropa buscarPorId(Integer idRopa) {
		for(Ropa r : categoriasRopa) {
			if( r.getId().compareTo(idRopa) == 0) {
				return r;
			}
		}
		
		return null;
	}

	@Override
	public void eliminar(Integer idRopa) {
		categoriasRopa.remove(buscarPorId(idRopa));
		
	}

	@Override
	public int numeroRopa() {
		// TODO Auto-generated method stub
		return categoriasRopa.size();
	}

}