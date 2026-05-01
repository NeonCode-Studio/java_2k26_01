import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class zmiennoprzecinkowe {
    public static void main(String[] args){
        double a = 2.0;
        double b = 1.5;
        
        double c = a/b;

        System.out.println(Math.ceil(c));//gora sufit
        System.out.println(Math.floor(c));//dol podloga

        System.out.println(Math.round(c*100.0)/100.0);//prostsze

        BigDecimal roundedNumber = new BigDecimal(c).setScale(2, 
            RoundingMode.HALF_UP);//trudne i bezsensowne

        System.out.println(roundedNumber.doubleValue());

        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        System.out.println(decimalFormat.format(c));//ladne przejzyste

        String formattedNumber = String.format("%.2f",c);
        System.out.println(formattedNumber);//nawet nawet

    }
    
}
