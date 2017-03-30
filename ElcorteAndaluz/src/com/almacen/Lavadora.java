package com.almacen;

/**
 * Created by Ray on 30/03/2017.
 * Clase hija que herada los atributos del padre (electrodomestico)
 * Clase Lavadora con atributos carga ,revolucionesporminuto y tipo
 */
public class Lavadora extends Electrodomestico {
    private String carga;
    private int revolucionesporminuto;
    private String tipo;

    //Constructores

    /**
     * Constructor por defecto
     */
    public Lavadora() {
        this("","",0,'F',0,0,0,"",0,"");
    }

    /**
     * Constructor con los parametros de lavadora y de electrodomestico (a sido heredado de la padre = electrodomestico)
     * @param marca marca de la lavadora
     * @param modelo modelo de la lavadora
     * @param preciobase precio base de la lavadora
     * @param consumoelectrico consumo electrico que tine
     * @param altura altura que tiene la lavadora
     * @param anchura anchura que tiene la lavadora
     * @param peso peso que tiene la lavadora
     * @param carga carga que soprota la lavadora
     * @param revolucionesporminuto revoluciones por minuto que puede tener
     * @param tipo tipo de lavadora
     */
    public Lavadora(String marca, String modelo, int preciobase, char consumoelectrico, int altura, int anchura, int peso, String carga, int revolucionesporminuto, String tipo) {
        super(marca, modelo, preciobase, consumoelectrico, altura, anchura, peso);
        this.carga = carga;
        this.revolucionesporminuto = revolucionesporminuto;
        this.tipo = tipo;
    }

    //GETTER AND SHETTER


    /**
     * Getter de carga
     * @return
     */
    public String getCarga() {
        return carga;
    }

    /**
     * Shetter de carga
     * @param carga
     */
    public void setCarga(String carga) {
        this.carga = carga;
    }

    /**
     * Getter de revoluciones por minuto
     * @return
     */
    public int getRevolucionesporminuto() {
        return revolucionesporminuto;
    }

    /**
     * Shetter de revoluciones por minuto
     * @param revolucionesporminuto
     */
    public void setRevolucionesporminuto(int revolucionesporminuto) {
        this.revolucionesporminuto = revolucionesporminuto;
    }

    /**
     * Getter de tipo
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Shetter de tipo
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    //ToString

    /**
     * Imprime todos los datos de lavadora
     * @return
     */

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga='" + carga + '\'' +
                ", revolucionesporminuto=" + revolucionesporminuto +
                ", tipo='" + tipo + '\'' +
                '}';
    }


}
