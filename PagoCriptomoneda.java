package Ejercicio22_pasarelasPagoMulticanal;

public class PagoCriptomoneda implements ProcesadorPago {
    private static final double MONTO_MINIMO = 5000.0;

    @Override
    public boolean procesarPago(double monto) {
        return monto >= MONTO_MINIMO;
    }
}
