package Assignment__Task__2.DataCoupling;

public class DataCoupling {

    //The dependency between software modules A and B is said to be  data coupled if the dependency is based on the fact that they communicate by only  passing data

    int day;


    public int days_worked(int day)
    {
        return day;
    }

    public int Cal_salary(int salary,int day)
    {
        if(day>30)
        {
            salary=salary+100;
        }
        return salary;
    }

    public void Total_salary()
    {
        int salary = 500;

        days_worked(day);
        Cal_salary(salary,day);
    }



}
