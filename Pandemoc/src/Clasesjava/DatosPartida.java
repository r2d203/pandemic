package Clasesjava;

import java.util.ArrayList;

public class DatosPartida {
	ArrayList<String> listaCiudades = new ArrayList<>();
	ArrayList<String> virus = new ArrayList<>();
	ArrayList<String> vacunas = new ArrayList<>();
	public int brotes;
	public int rondas;
	public float pdesarollo;
	public int acciones;

	public ArrayList<String> getListaCiudades() {
		return listaCiudades;
	}

	public ArrayList<String> getVirus() {
		return virus;
	}

	public ArrayList<String> getVacunas() {
		return vacunas;
	}

	public int getBrotes() {
		return brotes;
	}

	public int getRondas() {
		return rondas;
	}

	public float getPdesarollo() {
		return pdesarollo;
	}

	public int getAcciones() {
		return acciones;
	}

	public void setListaCiudades(ArrayList<String> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}

	public void setVirus(ArrayList<String> virus) {
		this.virus = virus;
	}

	public void setVacunas(ArrayList<String> vacunas) {
		this.vacunas = vacunas;
	}

	public void setBrotes(int brotes) {
		this.brotes = brotes;
	}

	public void setRondas(int rondas) {
		this.rondas = rondas;
	}

	public void setPdesarollo(float pdesarollo) {
		this.pdesarollo = pdesarollo;
	}

	public void setAcciones(int acciones) {
		this.acciones = acciones;
	}
	
	public void modificarciudad(String nCiudad, int modificacion) {
		
	}
	
	public void modificarVacouna(String nVacuna, float modificaciones) {
		
	}
	
	public void cargardatos() {
		
	}
}
