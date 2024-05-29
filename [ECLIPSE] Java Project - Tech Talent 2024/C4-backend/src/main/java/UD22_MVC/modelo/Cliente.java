package UD22_MVC.modelo;

import java.sql.Date;

public class Cliente {
   private int id;
   private String nombre;
   private String apellido1;
   private String apellido2;
   private String direccion;
   private String dni;
   private Date fecha;

   // Getters y setters
   public int getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public String getApellido1() {
       return apellido1;
   }

   public void setApellido1(String apellido1) {
       this.apellido1 = apellido1;
   }

   public String getApellido2() {
       return apellido2;
   }

   public void setApellido2(String apellido2) {
       this.apellido2 = apellido2;
   }

   public String getDireccion() {
       return direccion;
   }

   public void setDireccion(String direccion) {
       this.direccion = direccion;
   }

   public String getDni() {
       return dni;
   }

   public void setDni(String dni) {
       this.dni = dni;
   }

   public Date getFecha() {
       return fecha;
   }

   public void setFecha(Date fecha) {
       this.fecha = fecha;
   }
}