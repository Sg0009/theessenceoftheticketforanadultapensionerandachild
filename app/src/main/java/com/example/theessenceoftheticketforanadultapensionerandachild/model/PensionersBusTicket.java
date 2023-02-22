package com.example.theessenceoftheticketforanadultapensionerandachild.model;


  public class  PensionersBusTicket extends BusTicket {
    private static float ticketDiscount;
    // создание пустого конструктора
    public PensionersBusTicket() {
    }
    // создание конструктора исходных данных билета для пенсионера (стоимость билета, количество билетов, скидка)
    public PensionersBusTicket(float ticketPrice, int numberOfTickets, float ticketDiscount) {
      super(ticketPrice, numberOfTickets);
      this.ticketDiscount = ticketDiscount;
    }

    public static float ticketPriceAll() {
      return (getTicketPrice () * getNumberOfTickets () * (100 - ticketDiscount)) / 100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }






  }







