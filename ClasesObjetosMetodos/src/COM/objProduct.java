package COM;

public class objProduct {

    private double IVA = 0;
    private float FinalPrice = 0;


    public void IVACalculator (int IVAStatus, double Price)
    {
        if(IVAStatus == 0)
        {
            IVA = 0;
        }
        else
        {
            if (Price <= 500)
            {
                IVA = Price * 0.12;
            }
            else if (Price > 500 && Price >= 1500)
            {
                IVA = Price * 0.14;
            }
            else
            {
                IVA = Price * 0.15;
            }
        }
    }

    public double getIVA()
    {
        return IVA;
    }

}
