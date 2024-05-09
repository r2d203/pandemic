package Clasesjava;

public class Ciudad {
	public String nombre;
	public int coordenadas[];
	public String enfermedad;
	public int infecion;
	public String ciudadesColindantes;
	
	public String getNombre() {
		return nombre;
	}
	
	public int[] getCoordenadas() {
		return coordenadas;
	}
	
	public String getEnfermedad() {
		return enfermedad;
	}
	
	public int getInfecion() {
		return infecion;
	}
	
	public String getCiudadesColindantes() {
		return ciudadesColindantes;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		


	public void setCoordenadas(int[] coordenadas) {
		this.coordenadas = coordenadas;
	}


	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	public void setInfecion(int infecion) {
		this.infecion = infecion;
	}
	
	public void setCiudadesColindantes(String ciudadesColindantes) {
		this.ciudadesColindantes = ciudadesColindantes;
	}
	
	public void aumentarinfeccio() {
		
	}
	public void disminuirinfeccion() {
		
	}
	
	public void propagarinfeccion() {
		
	}
	
	
}
