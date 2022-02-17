package com.stasoft.models;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Machine extends Mod{
    private Double price;
    private String model;
    private String brand;
}
