package com.transport;

public class Main {
    public static void main(String[] args) {
        // Создание автобусов
        Bus bus1 = new Bus("BUS001", "Иван Иванов", 40, true);
        Bus bus2 = new Bus("BUS002", "Петр Петров", 50, false);
        Bus bus3 = new Bus("BUS003", "Сергей Сергеев", 60, true);

        // Создание пассажиров
        Commuter commuter1 = new Commuter("Алиса", "CMT001", "123-456-7890");
        Commuter commuter2 = new Commuter("Боб", "CMT002", "987-654-3210");

        // Служба транспорта
        TransportService service = new TransportService();
        service.addBus(bus1);
        service.addBus(bus2);
        service.addBus(bus3);

        // Вывод всех автобусов
        service.displayAllBuses();

        // Фильтрация доступных автобусов
        System.out.println("\nAvailable buses:");
        for (Bus bus : service.filterAvailableBuses()) {
            bus.displayInfo();
        }

        // Сортировка автобусов по вместимости
        System.out.println("\nBuses sorted by capacity:");
        service.sortBusesByCapacity();
        service.displayAllBuses();

        // Поиск автобуса
        Bus foundBus = service.findBusByNumber("BUS002");
        if (foundBus != null) {
            System.out.println("\nFound bus:");
            foundBus.displayInfo();
        } else {
            System.out.println("\nBus not found.");
        }
    }
}
