import java.io.IOException;
import java.util.*;
class hoursException extends Exception{
    public hoursException(String message){
        super(message);
    }
}

class minuteException extends Exception{
    public minuteException(String message){
        super(message);
    }
}

class secondException extends Exception{
    public secondException(String message){
        super(message);
    }
}
class Time{
    private int min,hrs,sec;

    public void method() throws hoursException,minuteException,secondException{
    
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Hour");
    hrs = sc.nextInt();
    if(hrs>24||hrs<0){
        throw new hoursException("Invalid Hours");
    }
    System.out.println("Enter Min");
    min = sc.nextInt();
    if(min>60||min<0){
        throw new minuteException("Invalid Minute");
    }
    System.out.println("Enter sec");
    sec = sc.nextInt();
    if(sec>24||sec<0){
        throw new secondException("Invalid Second");
    }


}}

public class exception {

    public static void main(String[] args) {
        Time t = new Time();
        try{
            t.method();

        }catch(hoursException|minuteException|secondException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
