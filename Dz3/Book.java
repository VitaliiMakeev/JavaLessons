package org.example.HomeWork.Dz3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String nameBook;
    private String soname;
    private Integer price;
    private Integer yer;
    private Integer count;
}
