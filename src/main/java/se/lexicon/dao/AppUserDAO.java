package se.lexicon.dao;

import se.lexicon.model.AppUser;
import java.util.List;

public interface AppUserDAO {

    //create
    public AppUser persist(AppUser appUser);

    //find
    AppUser findByUsername(String username);

    //find
    List<AppUser> findAll();

    //remove
    void remove(String username);

}