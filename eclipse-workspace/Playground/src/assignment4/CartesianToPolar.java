package assignment4;
import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;

public class CartesianToPolar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		double y = sc.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
	    df.setRoundingMode(RoundingMode.HALF_UP);
	    double temp = Math.toDegrees(Math.atan(Math.abs(y/x)));
	    if (x >= 0 && y >= 0)
	    {
	    	
	    }
	    else if (x <= 0 && y >= 0)
	    {
	    	temp = 180 - temp;
	    }
	    else if (x <= 0 && y <= 0)
	    {
	    	temp = -180 + temp;
	    }
	    else
	    {
	    	temp = - temp;
	    }
		System.out.println("r = " + df.format(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) + "θ = " + df.format(temp) + "°");
	}
}
