package turismo;

import java.util.List;

public interface Sugerencia {
	public String getNombre();
	public int getCosto();
	public double getTiempo();
	public int getCupo();
	public List<TipoDeAtraccion> getListaTipoDeAtraccion();
}
