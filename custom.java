import java.io.IOException;
import java.util.*;

class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
    super(s);
}}

public class custom {
    static void validage(int age)throws InvalidAgeException{
        if(age<18) 
        throw new InvalidAgeException("not valid");
        else
        System.out.println("validate");

        

    }
    public static void main(String[] args) {
        try{
            validage(13);
        }catch(Exception m){
            System.out.println("exception catch :"+ m);
        }
    }
}
