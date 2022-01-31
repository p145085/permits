package org.example.data;

import org.example.Permit;
import org.example.Player;

import java.time.Period;
import java.util.List;
import java.util.UUID;

public interface PermitDAO extends GenericCRUD<Permit, UUID>{

    Permit create(Permit permit);

    Permit findByID(UUID ID);
    List<Permit> findAll();
    List<Permit> findByPlayer();
    List<Permit> findByIssuer();

    Permit update(UUID ID, Permit updated);

    boolean delete(UUID ID);
}
