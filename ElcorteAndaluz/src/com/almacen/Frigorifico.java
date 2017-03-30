package com.almacen;

/**
 * Created by Ray on 30/03/2017.
 * Clase hija que herada los atributos del padre (electrodomestico)
 * Clase Frigorifico con atributos capacidadtotal,capacidadcongelador,caracteristicas.
 */
public class Frigorifico extends Electrodomestico{
    private int capacidadtotal;
    private int capacidadcongelador;
    private String caracteristicas;


    //Constructores

    /**
     * Constructor por defecto
     */
    public Frigorifico() {
        this("","",0,'F',0,0,0,0,0,"");
    }

    /**
     * Constructor con los parametros de Frigorifico y de electrodomestico (a sido heredado de la padre = electrodomestico)
     * @param marca marca del frigorifico
     * @param modelo modelo del frigorifico
     * @param preciobase precio base del frigorifico
     * @param consumoelectrico consumo electrico que tiene
     * @param altura que tiene
     * @param anchura que tiene
     * @param peso que tiene
     * @param capacidadtotal capacidad total de litros que tiene
     * @param capacidadcongelador capacidad de congelador que tiene
     * @param caracteristicas caracteristicas que tiene
     */
    public Frigorifico(String marca, String modelo, int preciobase, char consumoelectrico, int altura, int anchura, int peso, int capacidadtotal, int capacidadcongelador, String caracteristicas) {
        super(marca, modelo, preciobase, consumoelectrico, altura, anchura, peso);
        this.capacidadtotal = capacidadtotal;
        this.capacidadcongelador = capacidadcongelador;
        this.caracteristicas = caracteristicas;
    }

    //GETTER AND SHETTER

    /**
     * Getter de capacidadtotal
     * @return
     */
    public int getCapacidadtotal() {
        return capacidadtotal;
    }

    /**
     * Shetter de capacidad total
     * @param capacidadtotal
     */
    public void setCapacidadtotal(int capacidadtotal) {
        this.capacidadtotal = capacidadtotal;
    }

    /**
     * Getter de capacidad del congelador
     * @return
     */
    public int getCapacidadcongelador() {
        return capacidadcongelador;
    }

    /**
     * Shetter de capacidad del congelador
     * @param capacidadcongelador
     */
    public void setCapacidadcongelador(int capacidadcongelador) {
        this.capacidadcongelador = capacidadcongelador;
    }

    /**
     * Getter de caracteristicas
     * @return
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * Shetter de caracteristicas
     * @param caracteristicas
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    //ToString

    /**
     * Imprime todos los datos de lavadora
     * @return
     */
    @Override
    public String toString() {
        return "Frigorifico{" +
                "capacidadtotal=" + capacidadtotal + " Litros" +
                ", capacidadcongelador=" + capacidadcongelador + " Litros"+
                ", caracteristicas='" + caracteristicas + '\'' +
                '}';
    }


}
