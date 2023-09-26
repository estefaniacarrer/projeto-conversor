package interfaces;

import java.math.BigDecimal;

public interface InicializadorConversao {

    BigDecimal operadorConversao(String operacao, double valorInicial) throws Exception;
}
