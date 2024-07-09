package datos;

///Clase Producto:
public class Producto
{
	//Atributos:
	private int idProducto;
	private String codigo;
	private String nombre;
	private double precio;
	
	//Constructores:
	public Producto() {}
	
	public Producto(String codigo, String nombre, double precio) 
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	//Getters:
	public int getIdProducto()
	{
		return idProducto;
	}

	public String getCodigo() 
	{
		return codigo;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public double getPrecio() 
	{
		return precio;
	}

	//Setters:
	protected void setIdProducto(int idProducto) 
	{
		this.idProducto = idProducto;
	}

	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public void setPrecio(double precio)
	{
		this.precio = precio;
	}

	//To String:
	@Override
	public String toString()
	{
		return "Producto [idProducto=#" + idProducto + ", codigo=#" + codigo + ", nombre=" + nombre + ", precio=$" + precio + "]";
	}
}
