import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserRomanToArabicTest {

    @Test
    void parseRomanToArabicI() {
        //given
        String roman = "I";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(1, result);
    }

    @Test
    void parseRomanToArabicII() {
        //given
        String roman = "II";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(2, result);
    }


    @Test
    void parseRomanToArabicIII() {
        //given
        String roman = "III";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(3, result);
    }



    @Test
    void parseRomanToArabicVI() {
        //given
        String roman = "VI";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(6, result);
    }



    @Test
    void parseRomanToArabicVII() {
        //given
        String roman = "VII";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(7, result);
    }



    @Test
    void parseRomanToArabicVIII() {
        //given
        String roman = "VIII";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(8, result);
    }


    @Test
    void parseRomanToArabicIX() {
        //given
        String roman = "Ix";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(9, result);
    }



    @Test
    void parseRomanToArabicXLIV() {
        //given
        String roman = "xliv";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(44, result);
    }

    @Test
    void parseRomanToArabicMCMLXXXVI() {
        //given
        String roman = "MCMLXXXVI";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(1986, result);
    }





}