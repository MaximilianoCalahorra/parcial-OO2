package dao;

import datos.Producto;
import org.hibernate.HibernateException;

///Clase ProductoDao:
public class ProductoDao extends Dao<Producto>
{
	//Atributo:
	private static ProductoDao instancia = null;
	
	//Constructor:
	protected ProductoDao() {}
	
	//Obtener instancia:
	public static ProductoDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new ProductoDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 1:
	public Producto traer(String codigo) 
	{
		Producto producto = null;
		try 
		{
			iniciaOperacion();
			String hql = "FROM Producto p WHERE p.codigo = :codigo";
			producto = (Producto)session.createQuery(hql).setParameter("codigo", codigo).uniqueResult();
		}
		finally 
		{
			session.close();
		}
		return producto;
	}
	
	//Agregar:
	//CU 2:
	public int agregar(Producto producto) 
	{
		int idProducto = 0;
		try 
		{
			iniciaOperacion();
			idProducto = (int)session.save(producto);
		}
		catch(HibernateException he) 
		{
			manejaExcepcion(he);
		}
		finally 
		{
			session.close();
		}
		return idProducto;
	}
}
