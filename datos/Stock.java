package datos;

///Clase Stock:
public abstract class Stock
{
	//Atributos:
	protected int idStock;
	protected int cantidad;
	protected Producto producto;
	protected Lote lote;
	
	//Constructores:
	public Stock() {}
	
	public Stock(int cantidad, Producto producto, Lote lote) 
	{
		this.cantidad = cantidad;
		this.producto = producto;
		this.lote = lote;
	}

	//Getters:
	public int getIdStock() 
	{
		return idStock;
	}

	public int getCantidad() 
	{
		return cantidad;
	}

	public Producto getProducto() 
	{
		return producto;
	}

	public Lote getLote() 
	{
		return lote;
	}

	//Setters:
	protected void setIdStock(int idStock) 
	{
		this.idStock = idStock;
	}

	public void setCantidad(int cantidad) 
	{
		this.cantidad = cantidad;
	}

	public void setProducto(Producto producto)
	{
		this.producto = producto;
	}

	public void setLote(Lote lote) 
	{
		this.lote = lote;
	}

	//To String:
	@Override
	public String toString() 
	{
		return "idStock=#" + idStock + ", cantidad=" + cantidad + ", producto=" + producto + ", lote=" + lote;
	}
}