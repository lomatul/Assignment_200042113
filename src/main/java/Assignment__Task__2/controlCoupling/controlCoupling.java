package Assignment__Task__2.controlCoupling;

public class controlCoupling {

    //When one function controls the flow of another function.

    public boolean leap_year(int year)
    {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return  true;
        }
        else
        {
            return false;
        }
    }

    public void Year()
    {
        // Calling leap_year() by passing a value which controls its flow:

        if(leap_year(2016)==true)
        {
            System.out.println("Its a leap Year");
        }
        else
        {
            System.out.println("Its not a leap Year");
        }
    }


}
