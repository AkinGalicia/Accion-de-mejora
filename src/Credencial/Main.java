package Credencial;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        int iniciar;
        Scanner te = new Scanner(System.in);
        
        Usuario usuario = new Usuario();
        Conexion c = new Conexion();
        
        
       
        Creacion crear = new Creacion();
        
        
      
        System.out.println("Para crear un nuevo usuario presione '1'");
        iniciar = te.nextInt();
        
            crear.crearCuenta();
            
        	List<Usuario> Up = c.seleccionarPersona();
        	for(Usuario Usuario: Up) {
        		System.out.println(Usuario);
        	
	}
    
            
	}
}
