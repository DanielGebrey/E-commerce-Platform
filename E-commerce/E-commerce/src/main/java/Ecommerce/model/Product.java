package Ecommerce.model;

import javax.persistence.Entity;
public class Product {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String description;
    private double price;
    private String category;
}
