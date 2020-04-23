package dominio;

import java.util.ArrayList;
import java.util.List;

public class Aviao {

    private final TanqueCombustivel tanqueCombustivel;
    private final CompartimentoCarga compartimentoCarga;
    private final List<Turbina> lsTurbinas;

    public Aviao() {
        this.tanqueCombustivel = new TanqueCombustivel();
        this.compartimentoCarga = new CompartimentoCarga();
        this.lsTurbinas = new ArrayList<Turbina>();


    }

    // ------------------------------
    // GETTERS
    // ------------------------------
    public TanqueCombustivel getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public CompartimentoCarga getCompartimentoCarga() {
        return compartimentoCarga;
    }

    public List<Turbina> getLsTurbinas() {
        return lsTurbinas;
    }

    public boolean isTurbinasLigadas() {
        return false;
    }

    public int nivelPotenciaTurbinas() {
        return 0;
    }

    public double getCapacidadeTotalCombustivel() {
        return 0.0;
    }

    public double getQntdAtualCombustivel() {
        return 0.0;
    }

    public float getCapacidadeTotalCarga() {
        return 0;
    }

    public float getQntdAtualCarga() {
        return 0;
    }

    // ------------------------------
    // IMPLEMENTACOES DE METODOS
    // ------------------------------
    public void ligarTurbinas() {

    }

    public void desligarTurbinas() {

    }

    public void aumentarPotenciaTurbinas() {

    }

    public void diminuirPotenciaTurbinas() {

    }

    public void abastecer(double valor) {

    }

    public void consumir(double valor) {

    }

    public void carregarCarga(int value) {

    }

    public void descarregarCarga(int value) {

    }

}