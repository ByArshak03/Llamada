package EjercicioLlamada;

import java.time.LocalDate;
import java.time.LocalTime;

public class Llamada {
    private String nuemroCliente;
    private String numeroInterlocutor;
    private boolean saliente;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    private double tarifa[] = {0.2, 0.4, 0.5, 0.7, 0.8};


    public Llamada(String nuemroCliente, String numeroInterlocutor, boolean saliente, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, double tarifa) {
        this.nuemroCliente = nuemroCliente;
        this.numeroInterlocutor = numeroInterlocutor;
        this.saliente = saliente;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tarifa = tarifa;
    }

    public String getNuemroCliente() {
        return nuemroCliente;
    }

    public void setNuemroCliente(String nuemroCliente) {
        this.nuemroCliente = nuemroCliente;
    }

    public String getNumeroInterlocutor() {
        return numeroInterlocutor;
    }

    public void setNumeroInterlocutor(String numeroInterlocutor) {
        this.numeroInterlocutor = numeroInterlocutor;
    }

    public boolean getSaliente() {
        return saliente;
    }

    public void setSaliente(boolean saliente) {
        this.saliente = saliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public String compareTo(Object o) {
        return this.nuemroCliente;.compareTo(o.nuemroCliente);
    }
    public LocalDate compareTo(Object o) {
        return this.fecha.compareTo(o.fecha);
    }
    public LocalTime compareTo(Object o) {
        return this.horaInicio.compareTo(o.horaInicio);
    }
}


