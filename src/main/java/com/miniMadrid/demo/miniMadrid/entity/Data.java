package com.miniMadrid.demo.miniMadrid.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "data")
public class Data {

    private String id;
    private String product;
    private String price;
    private String cutomer;

}
