/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author SUPERTRONICA
 */
public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Alexander"; 
        cliente1.apellido = "Espinoza";
        cliente1.codigo = 100;
        cliente1.edad = 20;
        cliente1.telefono = 987654321;
        
        System.out.println("Cliente registrado: " + cliente1.nombre + " " + cliente1.apellido);
        
        Cliente cliente2 = new Cliente();
        cliente2.nombre = "Theo";
        cliente2.apellido = "Hernandez";
        cliente2.codigo = 101;
        cliente2.edad = 22;
        cliente2.telefono = 987453451;
        
        System.out.println("Cliente registrado: " + cliente2.nombre + " " + cliente2.apellido);
        
        Cliente cliente3 = new Cliente();
        cliente3.nombre = "Cristiano";
        cliente3.apellido = "Ronaldo";
        cliente3.codigo = 102;
        cliente3.edad = 41;
        cliente3.telefono = 991275926;
        
        System.out.println("Cliente registrado: " + cliente3.nombre + " " + cliente3.apellido);
        
        Cliente cliente4 = new Cliente();
        cliente4.nombre = "Kyllian";
        cliente4.apellido = "Mbappe";
        cliente4.codigo = 103;
        cliente4.edad = 26;
        cliente4.telefono = 973829412;
        
        System.out.println("Cliente registrado: " + cliente4.nombre + " " + cliente4.apellido);
        
        Cliente cliente5 = new Cliente();
        cliente5.nombre= "Fermin";
        cliente5.apellido = "Lopez";
        cliente5.codigo = 104;
        cliente5.edad = 23;
        cliente5.telefono = 981856928;
        
        System.out.println("Cliente registrado: " + cliente5.nombre + " " + cliente5.apellido);
        
        
        Producto producto1 = new Producto();
        producto1.nombre = "Jugo de naranja";
        producto1.descripcion = "Hecho con naranja natural";
        producto1.codigo = 10;
        producto1.categoria = "Bebidas";
        producto1.marca = "Pulp";
        
        System.out.println("Producto: " + producto1.nombre + " | Marca: " + producto1.marca + " | Código: " + producto1.codigo);
        
        Producto producto2 = new Producto();
        producto2.nombre = "Papas fritas";
        producto2.descripcion = "Hechas naturalmente";
        producto2.codigo = 11;
        producto2.categoria = "Frituras";
        producto2.marca = "Ruflex";
        
        System.out.println("Producto: " + producto2.nombre + " | Marca: " + producto2.marca + " | Código: " + producto2.codigo);
        
        Producto producto3 = new Producto();
        producto3.nombre = "Atun";
        producto3.descripcion = "Atun enlatado";
        producto3.codigo = 12;
        producto3.categoria = "Enlatados";
        producto3.marca = "Real";
        
        System.out.println("Producto: " + producto3.nombre + " | Marca: " + producto3.marca + " | Código: " + producto3.codigo);
        
        Producto producto4 = new Producto();
        producto4.nombre = "Arroz";
        producto4.descripcion = "Libra de arroz";
        producto4.codigo = 13;
        producto4.categoria = "Carbohidrato";
        producto4.marca = "Las vegas";
        
        System.out.println("Producto: " + producto4.nombre + " | Marca: " + producto4.marca + " | Código: " + producto4.codigo);
        
        Producto producto5 = new Producto();
        producto5.nombre = "Leche";
        producto5.descripcion = "Feche en funa";
        producto5.codigo = 14;
        producto5.categoria = "Lacteos";
        producto5.marca = "Vita";
        
        System.out.println("Producto: " + producto5.nombre + " | Marca: " + producto5.marca + " | Código: " + producto5.codigo);
        
        
        Proveedor prov1 = new Proveedor();
        prov1.nombre = "Cocacola";
        prov1.id = 1000;
        prov1.contacto = 981638221;
        prov1.ciudad = "Imbabura";
        prov1.categoria = "Bebidas";
        
        System.out.println("Proveedor: " + prov1.nombre + " - " + prov1.ciudad);
        
        Proveedor prov2 = new Proveedor();
        prov2.nombre = "Ruflex";
        prov2.id = 2000;
        prov2.contacto = 981393729;
        prov2.ciudad = "Cuenca";
        prov2.categoria = "Frituras";
        
        System.out.println("Proveedor: " + prov2.nombre + " - " + prov2.ciudad);
        
        Proveedor prov3 = new Proveedor();
        prov3.nombre = "Vita";
        prov3.id = 3000;
        prov3.contacto = 972938191;
        prov3.ciudad = "Carchi";
        prov3.categoria = "Lacteos";
        
        System.out.println("Proveedor: " + prov3.nombre + " - " + prov3.ciudad);
        
        Proveedor prov4 = new Proveedor();
        prov4.nombre = "Scott";
        prov4.id = 4000;
        prov4.contacto = 935628467;
        prov4.ciudad = "Cotopaxi";
        prov4.categoria = "Papel";
        
        System.out.println("Proveedor: " + prov4.nombre + " - " + prov4.ciudad);
        
        Proveedor prov5 = new Proveedor();
        prov5.nombre = "Salticas";
        prov5.id = 5000;
        prov5.contacto = 983749273;
        prov5.ciudad = "Quito";
        prov5.categoria = "Galletas";
        
        System.out.println("Proveedor: " + prov5.nombre + " - " + prov5.ciudad);
        
        
        Vendedor vendedor1 = new Vendedor();
        vendedor1.nombre = "Ricardo";
        vendedor1.apellido = "Calafiori";
        vendedor1.id = 1;
        vendedor1.cargo = "Cajero";
        vendedor1.telefono = 983648164;
        
        System.out.println("Vendedor: " + vendedor1.nombre + " " + vendedor1.apellido);
        
        Vendedor vendedor2 = new Vendedor();
        vendedor2.nombre = "Bruno";
        vendedor2.apellido = "Fernandes";
        vendedor2.id = 2;
        vendedor2.cargo = "Supervisor";
        vendedor2.telefono = 992849173;
        
        System.out.println("Vendedor: " + vendedor2.nombre + " " + vendedor2.apellido);
        
        Vendedor vendedor3 = new Vendedor();
        vendedor3.nombre = "Bernardo";
        vendedor3.apellido = "Silva";
        vendedor3.id = 3;
        vendedor3.cargo = "Organizador";
        vendedor3.telefono = 947294756;
        
        System.out.println("Vendedor: " + vendedor3.nombre + " " + vendedor3.apellido);
        
        Vendedor vendedor4 = new Vendedor();
        vendedor4.nombre = "Gabriel";
        vendedor4.apellido = "Villamil";
        vendedor4.id = 4;
        vendedor4.cargo = "Aseo";
        vendedor4.telefono = 957589260;
        
        System.out.println("Vendedor: " + vendedor4.nombre + " " + vendedor4.apellido);
        
        Vendedor vendedor5 = new Vendedor();
        vendedor5.nombre = "Michael";
        vendedor5.apellido = "Estrada";
        vendedor5.id = 5;
        vendedor5.cargo = "Bodegero";
        vendedor5.telefono = 950273814;
        
        System.out.println("Vendedor: " + vendedor5.nombre + " " + vendedor5.apellido);
        
    }
}

