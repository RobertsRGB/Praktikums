package src.com.company;

import com.company.classes.ClassWithField;
import com.company.classes.ObjectForConfiguration;

public class Developer {


    //Number is given as a String. Check that that number is natural (return true or false) •••••••••••••••••••••••••••
    public Boolean checkNumberIsNatural(String number) {

        Float result2 = Float.parseFloat(number);

        int result = Math.round(result2); // matemātiski noapaļojam

        if (result > 0 && result == result2) {

            return true;
        } else {
            return false;
        }
    }


    //array is given find all elements SUM •••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••

    public int getSumOfNumbersInsideArray(int[] array) {
        int sum = 0;
        {

            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            return sum;
        }

    }


    //You need create and return ObjectForConfiguration object. ••••••••••••••••••••••••••••••••••••••••••••••••••••••••
    // Set to first field 11, to second 22, to third 33
    public ObjectForConfiguration createObject() {

        ObjectForConfiguration obj = new ObjectForConfiguration();
        obj.setFirstField(11);
        obj.setSecondField(22);
        obj.setThirdField(33);

        return obj;
    }


    //Call method secretField of object ObjectForConfiguration with parametr 22;
    public void createObjectCallMethodAndReturn(ObjectForConfiguration objectForConfiguration) {
        objectForConfiguration.secretActionMethod(22);
    }

    /**
     * is given to objects of type  ClassWithField,
     * that class have field valueInClass. Need to return that class, that have bigger value of valueInClass. Or return
     * first instance if value equals.
     */
    public ClassWithField getClassWithBiggerValue(ClassWithField first, ClassWithField second) {


        Integer firstInteger = first.getValueInClass(); // Definē INT tipa mainīgo ar nosaukumu FIRSTINTEGER,
        // kas nolasa FIRST vērtību  pēc gatavas metodes

        Integer secondInteger = second.getValueInClass(); // Definē INT tipa mainīgo ar nosaukumu SECONDINTEGER,
        // kas nolasa SECOND vērtību  pēc gatavas metodes

        if (firstInteger > secondInteger) {

            return first;
        } else {
            return second;
        }
    }

}
