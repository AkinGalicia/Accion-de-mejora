package Credencial;

import java.util.Scanner;

public class Creacion {
	Usuario usuario = new Usuario();
    Conexion c = new Conexion();
    
    public  void crearCuenta(){
        Scanner ls = new Scanner(System.in);
   
        System.out.println("Ingrese el nombre:");
        usuario.setNombre(ls.next());
        
        System.out.println("Ingrese el apellido paterno:");
        usuario.setApellidoP(ls.next());
        
        System.out.println("Ingrese el apellido materno:");
        usuario.setApellidoM(ls.next());
        
        System.out.println("Ingrece el Domicilio:");
        usuario.setDimicilio(ls.next());
        
        System.out.println("Ingrese la clave de lector:");
        usuario.setClaveElector(ls.next());
        
        System.out.println("Ingrese la Curp:");
        usuario.setCurp(ls.next());
        
        System.out.println("Ingrese el año de registro:");
        usuario.setAñoRegistro(ls.nextInt());

        System.out.println("Ingrese el No de estado:");
        usuario.setEstado(ls.nextInt());
        
        System.out.println("Ingrese el No de municipio:");
        usuario.setMunicipio(ls.nextInt());
        
        System.out.println("Ingrese el No de seccion:");
        usuario.setSeccion(ls.nextInt());
        
        System.out.println("Ingrese el No de Localidad:");
        usuario.setLocalidad(ls.nextInt());
        
        System.out.println("Ingrese el No de Emicion :");
        usuario.setEmision(ls.nextInt());
        
        System.out.println("Ingrese el No de vigencia:");
        usuario.setVigencia(ls.nextInt());
        

        
        
        c.insertarRegistro(usuario);
       
       System.out.println("El usuario se creo exitosamente");
      


    }
}
