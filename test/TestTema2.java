package test;

import dao.AlmacenDao;
import datos.Producto;
import negocio.LoteABM;
import negocio.PedidoABM;
import negocio.ProductoABM;
import java.time.LocalDate;

///Clase TestTema2:
public class TestTema2
{
	public static void main(String[] args)
	{
		//Test 1:
		System.out.println("Test 1:");
		try 
		{
			System.out.println("ID del producto agregado: #" + ProductoABM.getInstance().agregar(new Producto("6", "placa de video", 500000.0)));
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		//Test 2:
		System.out.println("\nTest 2:");
		try 
		{
			System.out.println("ID del producto agregado: #" + ProductoABM.getInstance().agregar(new Producto("6", "audifonos", 500.0)));
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		//Test 3:
		System.out.println("\nTest 3:");
		System.out.println("Lote con el ID #2 y su Producto asociado:");
		System.out.println(LoteABM.getInstance().traer("2"));

		//Test 4:
		System.out.println("\nTest 4:");
		System.out.println("Lotes con Producto con el codigo #2:");
		System.out.println(LoteABM.getInstance().traer(ProductoABM.getInstance().traer("2")));

		//Test 5:
		System.out.println("\nTest 5:");
		System.out.println("Stocks con ubicacion en Banfield y su Producto y Lote asociado:");
		System.out.println(AlmacenDao.getInstance().traer("Banfield"));

		//Test 6:
		System.out.println("\nTest 6:");
		System.out.println("Stocks entre el 17-05-2024 y el 21-05-2024:");
		System.out.println(PedidoABM.getInstance().traer(LocalDate.of(2024, 5, 17), LocalDate.of(2024, 5, 21)));
	
		//Test 7:
		System.out.println("\nTest 7:");
		System.out.println("Stocks entre el 17-05-2024 y el 21-05-2024 del cliente 'Pablo':");
		System.out.println(PedidoABM.getInstance().traer(LocalDate.of(2024, 5, 17), LocalDate.of(2024, 5, 21), "Pablo"));
	}
}
