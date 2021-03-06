package org.example.spring.Example12.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // stereo annotation
public class Address {

    @Value("${person_address_line1}")
    private String firstLine;
    @Value("${person_adress_pin}")
    private String pinCode;

    public Address()
    {
        System.out.println("cons executed."+this.getClass());
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
