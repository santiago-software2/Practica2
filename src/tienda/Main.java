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
        
        Cliente cliente6 = new Cliente("Mario","Ramirez",105,22,986547644);
        Cliente cliente7 = new Cliente("Ronaldinho","Gaucho",106,25,948576231);
        Cliente cliente8 = new Cliente("Neymar","Junior",107,34,927474561);
        Cliente cliente9 = new Cliente("Vinicus","Junior",26,108,974827412);
        Cliente cliente10 = new Cliente("Erling","Haaland",25,109,948138432);
        
        System.out.println("Total de clientes registrados: " + Cliente.obtenerTotalClientes());
        
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
        
        Producto producto6 = new Producto ("Gomitas","De sabores artificiales",11,"Dulces","Colombina");
        Producto producto7 = new Producto ("Yeyis","Yogurts de sabores",12,"Lacteos","Vita");
        Producto producto8 = new Producto ("Aceite","Aceite de oliva",13,"Grasas","La favorita");
        Producto producto9 = new Producto ("Desodorante","Black and white",14,"Aseo","Nivea");
        Producto producto10 = new Producto ("Pasta de dientes","Crema de dientes",15,"Aseo","Sensodyne");
        
        // "try" significa "intenta hacer esto"
        try {
            // Intentamos crear un producto con código -5 (inválido)
            // Esto va a disparar el throw que está en el constructor de Producto
            Producto producto11 = new Producto("Galletas", "Galletas de chocolate", -5, "Snacks", "Oreo");
            // Esta línea NUNCA se ejecuta si el constructor lanzó una excepción
            System.out.println("Producto creado: " + producto11.nombre);
            } 
        //"catch" significa "atrapa el error"
        catch (IllegalArgumentException e) {
            // e.getMessage() devuelve el texto que escribimos en el throw
            System.out.println("Error al crear producto: " + e.getMessage());
        }
        
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
        
        Proveedor prov6 = new Proveedor("Pepsi",6000,984739173,"Sucumbios","Gaseosas");
        Proveedor prov7 = new Proveedor("Panini",7000,972847533,"Manta","Cromos");
        Proveedor prov8 = new Proveedor("LEGO",8000,984816482,"Loja","Juguetes");
        Proveedor prov9 = new Proveedor("MARVEL",9000,993857181,"Latacunga","Peliculas");
        Proveedor prov10 = new Proveedor("Pringles",10000,918382638,"Bolivar","Frituras");
        
        try {
            // Intentamos crear un proveedor con nombre inválido (tiene números)
            Proveedor prov11 = new Proveedor("Ponny malta 123", 500, 981638221, "Quito", "Bebidas");
            // Esta línea no se ejecuta si se lanzó una excepción
            System.out.println("Proveedor creado: " + prov11.nombre);
            } 
        // Atrapa el error de nombre con números
        catch (NumberFormatException e) {   
            System.out.println("Error en el nombre: " + e.getMessage());
        }
        
        try {
            // Intentamos crear un proveedor con contacto de solo 5 dígitos (inválido)
            Proveedor prov12 = new Proveedor("Nestlé", 501, 12345, "Guayaquil", "Lacteos");
            // Esta línea no se ejecuta si se lanzó una excepción
            System.out.println("Proveedor creado: " + prov12.nombre);
            }
        // Atrapa el error del contacto inválido
        catch (ArithmeticException e) {
        System.out.println("Error en el contacto: " + e.getMessage());
        }
        
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
        
        Vendedor vendedor6 = new Vendedor("Federico","Valverde",6,"Televentas",938492821);
        Vendedor vendedor7 = new Vendedor("Arda","Guller",7,"Manager",923728472);
        Vendedor vendedor8 = new Vendedor("Alvaro","Carreras",8,"Gerente",918273263);
        Vendedor vendedor9 = new Vendedor("Ferland","Mendy",9,"Asesor de ventas",959373927);
        Vendedor vendedor10 = new Vendedor("Gonzalo","Garcia",10,"Marketing",983937283);
    }
}

