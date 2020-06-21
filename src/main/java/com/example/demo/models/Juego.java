package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
@Entity
public class Juego {
	
	@Id
	private String id;
	
	@Column
	private String titulo;
	
	@Column
	private String desarrollador;
	
	@Column
	private String editor;
	
	@Column
	private String franquicia;
	
	@Column
	private double precio;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	
	public String getDesarrollador() {
		return desarrollador;
	}
	
	public void setDesarrollador(String desarrollador) {
		this.desarrollador=desarrollador;
	}
	
	public String getEditor() {
		return editor;
	}
	
	public void setEditor(String editor) {
		this.editor=editor;
	}
	
	public String getFranquicia() {
		return franquicia;
	}
	
	public void setFranquicia(String franquicia) {
		this.franquicia=franquicia;
	}
	 
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
	
	

}
