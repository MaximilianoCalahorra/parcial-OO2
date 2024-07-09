package negocio;

import dao.LoteDao;
import datos.Lote;
import datos.Producto;
import java.util.List;

///Clase LoteABM:
public class LoteABM 
{
	//Atributo:
	private static LoteABM instancia = null;
	
	//Constructor:
	protected LoteABM() {}
	
	//Obtener instancia:
	public static LoteABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new LoteABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 3:
	public Lote traer(String codigo) 
	{
		return LoteDao.getInstance().traer(codigo);
	}
	
	//CU 4:
	public List<Lote> traer(Producto producto) 
	{
		return LoteDao.getInstance().traer(producto);
	}
}
