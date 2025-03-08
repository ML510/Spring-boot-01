package edu.icet.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Product {
    private String name;
    private String description;
    private Double price;
}
