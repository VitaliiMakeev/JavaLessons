package org.example.HomeWork.lesson6;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Laptop {
    private int ozu;
    private int memory;
    private String os;
    private String colour;

    @Override
    public String toString() {
        return "laptop{" +
                "ozu=" + ozu +
                ", memory='" + memory + '\'' +
                ", os='" + os + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }


}
