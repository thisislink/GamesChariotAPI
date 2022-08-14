package com.gameschariot.gameschariot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.io.IOException;
import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties(GamesChariotConfig.class)
public class GamesChariotApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(GamesChariotApplication.class, args);
	}
}

