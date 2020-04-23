package dominio;


public class Motor {

    // O MOTOR INICIA DESLIGADO
    private boolean ligado = false;

    public void Motor() {}

    /**
     * PARA LIGAR O MOTOR PRECISA VERIFICAR SE ESTA DESLIGADO
     */
    protected void ligar() {
        if (!isLigado()) {
            this.ligado = true;
        }
    }

    /** 
     * PARA DESLIGAR O MOTOR PRECISA VERIFICAR SE ESTA LIGADO
     */
    protected void desligar() {
        if (isLigado()) {
            this.ligado = false;
        }
    }

    /**
     * VERIFICA SE O MOTOR ESTA LIGADO OU DESLIGADO
     * @return {boolean} 
     */
    protected boolean isLigado() {
        if (!(this.ligado)) {
            return false;
        }
        return true;
    }

}