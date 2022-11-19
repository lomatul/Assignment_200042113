package Assignment__Task__1;

public class Year {

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


}
