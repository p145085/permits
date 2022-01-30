package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Collection<String> matronnicks = new ArrayList<>();
        Collection<String> matronguilds = new ArrayList<>();
        matronnicks.add("MatronDeWinter");
        matronguilds.add("chumbucket & Associates");
        Player playerobjmatron = new Player(1, matronnicks, matronguilds);


        Permit sheep = new Permit(1,
                Period.of(1,0,0),
                "sheep",
                playerobjmatron,
                playerobjmatron,
                "This permit allows player to shear sheep at Yew pens.");
    }
}
