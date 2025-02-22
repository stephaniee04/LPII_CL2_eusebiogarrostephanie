package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto{

	public void RegistrarProducto(TblProductocl2 producto) {
		//establecer conexion con la unidad de persistencia...
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL2_EUSEBIOGARROSTEPHANIE");
	    //permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(producto);
		//emitimos mensaje por consola
		System.out.println("producto registrado correctamente en la BD ");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion
		em.close();
	} //fin del metodo registrar...

	
	public List<TblProductocl2> ListadoProducto() {
		//establecer la conexion con la unidad de persistencia
		EntityManagerFactory em= Persistence.createEntityManagerFactory("LPII_CL2_EUSEBIOGARROSTEPHANIE");
		//gestionar las entidades
		EntityManager emanager= em.createEntityManager();				
		//inicar la transaccion
		emanager.getTransaction().begin();					
		//recuperamos el listado de productos de la base de datos
		List<TblProductocl2> listado= emanager.createQuery("select p from TblProductocl2 p",TblProductocl2.class).getResultList();				
		//confirmamos 
		emanager.getTransaction().commit();				
		//cerramos
		emanager.close();		
		return listado;
	}//fin del metodo listado..

}
