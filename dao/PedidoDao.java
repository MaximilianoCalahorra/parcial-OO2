package dao;

import datos.Pedido;
import datos.Stock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

///Clase PedidoDao:
public class PedidoDao extends Dao<Pedido>
{
	//Atributo:
	private static PedidoDao instancia = null;
	
	//Constructor:
	protected PedidoDao() {}
	
	//Obtener instancia:
	public static PedidoDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new PedidoDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 6:
	public List<Stock> traer(LocalDate fechaDesde, LocalDate fechaHasta)
	{
		List<Stock> stocks = new ArrayList<Stock>();
		try 
		{
			iniciaOperacion();
			String hql = "FROM Pedido p INNER JOIN FETCH p.producto INNER JOIN FETCH p.lote WHERE p.fecha BETWEEN :fechaDesde AND :fechaHasta";
			stocks = session.createQuery(hql, Stock.class).setParameter("fechaDesde", fechaDesde).setParameter("fechaHasta", fechaHasta).list();
		}
		finally 
		{
			session.close();
		}
		return stocks;
	}
	
	//CU 7:
	public List<Stock> traer(LocalDate fechaDesde, LocalDate fechaHasta, String cliente)
	{
		List<Stock> stocks = new ArrayList<Stock>();
		try 
		{
			iniciaOperacion();
			String hql = "FROM Pedido p INNER JOIN FETCH p.producto INNER JOIN FETCH p.lote WHERE p.cliente = :cliente AND p.fecha BETWEEN :fechaDesde AND :fechaHasta";
			stocks = session.createQuery(hql, Stock.class).setParameter("cliente", cliente).setParameter("fechaDesde", fechaDesde).setParameter("fechaHasta", fechaHasta).list();
		}
		finally 
		{
			session.close();
		}
		return stocks;
	}
}
