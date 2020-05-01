package dominio;


public class Motor {

    private boolean ligado;
    
    public void Motor() {
        this.ligado = false;
    }

    protected void ligar() {
        System.out.println("LIGANDO MOTOR!");
        this.ligado = true;
    }

    protected void desligar() {
        System.out.println("DESLIGANDO MOTOR!");
        this.ligado = false;
    }

    /**
     * VERIFICA SE O MOTOR ESTA LIGADO OU DESLIGADO
     * @return {boolean} ligado
     */
    protected boolean isLigado() {
        return this.ligado;
    }

}