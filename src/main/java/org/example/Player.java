package org.example;

import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

public class Player {
    private int id;
    private UUID UUID_ID;
    private Collection<String> nicknames;
    private Collection<String> guilds;

    public Player(int id, Collection<String> nicknames, Collection<String> guilds) {
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

    public Collection<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(Collection<String> nicknames) {
        this.nicknames = nicknames;
    }

    public Collection<String> getGuilds() {
        return guilds;
    }

    public void setGuilds(Collection<String> guilds) {
        this.guilds = guilds;
    }
}
