package app.services.calculation;

import org.springframework.stereotype.Component;

@Component("multiplication")
public class Multiplication implements Calculate {

    private final String ACTION = "MULTIPLICATION";
    @Override
    public int doCalc(int a, int b) {
        return a + b;
    }

    public String getSign() {
        return "*";
    }
}
