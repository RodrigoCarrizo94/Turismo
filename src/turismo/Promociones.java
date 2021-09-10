package turismo;

import java.util.ArrayList;
import java.util.List;

public abstract class Promociones implements Sugerencia {
	protected List<Atraccion> atracciones;
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCosto() {
		Integer costoTotal = 0;
		for (Atraccion atraccion : atracciones) {
			costoTotal += atraccion.getCosto();
		}
		return costoTotal;
	}
	
	@Override
	public double getTiempo() {
		Double duracionTotal = 0.0;
		for (Atraccion atraccion : atracciones) {
			duracionTotal += atraccion.getTiempo(); 
		}
		return duracionTotal;
	}

	@Override
	public int getCupo() {
		Integer cupo = 0;
		for (Atraccion atraccion : atracciones) {
			cupo += atraccion.getCupo();
		}
		return cupo;
	}

	@Override
	public List<TipoDeAtraccion> getListaTipoDeAtraccion() {
		List<TipoDeAtraccion> tiposDeAtracciones = new ArrayList<TipoDeAtraccion>();
		for (Atraccion atraccion : atracciones) {
			tiposDeAtracciones.addAll(atraccion.getListaTipoDeAtraccion());
		}
		return tiposDeAtracciones;
	}
}
