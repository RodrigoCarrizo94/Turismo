package turismo;

import java.util.List;

public class PromocionAbsoluta extends Promociones {
	private int costo;
	
	public PromocionAbsoluta(List<Atraccion> atracciones, int costo) {
		this.atracciones = atracciones;
		setCosto(costo);
	}
	
	private void setCosto(int costo) {
		this.costo = costo;
	}
	
	@Override
	public int getCosto() {
		return this.costo;
	}
}
