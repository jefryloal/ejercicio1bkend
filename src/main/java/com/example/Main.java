package com.example;

public class Main 
{
    public static void main(String[] args) 
    {

        System.out.println("=== APEX LEGENDS ===");

        // EJEMPLO 1
        Product product1 = new Product();
        product1.setName("Wraith");
        product1.setRole("Assault");
        product1.setHealth(100);
        product1.setIsAvailable(true);

        // EJEMPLO 2
        Product product2 = new Product();
        product2.setName("Lifeline");
        product2.setRole("Support");
        product2.setHealth(90);
        product2.setIsAvailable(false);

        // EJEMPLO 3 (ADICIONAL)
        Product product3 = new Product();
        product3.setName("Bloodhound");
        product3.setRole("Recon");
        product3.setHealth(110);
        product3.setIsAvailable(true);

        // Uso de getters
        System.out.println("Product 1 Name: " + product1.getName());
        System.out.println("Product 2 Role: " + product2.getRole());
        System.out.println("Product 3 Health: " + product3.getHealth());

        // Uso de toString()
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
    
}

