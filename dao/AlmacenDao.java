package dao;

import datos.Almacen;
import datos.Stock;
import java.util.ArrayList;
import java.util.List;

///Clase AlmacenDao:
public class AlmacenDao extends Dao<Almacen>
{
	//Atributo:
	private static AlmacenDao instancia = null;
	
	//Constructor:
	protected AlmacenDao() {}
	
	//Obtener instancia:
	public static AlmacenDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new AlmacenDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 5:
	public List<Stock> traer(String ubicacion)
	{
		List<Stock> stocks = new ArrayList<Stock>();
		try 
		{
			iniciaOperacion();
			String hql = "FROM Almacen a INNER JOIN FETCH a.producto INNER JOIN FETCH a.lote WHERE a.ubicacion = :ubicacion";
			stocks = session.createQuery(hql, Stock.class).setParameter("ubicacion", ubicacion).list();
		}
		finally 
		{
			session.close();
		}
		return stocks;
	}
}
