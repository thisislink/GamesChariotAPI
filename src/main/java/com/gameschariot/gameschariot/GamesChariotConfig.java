package com.gameschariot.gameschariot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("gameschariot")
public final class GamesChariotConfig {
    private final String apiUrl;
    private final String databaseServer;
    private final String databaseUsername;
    private final String databasePassword;

    public GamesChariotConfig(String apiUrl, String databaseServer, String databaseUsername, String databasePassword) {
        this.apiUrl = apiUrl;
        this.databaseServer = databaseServer;
        this.databaseUsername = databaseUsername;
        this.databasePassword = databasePassword;
    }

    public void GamesChariotConfig() {
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
