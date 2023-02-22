package com.example.theessenceoftheticketforanadultapensionerandachild.model;

public class ChildBusTicket extends BusTicket  {

    // задание полей
        private static float ticketDiscount; // скидка на детский билет

        // создание пустого конструктора
        public ChildBusTicket() {
        }
        // создание конструктора исходных данных детского билета (стоимость билета, количество билетов, скидка)
        public ChildBusTicket(float ticketPrice, int numberOfTickets, float ticketDiscount) {
            super(ticketPrice, numberOfTickets);
            this.ticketDiscount = ticketDiscount;
        }

        // переопределение метода подсчёта стоимости детских билетов

    public static float ticketPriceAll() {
            return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
        }


}
