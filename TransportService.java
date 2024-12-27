package com.transport;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TransportService {
    private List<Bus> buses;

    public TransportService() {
        this.buses = new ArrayList<>();
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public Bus findBusByNumber(String busNumber) {
        for (Bus bus : buses) {
            if (bus.getId().equals(busNumber)) {
                return bus;
            }
        }
        return null;
    }

    public List<Bus> filterAvailableBuses() {
        List<Bus> availableBuses = new ArrayList<>();
        for (Bus bus : buses) {
            if (bus.isAvailable()) {
                availableBuses.add(bus);
            }
        }
        return availableBuses;
    }

    public void sortBusesByCapacity() {
        buses.sort(Comparator.comparingInt(Bus::getCapacity));
    }

    public void displayAllBuses() {
        System.out.println("\nList of all buses:");
        for (Bus bus : buses) {
            bus.displayInfo();
        }
    }
}
