package co.edu.uniquindio.poo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Registro {
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;

    public Registro(LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public long CalcularHoraTotal(LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        Duration duracion = Duration.between(getHoraEntrada(), getHoraSalida());
        long horasPermanencia = duracion.toHours();
        return horasPermanencia;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

}
