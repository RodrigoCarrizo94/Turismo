package turismo;

import java.util.List;

public class PromocionesPorcentuales extends Promociones {
	private int descuento;

	public PromocionesPorcentuales(List<Atraccion> atracciones, int descuento) {
		this.atracciones = atracciones;
		this.descuento = descuento;
	}
	
	@Override
	public int getCosto() {
		return super.getCosto() * (100 - this.descuento) / 100;
	}
}
