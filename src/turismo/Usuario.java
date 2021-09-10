package turismo;

import java.util.List;

public class Usuario {
	private String nombre;
	private int presupuesto = 0;
	private double tiempoDisponible = 0;
	private TipoDeAtraccion preferencia;

	public Usuario(String nombre, int presupuesto, double tiempoDisponible, TipoDeAtraccion preferencia) {
		setNombre(nombre);
		setPresupuesto(presupuesto);
		setTiempoDisponible(tiempoDisponible);
		setTipoDeAtraccion(preferencia);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	private void setTiempoDisponible(double tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;	
	}

	private void setTipoDeAtraccion(TipoDeAtraccion preferencia) {
		this.preferencia = preferencia;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean tienePresupuesto(int costo) {
		return this.presupuesto >= costo;
	}

	public boolean tieneTiempo(double duracion) {
		return this.tiempoDisponible >= duracion;
	}
	
	public boolean tienePreferencia(List<TipoDeAtraccion> atraccion) {
		return atraccion.contains(preferencia);
	}
}
