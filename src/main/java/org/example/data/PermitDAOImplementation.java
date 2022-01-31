package org.example.data;

import org.example.Permit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class PermitDAOImplementation implements PermitDAO{

    private List<Permit> permitList;

    @Override
    public Permit create(Permit permit) {
        permitList.add(permit);
        return permit;
    }

    @Override
    public Permit findByID(UUID ID) {
        for (Permit permit : permitList) {
            if(permit.getUUID_ID().equals(ID)){
                return permit;
            }
        }
    }

    @Override
    public List<Permit> findAll() {
        return Collections.unmodifiableList(permitList);
    }

    @Override
    public List<Permit> findByPlayer() {
        List<Permit> foundMatches = new ArrayList<>();
        for(Permit permit : permitList){
            if (permit.getPlayer().equals(findByPlayer())){
                foundMatches.add(permit);
            }
        }
    }

    @Override
    public List<Permit> findByIssuer() {
        List<Permit> foundMatches = new ArrayList<>();
        for (Permit permit : permitList){
            if(permit.getIssuer().equals(findByIssuer())){
                foundMatches.add(permit);
            }
        }
    }

    @Override
    public Permit update(UUID ID, Permit updated) {
        return null;
    }

    @Override
    public boolean delete(UUID ID) {
        return permitList.remove(findByID(ID));
    }
}
