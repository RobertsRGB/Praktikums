package src.com.company.ManasProves;

public class Developer {

    public static void main(String[] args) {


        String number = "353.186875";
        System.out.println("Sākumskaitlis = " + number);


        //Number is given as a String. Check that that number is natural (return true or false)


        Float result2 = Float.parseFloat(number);
        System.out.println("result2 = " + result2);

        int result = Math.round(result2);
        System.out.println("result noapaļots = " + result);


        if (result > 0 && result == result2) {

        }
    }
}
