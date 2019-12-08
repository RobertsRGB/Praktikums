package src.com.company;

import com.company.classes.CustomObject;
import com.company.classes.OurTestObjectWithTwoSetFields;

public class Junior {

    //Given two natural numbers (first and last), get the sum from First to Last
    //3 and 8 = 3,4,5,6,7,8 = 3+4+5+6+7=8 == ?
    public int getAllNaturalNumbersSumFromAtoB(int start, int end) {
        int i = 0;
        int sum = 0;
        {
            for (i = start; i <= end; i++) {
                sum = sum + i;
            }

            return sum;
        }
    }


    //True if string is not null and not empty else false
    public Boolean isStringNullOrEmpty(String str) {

        if (str == null || str.equals("") ) {

            return true;
        } else {
            return false;
        }
    }


    //Check that array element with index 3 equals to provided value (second param)
    public Boolean isArrayElementWithIndex3EqualsToProvidedString(String[] array, String value) {


        if (array[2].equals(value)) { // (20 - tāpēc, ka skaitīšana sākas ar nulli

            return true;

        } else {

            return false;
        }


    }


    //Given String. Check do it contains first char sequence, and second sequence at same moment
    //GOOGLE what methods have Object String in java
    public Boolean doesStringContainsFirstCharSequenceAndTheSecond(String str, String firstSequence, String secondSequnce) {

        //
        //  Jāsagooglē  stringu salīdzināšaas metodes
        //

        if (str.contains(firstSequence) && str.contains(secondSequnce)) {

            return true;

        } else {

            return false;
        }
    }
    //make an istance of OurTestObjectWithTwoSetFields and set Custom Object field to first field and second
    public OurTestObjectWithTwoSetFields createOurTestObjectWithTwoSetFields() {

        OurTestObjectWithTwoSetFields obj = new OurTestObjectWithTwoSetFields();
        CustomObject customObject1 = new CustomObject();
        CustomObject customObject2 = new CustomObject();

        obj.setCustomObjectOne(customObject1);
        obj.setCustomObjectTwo(customObject2);


        return obj;

    }
}
