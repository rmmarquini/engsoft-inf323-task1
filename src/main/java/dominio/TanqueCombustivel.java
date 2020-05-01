package dominio;

import java.math.BigDecimal;

public class TanqueCombustivel extends Compartimento<BigDecimal> implements Tanque {

    public TanqueCombustivel() {
        super(new BigDecimal(1000), new BigDecimal(0));
    }

    @Override
    public boolean abastecer(double valor) {
        if (valor <= 0) {
            return false;
        }

        // COLETA A CapacidadeTotal DO COMPARTIMENTO
        BigDecimal capacidadeTotal = this.getCapacidadeTotal();
        // CONVERTE O VALOR QUE REPRESENTA O ABASTECIMENTO PARA BigDecimal
        BigDecimal valAbastecimento = new BigDecimal(valor);
        // ARMAZENA A QTDE TOTAL DO COMPARTIMENTO DE CARGA APOS O ABASTECIMENTO
        BigDecimal qntDepoisAbastecimento = this.getQntAtual().add(valAbastecimento);

        // SETANDO O VALOR ATUAL DO COMPARTIMENTO DE CARGA ATÉ A CAPACIDADE TOTAL
        this.setQntAtual(qntDepoisAbastecimento.min(capacidadeTotal));

        // VERIFICA SE O VALOR FINAL DO COMPARTIMENTO DE CARGA EXCEDE A CAPACIDADE TOTAL
        if (qntDepoisAbastecimento.compareTo(capacidadeTotal) == 1) {
            return false;
        }

        return true;
    }

    @Override
    public boolean consumir(double valor) {
        if (valor <= 0) {
            return false;
        }

        // CONVERTE O VALOR QUE REPRESENTA O CONSUMO PARA BigDecimal
        BigDecimal consumo = new BigDecimal(valor);
        // REDUZ O VALOR DO COMPARTIMENTO ATUAL DE CARGA REFERENTE AO QUE FOI CONSUMIDO DE COMBUSTIVEL
        BigDecimal qntDepoisConsumo = this.getQntAtual().subtract(consumo);
        // SETA O NOVO VALOR DO COMPARTIMENTO DE CARGA DENTRO DO LIMITE DE 0
        this.setQntAtual(qntDepoisConsumo.max(BigDecimal.ZERO));

        if (qntDepoisConsumo.compareTo(BigDecimal.ZERO) == -1) {
            return false;
        }

        return true;

    }

    

}