package dominio;

public class CompartimentoCarga extends Compartimento<Float> {

    public CompartimentoCarga() {
        super(1000.0f, 0.0f);
    }

    /**
     * CARREGAR O COMPARTIMENTO DE CARGA
     * VERIFICA SE NAO ULTRAPASSA A CAPACIDADE 
     * TOTAL E SE NAO ESTA REMOVENDO CARGA
     * 
     * @param {float} valor
     * @return {boolean}
     */
    public boolean carregarCarga(float valor) {
        Float capacidadeTotal = getCapacidadeTotal();
        Float qntCargaDepois  = getQntAtual() + valor;

        if (valor < 0 || qntCargaDepois > capacidadeTotal) {
            return false;
        }

        setQntAtual(qntCargaDepois);

        return true;

    }

    /**
     * DESCARREGA O COMPARTIMENTO DE CARGA
     * 
     * @param {float} valor
     * @return {boolean}
     */
    public boolean descarregarCarga(float valor) {
        Float qntCargaDepois = getQntAtual() - valor;

        if (valor < 0 || qntCargaDepois < 0) {
            return false;
        }

        setQntAtual(qntCargaDepois);

        return true;
    }

}