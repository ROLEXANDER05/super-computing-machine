package interfaces;

import java.util.List;

import model.TblCliente;

public interface ICliente {
	void RegistrarCliente(TblCliente tblcli);
	void ActualizarCliente(TblCliente tblcli);
	void EliminarCliente(TblCliente tblcli);
	
	List<TblCliente> ListarCliente();
	TblCliente BuscarCliente(TblCliente tblcli);
}
