/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author SUPERTRONICA
 */
public class Proveedor {
    public String nombre;
    public int id;
    public int contacto;
    public String ciudad;
    public String categoria;

    public Proveedor() {
    }

    public Proveedor(String nombre, int id, int contacto, String ciudad, String categoria) {
        // Validación 1: el nombre no puede tener números
        // matches() verifica si el texto cumple un patrón
        // ".*\\d.*" significa: cualquier texto que contenga al menos un dígito (0-9)
        if (nombre.matches(".*\\d.*")) {
            // Esta excepción se usa cuando un dato numérico aparece donde no debería
            throw new NumberFormatException("El nombre del proveedor no puede contener números");
        }
        
        // Validación 2: el contacto debe tener exactamente 9 dígitos
        // String.valueOf() convierte el número a texto para poder medir su longitud
        if (String.valueOf(contacto).length() != 9) {
            // Esta excepción se usa cuando un valor numérico no cumple una regla matemática
            throw new ArithmeticException("El contacto debe tener exactamente 9 dígitos");
        }
        
        this.nombre = nombre;
        this.id = id;
        this.contacto = contacto;
        this.ciudad = ciudad;
        this.categoria = categoria;
    }
    
}
