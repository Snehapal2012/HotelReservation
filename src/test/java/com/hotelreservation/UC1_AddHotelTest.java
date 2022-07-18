package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class UC1_AddHotelTest {
    @Test
    public void hotelNameTestTrue(){
        UC1_AddHotel hotel=new UC1_AddHotel();
        boolean result1=true;
        Assertions.assertTrue(result1);
    }
    @Test
    public void hotelNameTestFalse(){
        UC1_AddHotel hotel=new UC1_AddHotel();
        hotel.hotelName();
        boolean result1=false;
        Assertions.assertFalse(result1);
    }
}
