package COM;

import java.time.LocalDate;
import java.time.Period;

public class objEmployee {

    private int JobSeniority = 0;

    public int AgeCalculator (LocalDate Birthdate)
    {
        LocalDate Today = LocalDate.now();
        return Period.between(Birthdate, Today).getYears();
    }

    public void JobSeniority (LocalDate Seniory)
    {
        LocalDate Today = LocalDate.now();
        JobSeniority = Period.between(Seniory, Today).getYears();
    }

    public int getJobSeniority()
    {
        return JobSeniority;
    }

    public double BenefisCalculator(int Seniority, double Salary)
    {
        return (Seniority * Salary) / 12;
    }

}
