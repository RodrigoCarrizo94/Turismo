package turismo;

import java.util.ArrayList;
import java.util.List;

public class Atraccion implements Sugerencia {
	private String nombre;
	private int costo = 0;
	private double tiempo = 0;
	private int cupo = 0;
	private TipoDeAtraccion tipo;

	public Atraccion(String nombre, int costo, double tiempo, int cupo, TipoDeAtraccion tipo) {
		setNombre(nombre);
		setCosto(costo);
		setTiempo(tiempo);
		setCupo(cupo);
		setTipo(tipo);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setCosto(int costo) {
		this.costo = costo;
	}
	
	private void setTiempo(double tiempo) {
		this.tiempo = tiempo;	
	}
	
	private void setCupo(int cupo) {
		this.cupo = cupo;
	}

	private void setTipo(TipoDeAtraccion tipo) {
		this.tipo = tipo;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public int getCosto() {
		return this.costo;
	}

	@Override
	public double getTiempo() {
		return this.tiempo;
	}

	@Override
	public int getCupo() {
		return this.cupo;
	}
	
	@Override
	public List<TipoDeAtraccion> getListaTipoDeAtraccion() {
		List<TipoDeAtraccion> listaTipoDeAtraccion = new ArrayList<TipoDeAtraccion>();
		listaTipoDeAtraccion.add(tipo);
		return listaTipoDeAtraccion;
	}

	public TipoDeAtraccion getTipo() {
		return this.tipo;
	}
}