package com.mac190.reviewfinal2;

import java.util.Objects;

public abstract class Transport {
    // Fields: brand (String), model (String)
    private String brand;
    private String model;
    // default constructor
    public Transport() {
        this.brand = "N/A";
        this.model = "N/A";
    }

    // Constructor with parameters for both fields
    public Transport(String b, String m) {
        this.brand = b;
        this.model = m;
    }
    // Copy constructor
    public Transport(Transport T) {
        this.brand = T.brand;
        this.model = T.model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Abstract method: double computeRange()
    abstract double computeRange();
    // toString() returns: "Transport - Brand: <brand>, Model: <model>"
    @Override
    public String toString() {
        return "Transport - Brand: " + brand + "," + " Model: " + model;
    }

    // Method equals(Transport other) returns true if brand and model are the same
    public boolean equals(Transport other) {
        if (other == null) return false;
        if(other == this) return true;
        return Objects.equals(brand, other.brand) && Objects.equals(model, other.model);
    }
}