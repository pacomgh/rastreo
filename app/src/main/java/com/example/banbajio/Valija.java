package com.example.banbajio;

public class Valija {

    int id, numValija;
    String depEnvio;
    String depRecibe;
    String ciudadEnvio;
    String ciudadDestino;
    String fechaCreacion;
    String fechaEnvio;
    double guia;
    String descripcion;

    public Valija(){ toString(); }

    public int getId() {
        return id;
    }

    public int getNumValija() {
        return numValija;
    }

    public String getDepEnvio() {
        return depEnvio;
    }

    public String getDepRecibe() {
        return depRecibe;
    }

    public String getCiudadEnvio() {
        return ciudadEnvio;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public double getGuia() {
        return guia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumValija(int numValija) {
        this.numValija = numValija;
    }

    public void setDepEnvio(String depEnvio) {
        this.depEnvio = depEnvio;
    }

    public void setDepRecibe(String depRecibe) {
        this.depRecibe = depRecibe;
    }

    public void setCiudadEnvio(String ciudadEnvio) {
        this.ciudadEnvio = ciudadEnvio;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public void setGuia(double guia) {
        this.guia = guia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Valija(String depEnvio, String depRecibe,
                  String ciudadEnvio, String ciudadDestino, String fechaCreacion,
                  String fechaEnvio, /*double guia*/ String descripcion) {
        //this.id = id;
        //this.numValija = numValija;
        this.depEnvio = depEnvio;
        this.depRecibe = depRecibe;
        this.ciudadEnvio = ciudadEnvio;
        this.ciudadDestino = ciudadDestino;
        this.fechaCreacion = fechaCreacion;
        this.fechaEnvio = fechaEnvio;
        //this.guia = guia;
        this.descripcion = descripcion;
    }

    public String toString(){
        return "Departamento de envio: "+depEnvio+" \n" +
                "Deppartamento que recib: "+depRecibe+" \n" +
                "Ciudad de envio: "+ciudadEnvio+" \n" +
                "Ciudad de destino: "+ciudadDestino+" \n" +
                "Fecha de creacion del paquete: "+fechaCreacion+" \n" +
                "Fecha de envio del paquete: "+fechaEnvio;
    }


}
