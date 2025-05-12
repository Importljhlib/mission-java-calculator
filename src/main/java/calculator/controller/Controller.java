package calculator.controller;

import calculator.model.Calculator;
import calculator.model.SeparatorParser;
import calculator.view.View;

import java.util.List;

public class Controller {
    private Calculator calculator;
    private View view;
    private SeparatorParser separator;

    public Controller(Calculator calculator, View view, SeparatorParser separator) {
        this.calculator = calculator;
        this.view = view;
        this.separator = separator;
    }

    public void run(){
        String input = view.get_input();
        try {
            int result = calculator.add(separator.parse(input));
            view.display_result(result);
        } catch (IllegalArgumentException e) {
            //
        }
    }
}
