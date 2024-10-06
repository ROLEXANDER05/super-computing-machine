package interfaces;

import java.util.List;

import model.TblProducto;

public interface IProducto {
	void RegistrarProducto(TblProducto tblpro);
	void ActualizarProducto(TblProducto tblpro);
	void EliminarProducto(TblProducto tblpro);
	
	List<TblProducto> ListarProducto();
	TblProducto BuscarProducto(TblProducto tblpro);
}
