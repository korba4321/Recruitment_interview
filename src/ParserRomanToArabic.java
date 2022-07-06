public class ParserRomanToArabic {
    static int parsRomanToArabic(String roman) {
        roman = roman.toUpperCase();

        int result = 0;
        int lastMax = 0;
        int lastValue = 0;
        int numberOfLastValues = 1;

        for(int i=roman.length()-1; i>=0; i--) {
            int toAdd;
            switch (roman.charAt(i)){
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

            if(lastValue == toAdd){
                numberOfLastValues++;
                if(numberOfLastValues > 3){
                    System.out.println("Zly format");
                    break;
                }
            }
            else
                numberOfLastValues = 1;

            lastValue = toAdd;
        }

        return result;
    }
}
