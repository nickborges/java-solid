package design_patterns.behavior.strategy.exemplo_lambda.desconto;

import java.math.BigDecimal;

public class Desconto2Contexto {

    public BigDecimal descontar(Desconto2 desconto2, BigDecimal valor){
        return desconto2.apply(valor);
    }
}
