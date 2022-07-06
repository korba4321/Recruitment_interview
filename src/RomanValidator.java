import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanValidator {

    private final List<String> rules;

    public RomanValidator(){
        rules = new ArrayList<>();

        rules.add("([I]{4}|[V]{4}|[X]{4}|[L]{4}|[C]{4}|[D]{4})");
        rules.add("VV|LL|DD+");
        rules.add(".*M");
        rules.add("(I|V|X|L)+D.*");
        rules.add("(I|V|X|L)+C.*");
        rules.add("(I|V)+L.*");
        rules.add("(V)+X.*");
        rules.add(".*\\d.*");
        rules.add(".*[^IVXLCDM]+.*");

    }
    public void validate(String roman) throws WrongRomanFormatException {

        for(String rule : rules) {
            Pattern p = Pattern.compile(rule);
            Matcher m = p.matcher(roman);
            if (m.matches()) {
                throw new WrongRomanFormatException();
            }
        }
    }
}
