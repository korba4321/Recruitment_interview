public class ParserRomanToArabic {
    static int parsRomanToArabic(String roman) throws WrongRomanFormatException {
        String upperRoman = roman.toUpperCase();

        RomanValidator validator = new RomanValidator();
        validator.validate(upperRoman);

        int result = 0;
        int lastMax = 0;

        for(int i=upperRoman.length()-1; i>=0; i--) {
            int toAdd;
            switch (upperRoman.charAt(i)){
                case 'I': toAdd = 1; break;
                case 'V': toAdd = 5; break;
                case 'X': toAdd = 10; break;
                case 'L': toAdd = 50; break;
                case 'C': toAdd = 100; break;
                case 'D': toAdd = 500; break;
                case 'M': toAdd = 1000; break;
                default: return -1;
            }
            if(toAdd < lastMax){
                result -= toAdd;
            }
            else{
                result += toAdd;
            }
            lastMax = Math.max(toAdd, lastMax);

        }

        return result;
    }
}
