package org.example;

public class Nout {
    /**
     * Наименование бренда.
     */
    private String name;
    /**
     * Операционная система.
     */
    private String windows;
    /**
     * Номер модели.
     */
    private int nomerModeli;

    /**
     * Объем оперативной памяти.
     */
    private int ozy;

    /**
     * цвет ноутбука
     */
    private String color;
    /**
     * Размер жесткого диска
     */
    private int razmerHdd;


    public Nout(String name, String windows, int nomerModeli, int ozy, String color, int razmerHdd) {
        this.name = name;
        this.windows = windows;
        this.nomerModeli = nomerModeli;
        this.ozy = ozy;
        this.color = color;
        this.razmerHdd = razmerHdd;
    }

    public String getName() {
        return name;
    }

    public String getWindows() {
        return windows;
    }

    public int getNomerModeli() {
        return nomerModeli;
    }

    public int getOzy() {
        return ozy;
    }

    public String getColor() {
        return color;
    }

    public int getRazmerHdd() {
        return razmerHdd;
    }

    @Override
    public String toString() {
        return "Nout{" +
                "name='" + name + '\'' +
                ", windows='" + windows + '\'' +
                ", nomerModeli=" + nomerModeli +
                ", ozy=" + ozy +
                ", color='" + color + '\'' +
                ", razmerHdd=" + razmerHdd +
                '}';
    }
}




