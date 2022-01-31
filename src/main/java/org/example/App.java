package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

public class App
{
    public static void main( String[] args )
    {
        HashSet<String> matronNicks = new HashSet<>();
        HashSet<String> matronGuilds = new HashSet<>();
        matronNicks.add("MatronDeWinter");
        matronNicks.add("Rydia");
        matronGuilds.add("chumbucket & Associates");
        Player playerObjMatron = new Player(1, matronNicks, matronGuilds);


        Permit sheep = new Permit(1,
                Period.of(1,0,0),
                "sheep",
                playerObjMatron,
                playerObjMatron,
                "This permit allows player to shear sheep at Yew pens.");


        System.out.println(sheep);
        System.out.println(playerObjMatron);
    }
}
