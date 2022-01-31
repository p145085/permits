package org.example.data;

import org.example.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class PlayerDAOImplementation implements PlayerDAO{

    private List<Player> playerList;

    @Override
    public Player save(Player player) {
        playerList.add(player);
        return player;
    }

    @Override
    public Player findByID(UUID ID) {
        for (Player p : playerList) {
            if(p.getUUID_ID().equals(ID)){
                return p;
            }
        }
    }

    @Override
    public List<Player> findAll() {
        return Collections.unmodifiableList(playerList);
    }

    @Override
    public List<Player> findByNickname(String nickname) {
        List<Player> foundMatches = new ArrayList<>();
        for(Player p : playerList){
            if (p.getNicknames().equals(nickname)) {
                foundMatches.add(p);
            }
        }
    }

    @Override
    public List<Player> findByGuild(String guild) {
        List<String> found = new ArrayList<>();
        for(Player p : playerList) {
            if (p.getGuilds().equals(guild)) {
                found.add(guild);
            }
        }
    }

    @Override
    public Player update(UUID ID, Player updated) {
        return null;
    }

    @Override
    public boolean delete(UUID ID) {
        return playerList.remove(findByID(ID));
    }
}
