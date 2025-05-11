package calculator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class SeparatorParser {
    public List<Integer> parse(String input){
        if (input == null || input.isEmpty()) return List.of();

        String delimiter = "[,:]";
        String numbers = input;

        if (input.startsWith("//")) return parse_with_custom_separator(input);


        return split_and_convert(numbers, delimiter);
    }

    private List<Integer> parse_with_custom_separator(String input){
        Matcher matcher = Pattern.compile("//(.)\\n(.*)").matcher(input);

        if (!matcher.matches()) throw new IllegalArgumentException();

        String delimiter = Pattern.quote(matcher.group(1));
        String numbers = matcher.group(2);

        return split_and_convert(numbers, delimiter);
    }

    private List<Integer> split_and_convert(String numbers, String delimiter){
        String[] tokens = numbers.split(delimiter);
        List<Integer> result = new ArrayList<>();

        for (String token : tokens)
            if (!token.isEmpty()) result.add(Integer.parseInt(token));


        return result;
    }
}
