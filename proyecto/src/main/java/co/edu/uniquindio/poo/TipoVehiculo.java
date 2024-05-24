package co.edu.uniquindio.poo;

public enum TipoVehiculo {
    CARRO(2500),
    HIBRIDA(1200),
    CLASICA(1500);

    public int valor;

    private TipoVehiculo(int valor){
        this.valor=valor;
    }
}
