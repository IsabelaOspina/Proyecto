package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private double velocidadMaxima;
    

    public Moto(String placa, String modelo, Propietario propietario,Puesto puesto, double velocidadMaxima) {
        super(placa, modelo, propietario,puesto);
        this.velocidadMaxima = velocidadMaxima;
        this.tipo=tipo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public String getPlaca() {
        return super.getPlaca();
    }

    @Override
    public Propietario getPropietario() {
        return super.getPropietario();
    }

    @Override
    public Puesto getPuesto() {
        return super.getPuesto();
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    @Override
    public void setPropietario(Propietario propietario) {
        super.setPropietario(propietario);
    }

    @Override
    public void setPuesto(Puesto puesto) {
        super.setPuesto(puesto);
    }
    
   
}
