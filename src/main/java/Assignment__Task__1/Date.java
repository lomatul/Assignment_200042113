package Assignment__Task__1;

public class Date {

    Month months= new Month();

    public  int Next_day(int month, int day,int year)
    {
        if(day==31 || months.Month_30days(month,day)==true)
        {
            day=1;
        }
        else if (months.month_2(month,day,year)==true)
        {
            day=1;
        }
        else
        {
            day=day+1;
        }
        return day;
    }


    public int Next_year(int year, int month, int day)
    {
        if ((month == 12) && day == 31) {
            year++;
        }
        return year;
    }


    public int Next_month(int month, int day,int year)
    {
        if( day==31  || months.Month_30days(month,day)==true)
        {
            month++;
        }
        else if (months.month_2(month,day,year)==true)
        {
            month++;
        }
        return month;
    }


}
