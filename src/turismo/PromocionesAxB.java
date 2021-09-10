package turismo;

import java.util.List;

public class PromocionesAxB extends Promociones {
	private Atraccion promo;
	
	public PromocionesAxB(List<Atraccion> atracciones, Atraccion promo) {
		setAtracciones(atracciones);
		setPromo(promo);
	}

	private void setPromo(Atraccion promo) {
		this.promo = promo;
	}

	private void setAtracciones(List<Atraccion> atracciones) {
		this.atracciones = atracciones;		
	}
	
	@Override
	public double getTiempo() {
		return super.getTiempo() + this.promo.getTiempo();
	}

	@Override
	public List<TipoDeAtraccion> getListaTipoDeAtraccion() {
		List<TipoDeAtraccion> tiposAtracciones = super.getListaTipoDeAtraccion();
		tiposAtracciones.add(promo.getTipo());
		return tiposAtracciones;
	}
}
