package COM;

import javax.swing.*;

public class objVehicleInfo {

    private float iKM, fKM, cKM;

    public void KMCalculator (float iKM, float fKM)
    {
        this.cKM = fKM - iKM;
    }

    public float getKM()
    {
        return cKM;
    }


}
