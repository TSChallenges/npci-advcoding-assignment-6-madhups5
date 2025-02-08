package com.mystore.app;

import org.springframework.stereotype.Component;

@Component
class Barcode {

    public Barcode() {
        System.out.println("In Barcode constructor");
    }
    
    public String createBarcode(Product p) {
        String bcode = "|";
        int hashcode = p.getId() + p.getName().hashCode();

        String numberStr = String.valueOf(hashcode);  // Convert number to a string

        // Loop through each character in the string
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);  // Convert char to int
            
            // Check if the digit is even or odd
            if (digit % 2 == 0) {
                bcode = bcode + "❚";
            } else {
                bcode = bcode + "|";
            }
        }

        return bcode + "|";
    }
}
