package com.mcubes.beans;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */
public class Laptop {

    // Required fields
    private String ram;
    private String hdd;
    private String cpu;


    // Optional fields
    private float screenSize;
    private String os;
    private boolean graphicsCardEnabled;

    /**
     * Create private parameterized constructor that take
     * a object of 'LaptopBuilder' as a parameter.
     */
    private Laptop(LaptopBuilder laptopBuilder){
        this.ram = laptopBuilder.ram;
        this.hdd = laptopBuilder.hdd;
        this.cpu = laptopBuilder.cpu;
        this.screenSize = laptopBuilder.screenSize;
        this.os = laptopBuilder.os;
        this.graphicsCardEnabled = laptopBuilder.graphicsCardEnabled;
    }

    /**
     * Create getter methods of fields to get the value
     * and don't provide any setter method so that
     * the value of fields can't changed from outside.
     */

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public String getOs() {
        return os;
    }

    public boolean isGraphicsCardEnabled() {
        return graphicsCardEnabled;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                ", screenSize=" + screenSize + " inch" +
                ", os='" + os + '\'' +
                ", graphicsCardEnabled=" + graphicsCardEnabled +
                '}';
    }

    /**
     * Create static Builder class that contain same
     * fields as Top level class.
     */
    public static class LaptopBuilder{

        // Required fields
        private String ram;
        private String hdd;
        private String cpu;

        // Optional fields
        private float screenSize;
        private String os;
        private boolean graphicsCardEnabled;

        /**
         * Create parameterized constructor with
         * required parameter only.
         */
        public LaptopBuilder(String ram, String hdd, String cpu) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }

        /**
         * Create setter methods for all kind of
         * optional fields and make sure that
         * methods return type is 'LaptopBuilder'.
         */
        public LaptopBuilder setScreenSize(float screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public LaptopBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public LaptopBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            this.graphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        /**
         * Create a builder method by which we
         * will return the actual object of
         * top level class.
         */
        public Laptop build(){
            return new Laptop(this);
        }

    }
}
