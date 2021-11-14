import java.util.Scanner;
    public class Temperature
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
            double k = 0 ;
            double f = 0 ;
            double c = 0 ;

            System.out.println("Enter the type of the temperature the number: ");
            char type = sc.next().charAt(0);
            double Temperature = sc.nextDouble();
            if (type == 'c' || type == 'C')
            {
                c = Temperature;
                k = c + 273.15;
                f = (((9 * c) / 5) + 32);
            }
            else if (type == 'k' || type =='K' )
            {
                k = Temperature;
                c = k - 273.15;
                f = (((9 * c) / 5) + 32);
            }
            else if (type == 'f' || type == 'F')
            {
                f = Temperature;
                c = (5*(f-32)/9);
                k = c + 273.15;

            }

            System.out.println(c + " C"+"\n"+f +" F"+"\n"+ k+" K");
            return;
        }


    }


