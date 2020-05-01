package dominio;

public class Turbina extends Motor {

    private int nivelPotencia;

    public Turbina() {
        this.nivelPotencia = 0;
    }

    @Override
    protected void ligar() {
        super.ligar();
        this.nivelPotencia = 5;
    }

    @Override
    protected void desligar() {
        super.desligar();
        this.nivelPotencia = 0;
    }

    /**
     * AUMETAR O NIVEL DE POTENCIA DA TURBINA
     * @param {int} aumento
     * @throws DesligadoException
     */
    public void aumentarPotencia(int aumento) throws DesligadoException {
        if (!isLigado()) {
            throw new DesligadoException("As turbinas encontram-se desligadas.");
        } 
        
        if (aumento < 0) {
            return;
        }

        this.nivelPotencia = Math.min(this.nivelPotencia + aumento, 100);
    }

    /**
     * DIMINUIR O NIVEL DE POTENCIA DA TURBINA
     * @param {int} diminuicao
     * @throws DesligadoException
     */
    public void diminuirPotencia(int diminuicao) throws DesligadoException {
        if (!isLigado()) {
            throw new DesligadoException("As turbinas encontram-se desligadas.");
        } 
        
        if (diminuicao < 0) {
            return;
        }
        
        this.nivelPotencia = Math.max(this.nivelPotencia - diminuicao, 100);
    }

    /**
     * RETORNA O VALOR DO NIVEL DE POTENCIA ATUAL DA TURBINA
     * @return {int} nivelPotencia
     */
    public int getNivelPotencia() {
        return nivelPotencia;
    }

}