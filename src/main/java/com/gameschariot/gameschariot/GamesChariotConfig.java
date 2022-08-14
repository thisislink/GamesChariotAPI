package com.gameschariot.gameschariot;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Objects;

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

    public String apiUrl() {
        return apiUrl;
    }

    public String databaseServer() {
        return databaseServer;
    }

    public String databaseUsername() {
        return databaseUsername;
    }

    public String databasePassword() {
        return databasePassword;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (GamesChariotConfig) obj;
        return Objects.equals(this.apiUrl, that.apiUrl) &&
                Objects.equals(this.databaseServer, that.databaseServer) &&
                Objects.equals(this.databaseUsername, that.databaseUsername) &&
                Objects.equals(this.databasePassword, that.databasePassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiUrl, databaseServer, databaseUsername, databasePassword);
    }

    @Override
    public String toString() {
        return "GamesChariotConfig[" +
                "apiUrl=" + apiUrl + ", " +
                "databaseServer=" + databaseServer + ", " +
                "databaseUsername=" + databaseUsername + ", " +
                "databasePassword=" + databasePassword + ']';
    }
}
