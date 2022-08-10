package se.lexicon.dao;

import se.lexicon.model.AppUser;
import java.util.ArrayList;
import java.util.List;

public class AppUserDaoCollection implements AppUserDAO{

    private final ArrayList <AppUser> appUsers = new ArrayList<>();

    @Override
    public AppUser persist(AppUser appUser) {
        return null;
    }

    @Override
    public AppUser findByUsername(String username) {
        return null;
    }

    @Override
    public List<AppUser> findAll() {
        return null;
    }

    @Override
    public void remove(String username) {

    }
}
