package com.almacen;

/**
 * Created by Ray on 30/03/2017.
 * Clase padre electrodomestico ,todas las clases hijos heredaras sus atributos
 * Clase electrodomestico con los atributos marca,modelo,preciobase,consumoelectrico,altura,anchura y peso.
 */
public abstract class Electrodomestico {
    private String marca;
    private String modelo;
    private int preciobase;
    private char consumoelectrico;
    private int altura;
    private int anchura;
    private int peso;

    //Constructores

    /**
     * Constructor por defecto
     */
    public Electrodomestico() {
        this("","",0,'F',0,0,0);
    }

    /**
     * Constructor con todos los atributos
     * @param marca tipo de marca del electrodomestico
     * @param modelo de electrodomestico
     * @param preciobase precio base del electrodomestico (numerico)
     * @param consumoelectrico del electrodomestico (numerico)
     * @param altura del electrodomestico en metros
     * @param anchura del electrodomestico
     * @param peso del electrodomestico
     * ComprobarConsumo : Direcciona al metodo de comprobar el consumo
     */

    public Electrodomestico(String marca, String modelo, int preciobase, char consumoelectrico, int altura, int anchura, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.preciobase = preciobase;
        this.consumoelectrico = consumoelectrico;
        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
        comprobarConsumo(consumoelectrico);
    }

    //GETTER AND SHETTER

    /**
     * Getter de Marca
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Shetter de marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Getter de modelo
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Shetter de modelo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Getter de preciobase
     * @return
     */
    public int getPreciobase() {
        return preciobase;
    }

    /**
     * Shetter de preciobase
     * @param preciobase
     */
    public void setPreciobase(int preciobase) {
        this.preciobase = preciobase;
    }

    /**
     * Getter de consumoelectrico
     * @return
     */
    public int getConsumoelectrico() {
        return consumoelectrico;
    }

    /**
     * Shetter de consumoelectrico
     * @param consumoelectrico
     */
    public void setConsumoelectrico(char consumoelectrico) {
        this.consumoelectrico = consumoelectrico;
    }

    /**
     * Getter de altura
     * @return
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Shetter de altura
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Getter
     * @return
     */
    public int getAnchura()  {
        return anchura;
    }

    /**
     * Shetter de anchura
     * @param anchura
     */
    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    /**
     * Getter de peso
     * @return
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Shetter de peso
     * @param peso
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    //METODOS

    /**
     * Metodo que comprueba si el valor esta puesto en mayuscula
     * @param consumoelectrico
     */
    public void comprobarConsumo(char consumoelectrico){

        if(consumoelectrico>=65 && consumoelectrico<=70){
            this.consumoelectrico=consumoelectrico;
        }else{
            this.consumoelectrico=consumoelectrico;
        }

    }

    /**
     * Metodo que calcula el preciobruto segun el consumo electrico
     * @return
     */
    public double preciobruto() {
        double plus = 0;
        switch (consumoelectrico) {
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus += 60;
                break;
            case 'D':
                plus += 50;
                break;
            case 'E':
                plus += 30;
                break;
            case 'F':
                plus += 10;
                break;
        }
        return preciobase+plus;
    }

    /**
     * Metodo que calcula el coste del trasporte segun el peso que tenga
     * @return
     */
    public double preciotransporte(){
        double costetrasporte= 0;

        if(peso>=0 && peso<19){
            costetrasporte+=10;
        }else if(peso>=20 && peso<49){
            costetrasporte+=50;
        }else if(peso>=50 && peso<=79){
            costetrasporte+=80;
        }else if(peso>=80){
            costetrasporte+=100;
        }

        return costetrasporte;
    }

    /**
     * Imprime todos los datos de electrodomesticos
     * @return
     */
    //ToString

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", preciobase=" + preciobase +
                ", consumoelectrico=" + consumoelectrico +
                ", altura= " + altura + " Metros" +
                ", anchura= " + anchura + " Metros" +
                ", peso= " + peso + " Kg" +
                '}';
    }
}
