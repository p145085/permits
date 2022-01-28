package org.example;

import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

public class Player {
    private int id;
    private UUID UUID_ID;
    private Collection<HashSet> nicknames;
    private Collection<HashSet> guilds;

    public int getId() {
        return id;
    }

    public UUID getUUID_ID() {
        return UUID_ID;
    }

    public Collection<HashSet> getNicknames() {
        return nicknames;
    }

    public void setNicknames(Collection<HashSet> nicknames) {
        this.nicknames = nicknames;
    }

    public Collection<HashSet> getGuilds() {
        return guilds;
    }

    public void setGuilds(Collection<HashSet> guilds) {
        this.guilds = guilds;
    }
}
