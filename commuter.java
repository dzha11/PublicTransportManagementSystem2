package com.transport;

import java.util.Objects;

public class Commuter {
    private String name;
    private String id;
    private String contactNumber;

    public Commuter(String name, String id, String contactNumber) {
        this.name = name;
        this.id = id;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void displayInfo() {
        System.out.println("Commuter Name: " + name + ", ID: " + id + ", Contact: " + contactNumber);
    }

    @Override
    public String toString() {
        return "Commuter{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commuter commuter = (Commuter) o;
        return id.equals(commuter.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
