package com.transport;

import java.util.Objects;

public class Bus extends Vehicle {
    private String driverName;
    private int capacity;
    private boolean available;

    public Bus(String id, String driverName, int capacity, boolean available) {
        super(id);
        this.driverName = driverName;
        this.capacity = capacity;
        this.available = available;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bus ID: " + getId() + ", Driver: " + driverName +
                ", Capacity: " + capacity + ", Available: " + available);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id='" + getId() + '\'' +
                ", driverName='" + driverName + '\'' +
                ", capacity=" + capacity +
                ", available=" + available +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return getId().equals(bus.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
