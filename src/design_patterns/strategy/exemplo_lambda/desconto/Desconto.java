package design_patterns.strategy.exemplo_lambda.desconto;

import java.math.BigDecimal;

public interface Desconto {

    BigDecimal descontar(BigDecimal valor);

    static Desconto vintePorcento(){
        return q -> q.multiply(BigDecimal.valueOf(0.2));
    }

    static Desconto trintaPorcento(){
        return q -> q.multiply(BigDecimal.valueOf(0.3));
    }

    static Desconto cinquentaPorcento(){
        return q -> q.multiply(BigDecimal.valueOf(0.5));
    }

}
