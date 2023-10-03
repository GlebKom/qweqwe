package app.services.calculation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service
public class CalculationService {

    @Autowired
    public Map<String, Calculate> map;

    public int calculate(int a, int b, String action) {
        Calculate calculate = map.get(action);

        if (calculate == null) {
            throw new UnsupportedOperationException(action + " is not supported.");
        }

        return calculate.doCalc(a, b);
    }

    public String getActionSign(String action) {
        Calculate calculate = map.get(action);

        if (calculate == null) {
            throw new UnsupportedOperationException(action + " is not supported.");
        }

        return calculate.getSign();
    }
}
