/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author SUPERTRONICA
 */
public class Producto {
    public String nombre;
    public String descripcion;
    public int codigo;
    public String categoria;
    public String marca;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, int codigo, String categoria, String marca) {
        // Validación 1: el código debe ser un número positivo
        // Si alguien manda un código negativo o 0, no tiene sentido (no existe un producto con código -5)
        if (codigo <= 0){
            // "throw" significa LANZAR una excepción
            // Esto detiene la ejecución del constructor inmediatamente
            throw new IllegalArgumentException("El código del producto debe ser mayor que 0");
        }
        
        // Validación 2: el nombre no puede estar vacío ni ser null
        // null == sin valor / isEmpty() == el texto existe pero está vacío ("")
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío");
        }
        
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.categoria = categoria;
        this.marca = marca;
    }
    
}
