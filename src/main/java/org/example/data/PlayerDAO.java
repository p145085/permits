package org.example.data;

import org.example.Player;

import java.util.List;
import java.util.UUID;

public interface PlayerDAO extends GenericCRUD<Player, UUID> {

    Player save(Player player);

    Player findByID(UUID ID);

    List<Player> findAll();

    List<Player> findByNickname(String nickname);
    List<Player> findByGuild(String guild);

    Player update(UUID ID, Player updated);

    boolean delete(UUID ID);

}
