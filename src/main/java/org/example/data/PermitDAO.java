package org.example.data;

import org.example.Permit;
import org.example.Player;

import java.time.Period;
import java.util.List;
import java.util.UUID;

public interface PermitDAO extends GenericCRUD<Permit, UUID>{

    Permit save(Permit permit);

    Permit findByID(UUID ID);
    List<Permit> findAll();
    List<Permit> findByPlayer(Player player);
    List<Permit> findByIssuer(Player playerIssuer);

    Permit update(UUID ID, Permit updated);

    boolean delete(UUID ID);
}
