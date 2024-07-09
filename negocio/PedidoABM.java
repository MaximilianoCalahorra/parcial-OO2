package negocio;

import dao.PedidoDao;
import datos.Stock;
import java.time.LocalDate;
import java.util.List;

///Clase PedidoABM:
public class PedidoABM
{
	//Atributo:
	private static PedidoABM instancia = null;
		
	//Constructor:
	protected PedidoABM() {}
		
	//Obtener instancia:
	public static PedidoABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new PedidoABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 6:
	public List<Stock> traer(LocalDate fechaDesde, LocalDate fechaHasta)
	{
		return PedidoDao.getInstance().traer(fechaDesde, fechaHasta);
	}
	
	//CU 7:
	public List<Stock> traer(LocalDate fechaDesde, LocalDate fechaHasta, String cliente)
	{
		return PedidoDao.getInstance().traer(fechaDesde, fechaHasta, cliente);
	}
}
