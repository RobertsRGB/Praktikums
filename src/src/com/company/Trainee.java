package src.com.company;

import com.company.classes.CustomObject;

public class Trainee {

    //return "Hello"
    public String sayHello() {
        return "Hello";
    }

    //Return biggest number
    public int getMaxNumber(Integer a, Integer b) {

        if (a < b) {
            return b;
        }

        else return a;

            }


    //Return true if number is bigger then 20, false other side
    public Boolean isBiggerThen20(Integer a) {

        if (a > 20) {
            return true;
        } else return false;
    }


    //Return new instance (Object) of CustomObject Class, custom object already defined
    public CustomObject createCustomObject() {

        return new CustomObject();
    }

    //return sum of two numbers
    public int sumOfTwoNumber(int a, int b) {
        return (a+b);
    }



}
