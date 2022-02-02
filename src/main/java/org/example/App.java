package org.example;

import org.example.data.PermitDAOImplementation;
import org.example.data.PlayerDAOImplementation;

import java.io.File;
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

        PlayerDAOImplementation PlayerDAO = new PlayerDAOImplementation();
        PermitDAOImplementation PermitDAO = new PermitDAOImplementation();

        HashSet<String> matronNicks = new HashSet<>();
        HashSet<String> matronGuilds = new HashSet<>();
        matronNicks.add("MatronDeWinter");
        matronNicks.add("Rydia");
        matronGuilds.add("chumbucket & Associates");
        Player playerObjMatron = new Player(1, matronNicks, matronGuilds);

        PlayerDAO.save(playerObjMatron);


        Permit sheep = new Permit(1,
                Period.of(1,0,0),
                "sheep",
                playerObjMatron,
                playerObjMatron,
                "This permit allows player to shear sheep at Yew pens.");


//        System.out.println(sheep);
//        System.out.println(playerObjMatron);
        System.out.println(PlayerDAO.findByGuild("chumbucket & Associates")); //TO-DO: This shows as "null".
        System.out.println(PlayerDAO.findByNickname("MatronDeWinter")); //TO-DO: This shows as "null".
        System.out.println(PlayerDAO.findByID(1));

        PermitDAO.save(sheep);
        System.out.println(PermitDAO.findPermitCreatedAfter(LocalDate.of(1997,1,1))); //TO-DO: This shows as "null".
        System.out.println(PermitDAO.findPermitCreatedBefore(LocalDate.now())); //TO-DO: This shows as "null".
        System.out.println(PermitDAO.findPermitOfType("sheep")); //TO-DO: This shows as "null".
        System.out.println(PermitDAO.searchDescriptionFor("Yew")); //TO-DO: This shows as "null".
        System.out.println(PermitDAO.findByID(1));
        PermitDAO.findByIssuer(playerObjMatron); // TO-DO: Search by String instead of object.
        PermitDAO.findByPlayer(playerObjMatron); // TO-DO: Search by String instead of object.




        File writerDestination = new File("files/playerObjMatron.txt");
        FileOperations.write(writerDestination, playerObjMatron.toString());

        File targetFile = new File("files/playerObjMatron.txt");
        String s = FileOperations.read(targetFile);
        System.out.println(s);
    }
}
