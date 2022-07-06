import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParserRomanToArabicTest {

    @Test
    void parseRomanToArabicI() throws WrongRomanFormatException {
        //given
        String roman = "I";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(1, result);
    }

    @Test
    void parseRomanToArabicII() throws WrongRomanFormatException {
        //given
        String roman = "II";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(2, result);
    }


    @Test
    void parseRomanToArabicIII() throws WrongRomanFormatException {
        //given
        String roman = "III";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(3, result);
    }



    @Test
    void parseRomanToArabicVI() throws WrongRomanFormatException {
        //given
        String roman = "VI";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(6, result);
    }



    @Test
    void parseRomanToArabicVII() throws WrongRomanFormatException {
        //given
        String roman = "VII";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(7, result);
    }



    @Test
    void parseRomanToArabicVIII() throws WrongRomanFormatException {
        //given
        String roman = "VIII";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(8, result);
    }


    @Test
    void parseRomanToArabicIX() throws WrongRomanFormatException {
        //given
        String roman = "Ix";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(9, result);
    }



    @Test
    void parseRomanToArabicXLIV() throws WrongRomanFormatException {
        //given
        String roman = "xliv";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(44, result);
    }

    @Test
    void parseRomanToArabicMCMLXXXVI() throws WrongRomanFormatException {
        //given
        String roman = "MCMLXXXVI";

        //when
        int result = ParserRomanToArabic.parsRomanToArabic(roman);

        //then
        Assertions.assertEquals(1986, result);
    }

    @Test
    void parseRomanToArabicIIII()  {
        //given
        String roman = "IIII";

        //when
        //then
        WrongRomanFormatException thrown = Assertions.assertThrows(WrongRomanFormatException.class, () -> ParserRomanToArabic.parsRomanToArabic(roman));

        Assertions.assertNull(thrown.getMessage());
    }

    @Test
    void parseRomanToArabicIL() {
        //given
        String roman = "IL";

        //when
        //then
        WrongRomanFormatException thrown = Assertions.assertThrows(WrongRomanFormatException.class, () -> ParserRomanToArabic.parsRomanToArabic(roman));

        Assertions.assertNull(thrown.getMessage());
    }

    @Test
    void parseRomanToArabicLL() {
        //given
        String roman = "LL";

        //when
        //then
        WrongRomanFormatException thrown = Assertions.assertThrows(WrongRomanFormatException.class,
                () -> ParserRomanToArabic.parsRomanToArabic(roman));

        Assertions.assertNull(thrown.getMessage());
    }

    @Test
    void parseRomanToArabicVV() {
        //given
        String roman = "vv";

        //when
        //then
        WrongRomanFormatException thrown = Assertions.assertThrows(WrongRomanFormatException.class, () -> ParserRomanToArabic.parsRomanToArabic(roman));

        Assertions.assertNull(thrown.getMessage());
    }

    @Test
    void parseRomanToArabicDMM() {
        //given
        String roman = "DMM";

        //when
        //then
        WrongRomanFormatException thrown = Assertions.assertThrows(WrongRomanFormatException.class, () -> ParserRomanToArabic.parsRomanToArabic(roman));

        Assertions.assertNull(thrown.getMessage());
    }


}