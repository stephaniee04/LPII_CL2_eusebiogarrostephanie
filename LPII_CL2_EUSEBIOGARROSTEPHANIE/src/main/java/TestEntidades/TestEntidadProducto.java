package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		//realizamos la respectiva instancia de las clases..
		TblProductocl2 producto=new TblProductocl2 ();
		ClassProductoImp crud=new ClassProductoImp();
		
		//asignamos valores
		producto.setNombrecl2("Silla");
		producto.setPrecioventacl2(20);
		producto.setPreciocompcl2(15);
		producto.setEstadocl2("buen estado");
		producto.setDescripcl2("buena calidad");
		//invocamos al metodo registrar...
		crud.RegistrarProducto(producto);
       
		
		//Listado
		List<TblProductocl2> listado = crud.ListadoProducto();
				
		//Aplicamos bucle For
				
		for(TblProductocl2 lis:listado) {
			//imprimimos en pantalla
			System.out.println("Codigo "+lis.getIdproductocl2()+
							" Nombre :"+lis.getNombrecl2()+
		                    " Precio venta :"+lis.getPrecioventacl2()+
		                    " Precio compra :"+lis.getPreciocompcl2()+
		                    " Estado :"+lis.getEstadocl2()+
		                    " Descripcion: "+ lis.getDescripcl2());		
				}
		}   //fin del metodo main...
		
}//fin de la clase..
