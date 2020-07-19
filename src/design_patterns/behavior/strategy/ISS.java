package design_patterns.behavior.strategy;

import java.math.BigDecimal;

public class ISS implements Imposto{
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().subtract(
                orcamento.getValor().multiply(BigDecimal.valueOf(0.1))
        );
    }
}
