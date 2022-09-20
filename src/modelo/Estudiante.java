/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lglui
 */
public class Estudiante extends Persona2 {
    private String carne;
     public Estudiante(){}

    public Estudiante(String carne, String nombres, String apellidos, String direccion, String telefono, String genero, String email, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, genero, email, fecha_nacimiento);
        this.carne = carne;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }
    
    @Override
    public void agregar (){
        
    System.out.println("Carne:" + getCarne());
     System.out.println("Nombres:" + getCarne());
      System.out.println("Apellidos:" + getCarne());
       System.out.println("Direccion:" + getCarne());
        System.out.println("Telefono:" + getCarne());
          System.out.println("Genero:" + getCarne());
            System.out.println("Email:" + getCarne());
             System.out.println("Fecha Nacimiento:" + getFecha_nacimiento());
              System.out.println("_______________________________________" );
             



        
    }
   
    
    
}
