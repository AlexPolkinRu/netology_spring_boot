package ru.netology.netology_spring_boot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.netology_spring_boot.profiles.DevProfile;
import ru.netology.netology_spring_boot.profiles.ProductionProfile;
import ru.netology.netology_spring_boot.profiles.SystemProfile;

/**
 * @author Aleksandr Polochkin
 * 14.10.2022
 */

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
