package Credencial;

	import java.util.ArrayList;
	import java.util.List;

	import com.db4o.Db4oEmbedded;
	import com.db4o.ObjectContainer;
	import com.db4o.ObjectSet;

	public class Conexion {
	    private ObjectContainer db = null;

	    private void abrirRegistro() {
	        db = Db4oEmbedded.openFile("RegistroUsuario");
	    }

	    private void cerrarConexion() {
	        db.close();
	    }

	    public void insertarRegistro(Usuario u) {
	        abrirRegistro();
	        db.store(u);
	        cerrarConexion();
	    }
	    
	    public List<Usuario> seleccionarPersona(){
	    
			abrirRegistro();
			ObjectSet listaPersonas = db.queryByExample(Usuario.class);
			List<Usuario> Up = new ArrayList<>();
			
			for(Object listaPersona1 : listaPersonas) {
				Up.add((Usuario) listaPersona1);
				
			}
			cerrarConexion();
			return Up;
			
		}
	}


