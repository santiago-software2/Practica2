/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author SUPERTRONICA
 */
public class Cliente {
    //VARIABLE ESTATICA
    public static int totalClientes = 0;
    //SON VARIABLES GLOBALES
    public String nombre;
    public String apellido;
    public int codigo;
    public int edad;
    public int telefono;
    
    public Cliente() {
        totalClientes++;
    } 
    
    public Cliente(String nombre, String apellido, int codigo, int edad, int telefono) {
        totalClientes++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    public static int obtenerTotalClientes(){
        return totalClientes;
    }
}
