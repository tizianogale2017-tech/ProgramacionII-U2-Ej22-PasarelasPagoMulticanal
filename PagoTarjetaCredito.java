package Ejercicio22_pasarelasPagoMulticanal;

public class PagoTarjetaCredito implements ProcesadorPago {
    private double limiteDisponible;

    public PagoTarjetaCredito(double limiteDisponible) {
        this.limiteDisponible = limiteDisponible;
    }

    @Override
    public boolean procesarPago(double monto) {
        if (monto <= 0 || monto > limiteDisponible) {
            return false;
        }
        limiteDisponible -= monto;
        return true;
    }
}
