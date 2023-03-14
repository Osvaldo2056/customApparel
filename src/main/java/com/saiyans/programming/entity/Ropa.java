package com.saiyans.programming.entity;

public class Ropa extends Object{
	private Integer id;
	private String tipo;
	private Integer talla;
	private Double precio;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getTalla() {
		return talla;
	}
	public void setTalla(Integer talla) {
		this.talla = talla;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Ropa [id=" + id + ", tipo=" + tipo + ", talla=" + talla + ", precio=" + precio + "]";
	}

}
