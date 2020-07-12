package design_patterns.strategy;

import java.math.BigDecimal;

public class ICMS implements Imposto{

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().subtract(
                orcamento.getValor().multiply(BigDecimal.valueOf(0.2))
        );
    }
}
