package edu.iu.lvanjelg.c322spring2024homework2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="guitar",name="guitars")
public class Guitar {
    @Id
    private String serialNumber;
    private double price;
    private Builder builder;
    public static enum Builder{
        FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS;
        public String toString(){
            switch(this){
                case FENDER: return "Fender";
                case MARTIN: return "Martin";
                case GIBSON: return "Gibson";
                case COLLINGS: return "Collings";
                case OLSON: return "Olson";
                case RYAN: return "Ryan";
                case PRS: return "PRS";
                default: return "unspecified";
            }
        }
    }
    private String model;
    private Type type;
    public static enum Type{
        ACOUSTIC, ELECTRIC;
        public String toString(){
            switch(this){
                case ACOUSTIC: return "acoustic";
                case ELECTRIC: return "electric";
                default: return "unspecified";
            }
        }
    }
    public static enum Wood{
        INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
        public String toString(){
            switch(this){
                case INDIAN_ROSEWOOD: return "Indian Rosewood";
                case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
                case MAHOGANY: return "Mahogany";
                case MAPLE: return "Maple";
                case COCOBOLO: return "Cocobolo";
                case CEDAR: return "Cedar";
                case ADIRONDACK: return "Adirondack";
                case ALDER: return "Alder";
                case SITKA: return "Sitka";
                default: return "unspecified";
            }
        }
    }
    private Wood backWood;
    private Wood topWood;
    public Guitar(){}
    public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood){
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = Builder.valueOf(builder.toUpperCase());
        this.model = model;
        this.type = Type.valueOf(type.toUpperCase());
        this.backWood = Wood.valueOf(backWood.toUpperCase());
        this.topWood = Wood.valueOf(topWood.toUpperCase());
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }
    public String toString(){
        return this.serialNumber + ", " + this.price + ", " + this.builder + ", " + this.model + ", " + this.type + ", " + this.backWood + ", " + this.topWood;
    }
}