package design_patterns.strategy.exemplo_lambda.desconto;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public interface Desconto2 extends UnaryOperator<BigDecimal> {

    default Desconto2 descontar(Desconto2 desconto){
        return valor -> desconto.apply(this.apply(valor));
    }
}
