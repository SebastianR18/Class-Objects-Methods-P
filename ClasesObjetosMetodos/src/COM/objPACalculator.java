package COM;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketOption;

public class objPACalculator {

    private float Perimeter = 0;
    private float Area = 0;

        public void TriAreaCalculator (float sideA, float sideB)
        {
            Area = (sideA * sideB) / 2;
        }

        public void TriPerimeterCalculator (float sideA, float sideB, float sideC)
        {
            Perimeter = sideA + sideB + sideC;
        }

        public void SqrAreaCalculator (float lenght)
        {
            Area = lenght * 2;
        }

        public void SqrPerimeterCalculator (float lenght)
        {
            Perimeter = lenght * 4;
        }

        public void RecAreaCalculator (float a, float b)
        {
            Area = a * b;
        }

        public void RecPerimeterCalculator (float a, float b)
        {
            Perimeter = (a * 2) + (b * 2);
        }


    public float getArea()
        {
            return Area;
        }

        public float getPerimeter()
        {
            return Perimeter;
        }


}
