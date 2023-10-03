package app.services.calculation;

import org.springframework.stereotype.Component;

@Component("addition")
public class Addition implements Calculate {

    @Override
    public int doCalc(int a, int b) {
        return a + b;
    }

    public String getSign() {
        return "+";
    }
}
