package Ejercicio22_pasarelasPagoMulticanal;

public class Main {
    public static void main(String[] args) {
        ModuloCompras compras = new ModuloCompras(new PagoTarjetaCredito(100000.0));
        System.out.println("--- Tarjeta de crédito ---");
        compras.comprar("Auriculares", 60000.0);
        compras.comprar("Notebook", 900000.0);

        compras.setProcesador(new PagoCriptomoneda());
        System.out.println("--- Criptomoneda ---");
        compras.comprar("Mouse", 3000.0);
        compras.comprar("Monitor", 250000.0);

        compras.setProcesador(new PagoBilleteraVirtual(40000.0));
        System.out.println("--- Billetera virtual ---");
        compras.comprar("Teclado", 35000.0);
        compras.comprar("Webcam", 20000.0);
    }
}
