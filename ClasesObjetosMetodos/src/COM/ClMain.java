
/*

La resolucion a todos los problemas se puede acceder en este proyecto. Esta clase Main funciona como un menu
desplegable en el que se puede acceder a cada uno de los programas.

 */


package COM;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClMain {

    public static void main(String[] args) throws IOException {

        int op = 0;

        op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al menu del proyecto:\n1. Problema 1\n2. Problema 2\n3. Problema 3\n4. Problema 4\n5. Problema 5"));

        switch (op)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Revise la consola.");
                float sideA, sideB, sideC, THei;
                int TPerimeter, TArea, CPerimeter, CArea;
                int PA, CR;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int UserSel;
                System.out.println("Ingrese la figura que desea evaluar:\n1. Triangulo\n2. Cuadrado\n3. Rectangulo");
                UserSel = Integer.parseInt(br.readLine());

                objPACalculator oPA = new objPACalculator();

                switch (UserSel) {
                    case 1:
                        System.out.println("Ingrese la base y altura del triangulo para el calculo del area\n");
                        sideA = Float.parseFloat(br.readLine());
                        THei = Float.parseFloat(br.readLine());
                        System.out.println("Ingrese los dos lados restantes del triangulo");
                        sideB = Float.parseFloat(br.readLine());
                        sideC = Float.parseFloat(br.readLine());

                        oPA.TriAreaCalculator(sideA, THei);
                        oPA.TriPerimeterCalculator(sideA, sideB, sideC);

                        System.out.println("Area del triangulo: " + oPA.getArea());
                        System.out.println("Perimetro del triangulo: " + oPA.getPerimeter());
                        break;
                    case 2:
                        System.out.println("Ingrese el lado del cuadrado");
                        sideA = Float.parseFloat(br.readLine());

                        oPA.SqrAreaCalculator(sideA);
                        oPA.SqrPerimeterCalculator(sideA);

                        System.out.println("Area del cuadrado: " + oPA.getArea());
                        System.out.println("Perimetro del cuadrado: " + oPA.getPerimeter());
                        break;
                    case 3:
                        System.out.println("Ingrese la base y altura del rectangulo");
                        sideA = Float.parseFloat(br.readLine());
                        sideB = Float.parseFloat(br.readLine());

                        oPA.RecAreaCalculator(sideA, sideB);
                        oPA.RecPerimeterCalculator(sideA, sideB);

                        System.out.println("Area del rectangulo: " + oPA.getArea());
                        System.out.println("Perimetro del rectangulo: " + oPA.getPerimeter());
                        break;
                    default:
                        System.out.println("La opcion es invalida.");
                        break;

                    }
                break;

            case 2:
            {
                double a, b;
                int Operator;

                a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                Operator = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operacion que desea realizar:\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division"));

                objCalculator oCal = new objCalculator();

                switch (Operator)
                {
                    case 1:
                    {
                        JOptionPane.showMessageDialog(null, "La suma de " + a + " + " + b + " es igual a: " + oCal.getSum(a, b));
                        break;
                    }
                    case 2:
                    {
                        JOptionPane.showMessageDialog(null, "La resta de " + a + " - " + b + " es igual a: " + oCal.getDif(a, b));
                        break;
                    }
                    case 3:
                    {
                        JOptionPane.showMessageDialog(null, "La multiplicacion de " + a + " x " + b + " es igual a: " + oCal.getMul(a, b));
                        break;
                    }
                    case 4:
                    {
                        JOptionPane.showMessageDialog(null, "La division de " + a + " + " + b + " es igual a: " + oCal.getDiv(a, b));
                        break;
                    }
                    default:
                    {
                        JOptionPane.showMessageDialog(null, "La opcion no es valida");
                        break;
                    }
                }
                break;
            }

            case 3:
            {
                String MotorNum, Brand, Model;
                int windowCount, doorCount;
                float iKM, fKM, cKM;

                JOptionPane.showMessageDialog(null, "Bienvenidos al sistema de informacion de vehiculo (Pregunta 3)");
                MotorNum = JOptionPane.showInputDialog("Ingrese el numero del motor del Vehiculo");
                windowCount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventanas encontradas en de vehiculo"));
                doorCount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas encontradas en de vehiculo"));
                Brand = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
                Model = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo");
                iKM = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el kilometraje inicial del vehiculo"));
                fKM = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el kilometraje final del vehiculo"));

                objVehicleInfo oVI = new objVehicleInfo();

                oVI.KMCalculator(iKM, fKM);

                cKM = oVI.getKM();

                String VImsg = "Datos del vehiculo:\n\nNumero del motor: " + MotorNum + "\nNumero de ventanas: " + windowCount + "\nNumero de puertas: " + doorCount + "\nMarca: " + Brand + "\nModelo: " + Model + "\nKilometraje inicial: " + iKM + "\nKilometraje final: " + fKM + "\nKilometraje recorrido: " + cKM;

                JOptionPane.showMessageDialog(null, VImsg);
                break;
            }
            case 4: {
                String Product;
                float Price;
                double FinalPrice;
                int IVAStatus;

                JOptionPane.showMessageDialog(null, "Bienvenidos al sistema de calculo de IVA (Pregunta 4)");
                Product = JOptionPane.showInputDialog("Ingrese el nombre del producto");
                Price = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto"));
                IVAStatus = Integer.parseInt(JOptionPane.showInputDialog("El producto tiene IVA?\n1. Si\n0. No"));

                objProduct oPro = new objProduct();

                oPro.IVACalculator(IVAStatus, Price);

                FinalPrice = Price + oPro.getIVA();

                JOptionPane.showMessageDialog(null, "Detalles del producto:\n\nProducto: " + Product + "\nPrecio Inicial: $" + Price + "\nIVA: $" + oPro.getIVA() + "\nPrecio Final : $" + FinalPrice);

                break;
            }
            case 5:
            {
                String CI, Name, LastName, Gender;
                double Salary;
                LocalDate Birthdate;
                LocalDate JoinDate;

                CI = JOptionPane.showInputDialog("Ingrese su cedula de identidad");
                Name = JOptionPane.showInputDialog("Ingrese su Nombre");
                LastName = JOptionPane.showInputDialog("Ingrese su apellido");
                Gender = JOptionPane.showInputDialog("Ingrese su genero (M/F)");
                Salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario actual"));

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                Birthdate = LocalDate.parse(JOptionPane.showInputDialog("Ingrese su fecha de nacimiento"), formatter);
                JoinDate = LocalDate.parse(JOptionPane.showInputDialog("Ingrese su fecha de ingreso"), formatter);

                int i = 0;

                while (i == 0)
                {
                    int EmpOp = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al archivo de " + Name + " " + LastName + "!\n\n" + "Datos del empleador: \nCI: " + CI + "\nGenero: " + Gender + "\nSalario Actual: $" + Salary + "\nIngrese una de las opciones:\n\n1. Modificar salario\n2. Calcular edad\n3. Calcular prestaciones\n4. Salir"));

                    objEmployee oEmp = new objEmployee();

                    switch (EmpOp)
                    {
                        case 1:
                        {
                            Salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo salario"));
                            JOptionPane.showMessageDialog(null, "El nuevo salario de " + Name + " " + LastName + "es: $" + Salary);
                            break;
                        }
                        case 2:
                        {

                            JOptionPane.showMessageDialog(null, "La edad de " + Name + " " + LastName + " es " + oEmp.AgeCalculator(Birthdate));
                            break;
                        }
                        case 3:
                        {
                            oEmp.JobSeniority(JoinDate);
                            JOptionPane.showMessageDialog(null, "La antiguedad de " + Name + " " + LastName + " es " + oEmp.getJobSeniority());
                            JOptionPane.showMessageDialog(null, "Las prestaciones de " + Name + " " + LastName + " es " + oEmp.BenefisCalculator(oEmp.getJobSeniority(), Salary));
                            break;
                        }
                        case 4:
                        {
                            i++;
                            break;
                        }
                        default:
                        {
                            JOptionPane.showMessageDialog(null, "La opcion ingresada es invalida.");
                            break;
                        }
                    }
                }
            }
        }
    }
}
