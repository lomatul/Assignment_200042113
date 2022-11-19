package Assignment__Task__1;

public class Month {


    Year years = new Year();

    public  boolean month_2(int month,int day,int year)
    {
        if ((month == 2)) {
            if ( years.leap_year(year) == true) {
                if (day == 29) {
                    return true;
                }
            } else {
                if (day == 28) {
                    return true;
                }
            }
        }
        return false;
    }



    public boolean Month_30days(int month,int day)
    {
        if(day==30) {
            if ((month == 4 || month == 6 || month == 9 || month == 11)) {
                return true;
            } else {
                return false;
            }
        }
        else
        {
            return false;
        }
    }


}
