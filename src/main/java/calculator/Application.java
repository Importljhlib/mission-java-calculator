package calculator;

import calculator.controller.Controller;
import calculator.model.Calculator;
import calculator.model.SeparatorParser;
import calculator.view.View;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        View view = new View();
        SeparatorParser separatorParser = new SeparatorParser();
        Controller controller = new Controller(calculator, view, separatorParser);

        controller.run();
    }
}

//변동사항 전부 적립(?) : git add .
//커밋 : git commit -m "커밋메시지"
//push : git push
