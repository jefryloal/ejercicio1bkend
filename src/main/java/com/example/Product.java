package com.example;

public class Product 
{
    // 1. Atributos (NO se cambian)
    private String name;         // nombre de la leyenda
    private String role;         // rol
    private int health;          // vida
    private boolean isAvailable; // disponible

    // 2. Getters
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getHealth() {
        return health;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    // 3. Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setHealth(int health) {
        if (health >= 0) 
        {
            this.health = health;
        }
         else
     {
            System.out.println("La vida no puede ser negativa");
        }
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // 4. toString
    @Override
    public String toString() {
        return "Product [Name: " + name +
               ", Role: " + role +
               ", Health: " + health +
               ", Available: " + isAvailable + "]";
    }

}
