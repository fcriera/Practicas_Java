package ejercicio2;
public class ejercicio2 {
    
    public static void main (String[] args) {
        //Se crean dos objetos de clase Producto: se establecen los atributos nombre y precio unitario
        Producto jabon = new Producto ("Jabón",20.5);
        System.out.println(jabon.getPrecioUnitario());
        Producto leche = new Producto ("Leche",0.5);
        System.out.println(leche.getPrecioUnitario());
        // Se instancia un arraylist productosDeJuan de la clase CuentaSupermercado
        CuentaSupermercado productosDeJuan = new CuentaSupermercado();
        // Se agregan los productos al arrayList productosDeJuan con el método agregarProducto
        productosDeJuan.agregarProducto(leche);
        productosDeJuan.agregarProducto(jabon);
        productosDeJuan.agregarProducto(leche);
        productosDeJuan.agregarProducto(leche);
        // Con el método mostrarCuenta se devuelve la cuenta de todos los productos ingresados en productosDeJuan
        System.out.println(productosDeJuan.mostrarCuenta());
        // Se prueba con otro arrayList: productos de pepe
        CuentaSupermercado productosDePepe = new CuentaSupermercado();
        productosDePepe.agregarProducto(jabon);
        productosDePepe.agregarProducto(leche);
        productosDePepe.agregarProducto(jabon);
        productosDePepe.agregarProducto(leche);
        productosDePepe.agregarProducto(jabon);

        System.out.println(productosDePepe.mostrarCuenta());
    }
}
