package datos;

///Clase Lote:
public class Lote
{
	//Atributos:
	private int idLote;
	private String codigo;
	private Producto producto;
	
	//Constructores:
	public Lote() {}
	
	public Lote(String codigo, Producto producto) 
	{
		this.codigo = codigo;
		this.producto = producto;
	}

	//Getters:
	public int getIdLote()
	{
		return idLote;
	}

	public String getCodigo() 
	{
		return codigo;
	}

	public Producto getProducto()
	{
		return producto;
	}

	//Setters:
	protected void setIdLote(int idLote) 
	{
		this.idLote = idLote;
	}

	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}

	public void setProducto(Producto producto)
	{
		this.producto = producto;
	}

	//To String:
	@Override
	public String toString() 
	{
		return "Lote [idLote=#" + idLote + ", codigo=#" + codigo + ", producto=" + producto + "]";
	}
}
