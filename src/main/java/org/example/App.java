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
        Collection<HashSet> nicks = new ArrayList<>();
        nicks.add("test");
        Player player = new Player(1, UUID.randomUUID(), "nicknameS test", "guildS test");
        Permit sheep = new Permit(1, UUID.randomUUID(), LocalDate.now(), Period.of(1,0,0), "sheep", )
    }
}
