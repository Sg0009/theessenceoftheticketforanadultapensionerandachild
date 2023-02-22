package com.example.theessenceoftheticketforanadultapensionerandachild.model;

public class BusTicket {
    private String departurePoint; // место отправления
    private String arrivalPoint; // место прибытия
    private String departureDate; // время отправления
    private String arrivalDate; // время прибытия
    private String travelTime; // время пути
    private int distance; // расстояние пути
    private static float ticketPrice; // стоимость взрослого билета
    private static int numberOfTickets; // количество билетов

    // создание пустого конструктора
    public BusTicket() {
    }

    // создание конструктора исходных данных (стоимость билета, количество билетов)
    public BusTicket(float ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice; // стоимость взрослого билета
        this.numberOfTickets = numberOfTickets; // количество билетов
    }


    // метод подсчёта стоимости взрослых билетов
    public static float ticketPriceAll() {
        return ticketPrice * numberOfTickets; // нужно умножить количество билетов на стоимость одного билета
    }

    // создание геттеров и сеттеров
    public static float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public static int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
