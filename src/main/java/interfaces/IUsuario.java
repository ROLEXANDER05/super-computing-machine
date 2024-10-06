package interfaces;

import java.util.List;

import model.TblUsuario;

public interface IUsuario {

	void RegistrarUsuario(TblUsuario tblusu);
	void ActualizarrUsuario(TblUsuario tblusu);
	void EliminarUsuario(TblUsuario tblusu);
	
	List<TblUsuario> ListarUsuario();
	TblUsuario BuscarUsuario(TblUsuario tblusu);
	
}
