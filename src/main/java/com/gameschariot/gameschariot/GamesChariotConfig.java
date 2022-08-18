package com.gameschariot.gameschariot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("gameschariot")
public class GamesChariotConfig {

    GamesChariotConfig gamesChariotConfig;
    private String apiUrl;
    private String databaseServer;
    private String databaseUsername;
    private String databasePassword;

    public GamesChariotConfig() {
        this("localhost:8080", "secretserver", "secretusername", "secretpassword");
    }

    public GamesChariotConfig(String url, String server, String username, String password) {
        this.apiUrl = url;
        this.databaseServer = server;
        this.databaseUsername = username;
        this.databasePassword = password;
    }

    public void setGamesChariotConfig(GamesChariotConfig config) {
        this.gamesChariotConfig = config;
    }

    public String getURL() {
        return apiUrl;
    }

    public String getDatabaseServer() {
        return databaseServer;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

}
