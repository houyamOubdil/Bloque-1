package com.mycompany.bloque1acceso;

import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Bloque1Acceso {

    public static void main(String[] args) throws IOException {
        File Directorio = new File("C:\\dam_accesoDatos");
        File Fichero1 = new File("C:\\dam_accesoDatos\\Ejercicio1");
        File Fichero2 = new File("C:\\dam_accesoDatos\\Ejercicio2");
        
    // 1. Crear el direcotorio dam_accesoDatos: 
        Directorio.mkdir();
        System.out.println(" ");
        
    // 2. Crear fichhero1 Ejercicio1: 
        Fichero1.createNewFile();
        System.out.println("Fichero1 creado con exito ");
        
    // 3. Mostrar por pantalla la longitud del fichero1 (Ejercicio1):
        long longitudFichero1 = Fichero1.length();
            System.out.println("Longitud del fichero 'ejercicio1': " + longitudFichero1 + " bytes");
        
    // 4. Crea un fichero llamado ejercicio2 , dentro del directorio “dam-accesodatos”:
        Fichero2.createNewFile();
        System.out.println("");
        
    // 5. Muestra todos los ficheros del directorio dam_accesoDatos:
        System.out.println("Nombre de los ficheros dentro del directorio dam_accesoDatos: ");
        String Lista[] = Directorio.list();
        for (int i = 0; i < Lista.length; i++){
            System.out.println(Lista[i]);
        }
        
    // 6. Eliminar el fichero2 Ejercicio2: 
        if (Fichero2.delete()== true){
            System.out.println("Se ha eliminado el fichero (Ejercicio2) :) ");
        }else{
            System.out.println("Lo siento, no se ha pudido elimianro el fichero (Ejercicio2), intentalo más tarde");
        }
            System.out.println("");
            
    // 7. Muestra todos los ficheros del directorio dam_accesoDatos: 
        System.out.println("Nombre de los ficheros dentro del directorio dam_accesoDatos: ");
        String Lista1[] = Directorio.list();
        for (int i = 0; i < Lista.length; i++){
            System.out.println(Lista1[i]);
        
    // 8. Eliminar el fichero 1 Ejercicio1: 
      if (Fichero1.delete()== true){
            System.out.println("Se ha eliminado el fichero (Ejercicio1) :) ");
        }else{
            System.out.println("Lo siento, no se ha pudido elimianro el fichero (Ejercicio1), intentalo más tarde");
        }
            System.out.println("");
    }
}
