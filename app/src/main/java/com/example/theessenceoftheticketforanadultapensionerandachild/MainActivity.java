package com.example.theessenceoftheticketforanadultapensionerandachild;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.theessenceoftheticketforanadultapensionerandachild.model.BusTicket;
import com.example.theessenceoftheticketforanadultapensionerandachild.model.ChildBusTicket;
import com.example.theessenceoftheticketforanadultapensionerandachild.model.PensionersBusTicket;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    // создание объекта сущности взрослых билетов (стоимость билета, количество билетов)
    BusTicket BusTicket = new BusTicket ( 70, 9 );
    // создание объекта сущности детских билетов (стоимость билета, количество билетов, скидка)
    ChildBusTicket BusTicketChild = new ChildBusTicket ( 70, 14, 50 );
    // создание объекта сущности билетов для пенсионеров (стоимость билета, количество билетов, скидка)
    PensionersBusTicket pensionersBusTicket = new PensionersBusTicket (70, 5, 30 );;

    // создание полей для вывода на экран нужных значений
    private   TextView busTicketOut; // поле вывода общей стоимости взрослых билетов
    private  TextView childBusTicketOut; // поле вывода общей стоимости детских билетов
    private   TextView pensionersBusTicketOut; // поле вывода общей стоимости билетов для пенсионеров
    private  TextView busTicketTotalOut; // поле вывода общей стоимости всех билетов



    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) { // создание жизненного цикла активности
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main ); // присваивание жизненному циклу активити представления activity_main

        // присваивание переменным активити элементов представления activity_main
        busTicketOut = findViewById ( R.id.busTicketOut ); // вывод информации стоимости всех взрослых билетов
        childBusTicketOut = findViewById ( R.id.childBusTicketOut ); // вывод информации стоимости всех детских билетов
        pensionersBusTicketOut = findViewById ( R.id.pensionersBusTicketOut ); // вывод информации стоимости всех билетов для пенсионеров
        busTicketTotalOut = findViewById ( R.id.busTicketTotalOut ); // вывод информации стоимости всех билетов



        // запонение экрана
        // 1) заполнение первого поля воспоьзовавшись методом подсчёта стоимости взрослых билетов ticketPriceAll()
        // С помощью метода Float.toString() мы конвертировали данные из типа float в String
        busTicketOut.setText ( Float.toString (BusTicket.ticketPriceAll () ) + " монет" );
        // 2) заполнение второго поля воспользовавшись переопределённым методом подсчёта стоимости детских билетов ticketPriceAll()
        childBusTicketOut.setText ( Float.toString ( ChildBusTicket.ticketPriceAll () ) + " монет" );
        // 3) заполнения третьего поля стоимости билетов для пенсионеров
        pensionersBusTicketOut.setText ( Float.toString ( PensionersBusTicket.ticketPriceAll () ) + " монет" );
        // 4) заполнение четвёртого поля стоимостью всех билетов
        busTicketTotalOut.setText ( Float.toString (BusTicket.ticketPriceAll () + ChildBusTicket.ticketPriceAll () + PensionersBusTicket.ticketPriceAll () ) + " монет" );



    }
}
