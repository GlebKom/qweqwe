package app.services.calculation;

import org.springframework.stereotype.Component;

@Component("subtraction")
public class Subtraction implements Calculate {

    private final String ACTION = "subtraction";
    @Override
    public int doCalc(int a, int b) {
        return a - b;
    }

    public String getSign() {
        return "/";
    }
}
