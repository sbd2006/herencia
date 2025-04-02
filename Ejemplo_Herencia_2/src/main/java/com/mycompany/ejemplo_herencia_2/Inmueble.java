
package com.mycompany.ejemplo_herencia_2;


public class Inmueble {
    
    protected int identificadorinmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    public Inmueble(int identificadorinmobiliario, int area, String direccion) {
        this.identificadorinmobiliario = identificadorinmobiliario;
        this.area = area;
        this.direccion = direccion;
    }
    
    public void calcularPrecioVenta(double valorArea){
        
    }
    
    public void imprimir(){
        
    }
}
