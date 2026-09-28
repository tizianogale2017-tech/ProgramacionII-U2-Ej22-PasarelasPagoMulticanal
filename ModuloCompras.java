package Ejercicio22_pasarelasPagoMulticanal;

public class ModuloCompras {
    private ProcesadorPago procesador;

    public ModuloCompras(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void setProcesador(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void comprar(String producto, double monto) {
        if (procesador.procesarPago(monto)) {
            System.out.println("COMPROBANTE: " + producto + " por $" + monto + " - pago aprobado.");
        } else {
            System.out.println("RECHAZO: " + producto + " por $" + monto + " - pago no aprobado.");
        }
    }
}
