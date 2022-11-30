package com.openbootcamp;

public class VideoJuego {
    public VideoJuego() {}

    String nombre;
    String motor;
    Double metascore;
    Double precio;


    private String datos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }


    public void setMotor(String motor){
        this.motor = motor;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMetascore(Double metascore) {
        this.metascore = metascore;
    }

    public Double getMetascore() {
        return this.metascore;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return this.precio;
    }

}








