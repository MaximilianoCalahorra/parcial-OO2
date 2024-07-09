package negocio;

import dao.ProductoDao;
import datos.Producto;

///Clase ProductoABM:
public class ProductoABM
{
	//Atributo:
	private static ProductoABM instancia = null;
	
	//Constructor:
	protected ProductoABM() {}
	
	//Obtener instancia:
	public static ProductoABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new ProductoABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 1:
	public Producto traer(String codigo) 
	{
		return ProductoDao.getInstance().traer(codigo);
	}
	
	//Agregar:
	//CU 2:
	public int agregar(Producto producto) throws Exception
	{
		if(ProductoDao.getInstance().traer(producto.getCodigo()) != null) 
		{
			throw new Exception("Error! El producto con el codigo #" + producto.getCodigo() + " ya existe en la base de datos.\n");
		}
		return ProductoDao.getInstance().agregar(producto);
	}
}
