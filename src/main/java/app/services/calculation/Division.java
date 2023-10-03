package app.services.calculation;

import org.springframework.stereotype.Component;

@Component("division")
public class Division implements Calculate {

    private final String ACTION = "division";
    @Override
    public int doCalc(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public String getSign() {
        return "/";
    }
}
