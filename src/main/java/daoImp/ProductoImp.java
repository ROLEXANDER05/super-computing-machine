package daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TblProducto;

public class ProductoImp implements IProducto {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("PROYECTOMavenJPAPresencial-main");
	EntityManager em = emf.createEntityManager();
	
	
	@Override
	public void RegistrarProducto(TblProducto tblpro) {
		try {
			em.getTransaction().begin();
			em.persist(tblpro);
			
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}

	}

	@Override
	public void ActualizarProducto(TblProducto tblpro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void EliminarProducto(TblProducto tblpro) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<TblProducto> ListarProducto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblProducto BuscarProducto(TblProducto tblpro) {
		// TODO Auto-generated method stub
		return null;
	}

}
