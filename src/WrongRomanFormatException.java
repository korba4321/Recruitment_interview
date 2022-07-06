public class WrongRomanFormatException extends Exception{

    public WrongRomanFormatException(){
        System.out.println("Wrong Roman number format exception.");
    }

    public WrongRomanFormatException(String exceptionText){
        System.out.println(exceptionText);
    }
}
