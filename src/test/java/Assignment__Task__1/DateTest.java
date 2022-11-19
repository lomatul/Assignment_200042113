package Assignment__Task__1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    public void test_Month()
    {
        Date date= new Date();

        int month =  date.Next_month(2,28,2020);

        int actual = 2;
        assertEquals(month,actual);

    }


    @Test
    public void test_Day()
    {
        Date date= new Date();

        int day =  date.Next_day(2,28,2016);

        int actual = 1;
        assertEquals(day,actual);

    }


    @Test
    public void test_year()
    {
        Date date= new Date();
        int year =  date.Next_year(5,11,31);
        int actual = 5;
        assertEquals(year,actual);
    }


    @Test
    public void test_LeapYear()
    {
        Year years = new Year();
        boolean year =  years.leap_year(2016);

        boolean actual = true;
        assertEquals(year,actual);

    }
}

