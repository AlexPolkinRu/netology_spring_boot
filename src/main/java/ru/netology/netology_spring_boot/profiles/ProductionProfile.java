package ru.netology.netology_spring_boot.profiles;

/**
 * @author Aleksandr Polochkin
 * 14.10.2022
 */

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
