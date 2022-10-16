package ru.stqa.pft.supertests.model;

public class GroupData {
    private final String username;
    private final String password;

    public GroupData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
