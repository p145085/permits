package org.example;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;

public class Player {
    private int id;
    private UUID UUID_ID;
    private HashSet<String> nicknames;
    private HashSet<String> guilds;

    public Player() {
    }

    public Player(int id, HashSet<String> nicknames, HashSet<String> guilds) {
        this.id = id;
        this.UUID_ID = UUID.randomUUID();
        this.nicknames = nicknames;
        this.guilds = guilds;
    }

    public int getId() {
        return id;
    }

    public UUID getUUID_ID() {
        return UUID_ID;
    }

    public HashSet<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(HashSet<String> nicknames) {
        this.nicknames = nicknames;
    }

    public HashSet<String> getGuilds() {
        return guilds;
    }

    public void setGuilds(HashSet<String> guilds) {
        this.guilds = guilds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(UUID_ID, player.UUID_ID) && Objects.equals(nicknames, player.nicknames) && Objects.equals(guilds, player.guilds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, UUID_ID, nicknames, guilds);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", UUID_ID=" + UUID_ID +
                ", nicknames=" + nicknames +
                ", guilds=" + guilds +
                '}';
    }
}
