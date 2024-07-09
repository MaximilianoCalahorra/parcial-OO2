package negocio;

import dao.AlmacenDao;
import datos.Stock;
import java.util.List;

///Clase AlmacenABM:
public class AlmacenABM
{
	//Atributo:
	private static AlmacenABM instancia = null;
	
	//Constructor:
	protected AlmacenABM() {}
	
	//Obtener instancia:
	public static AlmacenABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new AlmacenABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 5:
	public List<Stock> traer(String ubicacion)
	{
		return AlmacenDao.getInstance().traer(ubicacion);
	}
}
