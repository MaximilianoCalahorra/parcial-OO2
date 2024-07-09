package datos;

///Clase Almacen:
public class Almacen extends Stock
{
	//Atributos:
	private int idAlmacen;
	private String ubicacion;
	
	//Constructores:
	public Almacen() {}
	
	public Almacen(int cantidad, Producto producto, Lote lote, String ubicacion) 
	{
		super(cantidad, producto, lote);
		this.ubicacion = ubicacion;
	}

	//Getters:
	public int getIdAlmacen() 
	{
		return idAlmacen;
	}

	public String getUbicacion() 
	{
		return ubicacion;
	}

	//Setters:
	protected void setIdAlmacen(int idAlmacen)
	{
		this.idAlmacen = idAlmacen;
	}

	public void setUbicacion(String ubicacion) 
	{
		this.ubicacion = ubicacion;
	}

	//To String:
	@Override
	public String toString() 
	{
		return "\nAlmacen [" + super.toString() + ", ubicacion=" + ubicacion + "]\n";
	}
}