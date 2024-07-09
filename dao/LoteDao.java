package dao;

import datos.Lote;
import datos.Producto;
import java.util.List;
import java.util.ArrayList;

///Clase LoteDao:
public class LoteDao extends Dao<Lote>
{
	//Atributo:
	private static LoteDao instancia = null;
	
	//Constructor:
	protected LoteDao() {}
	
	//Obtener instancia:
	public static LoteDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new LoteDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 3:
	public Lote traer(String codigo) 
	{
		Lote lote = null;
		try 
		{
			iniciaOperacion();
			String hql = "FROM Lote l INNER JOIN FETCH l.producto WHERE l.codigo = :codigo";
			lote = (Lote)session.createQuery(hql).setParameter("codigo", codigo).uniqueResult();
		}
		finally 
		{
			session.close();
		}
		return lote;
	}
	
	//CU 4:
	public List<Lote> traer(Producto producto)
	{
		List<Lote> lotes = new ArrayList<Lote>();
		try 
		{
			iniciaOperacion();
			String hql = "FROM Lote l INNER JOIN FETCH l.producto p WHERE p.codigo = :codigo";
			lotes = session.createQuery(hql, Lote.class).setParameter("codigo", producto.getCodigo()).list();
		}
		finally 
		{
			session.close();
		}
		return lotes;
	}
}
