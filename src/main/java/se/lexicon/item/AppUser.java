package se.lexicon.item;

import sun.invoke.empty.Empty;

import java.util.Objects;

public class AppUser {

    private String username = "Empty";
    private String password = "Empty";
    private AppRole role = AppRole.ROLE_APP_ADMIN;


    public AppUser(String username, String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return username.equals(appUser.username) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }
}




