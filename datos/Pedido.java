package datos;

import java.time.LocalDate;

///Clase Pedido:
public class Pedido extends Stock
{
	//Atributos:
	private int idPedido;
	private LocalDate fecha;
	private String cliente;
	
	//Constructores:
	public Pedido() {}
	
	public Pedido(int cantidad, Producto producto, Lote lote, LocalDate fecha, String cliente)
	{
		super(cantidad, producto, lote);
		this.fecha = fecha;
		this.cliente = cliente;
	}

	//Getters:
	public int getIdPedido() 
	{
		return idPedido;
	}

	public LocalDate getFecha() 
	{
		return fecha;
	}

	public String getCliente() 
	{
		return cliente;
	}

	//Setters:
	protected void setIdPedido(int idPedido) 
	{
		this.idPedido = idPedido;
	}

	public void setFecha(LocalDate fecha) 
	{
		this.fecha = fecha;
	}

	public void setCliente(String cliente) 
	{
		this.cliente = cliente;
	}

	//To String:
	@Override
	public String toString() 
	{
		return "\nPedido [" + super.toString() + ", fecha=" + fecha + ", cliente=" + cliente + "]\n";
	}
}
