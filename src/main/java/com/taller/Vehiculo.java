package com.mycompany.src.main.java.com.taller;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int horaEntrada;
    private int horaSalida;

    public Vehiculo(String marca, String modelo, String placa,int horaEntrada, int horaSalida) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.horaEntrada=horaEntrada;
        this.horaSalida=horaSalida;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
}