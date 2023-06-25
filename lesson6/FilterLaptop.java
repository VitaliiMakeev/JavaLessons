package org.example.HomeWork.lesson6;

import java.util.*;

public class FilterLaptop {
    public HashSet<Laptop> filtrOzu(HashSet<Laptop> laptop, int param) {
        HashSet<Laptop> laptops = new HashSet<>();
        for (Laptop el : laptop) {
            if (el.getOzu() >= param) {
                laptops.add(el);
            }
        }
        return laptops;
    }

    public HashSet<Laptop> filtrMemory(HashSet<Laptop> laptop, int param) {
        HashSet<Laptop> laptops = new HashSet<>();
        for (Laptop el : laptop) {
            if (el.getMemory() >= param) {
                laptops.add(el);
            }
        }
        return laptops;
    }

    public HashSet<Laptop> filtrOs(HashSet<Laptop> laptop, String param) {
        HashSet<Laptop> laptops1 = new HashSet<>();
        for (Laptop el : laptop) {
            if (el.getOs().equals(param)) {
                laptops1.add(el);
            }
        }
        return laptops1;
    }

    public HashSet<Laptop> filtrColour(HashSet<Laptop> laptop, String param) {
        HashSet<Laptop> laptops1 = new HashSet<>();
        for (Laptop el : laptop) {
            if (el.getColour().equals(param)) {
                laptops1.add(el);
            }
        }
        return laptops1;
    }

    public HashSet<Laptop> retail(HashSet<Laptop> laptops1, HashSet<Laptop> laptops2) {
        HashSet<Laptop> res = new HashSet<>();
        if (laptops1.size() == 0){
            return laptops2;
        } else if (laptops2.size() == 0) {
            return laptops1;
        } else {
            for (Laptop el : laptops1) {
                if (laptops2.contains(el)){
                    res.add(el);
                }
            }
        }
        return res;
    }
}