package dominio;

import java.util.ArrayList;
import java.util.List;

public class Aviao extends Object {

    private final CompartimentoCarga compartimentoCarga;
    private final TanqueCombustivel tanqueCombustivel;
    private final List<Turbina> lsTurbinas;

    public Aviao() {
        this.compartimentoCarga = new CompartimentoCarga();
        this.tanqueCombustivel = new TanqueCombustivel();
        this.lsTurbinas = new ArrayList<Turbina>();
        // CRIA DUAS TURBINAS NO AVIAO
        this.lsTurbinas.add(new Turbina());
        this.lsTurbinas.add(new Turbina());

        if (!isTurbinasLigadas()) {
            ligarTurbinas();
        }
    }

    public void ligarTurbinas() {
        if (getQntdAtualCombustivel() <= 0) {
            return;
        }
        this.lsTurbinas.forEach(t -> t.ligar());

    }

    public void desligarTurbinas() {
        this.lsTurbinas.forEach(t -> t.desligar());
    }

    public boolean isTurbinasLigadas() {
        return this.lsTurbinas.stream().anyMatch(t -> t.isLigado() == true);
    }

    public int nivelPotenciaTurbinas() {
        int qtdTurbinas = lsTurbinas.size();
        int nvPotencia = this.lsTurbinas.stream().mapToInt(t -> t.getNivelPotencia()).sum();
        return nvPotencia / qtdTurbinas;
    }

    public void aumentarPotenciaTurbinas() {
        this.lsTurbinas.forEach(t -> {
            try {
                t.aumentarPotencia(5);
            } catch (DesligadoException e) {
                e.printStackTrace();
            }
        });
    }

    public void diminuirPotenciaTurbinas() {
        this.lsTurbinas.forEach(t -> {
            try {
                t.diminuirPotencia(5);
            } catch (DesligadoException e) {
                e.printStackTrace();
            }
        });
    }

    public void abastecer(double valor) {
        this.tanqueCombustivel.abastecer(valor);
    }

    public void consumir(double valor) {
        this.tanqueCombustivel.consumir(valor);
    }

    public double getCapacidadeTotalCombustivel() {
        return this.tanqueCombustivel.getCapacidadeTotal().doubleValue();
    }

    public double getQntdAtualCombustivel() {
        return this.tanqueCombustivel.getQntAtual().doubleValue();
    }

    public void carregarCarga(int valor) {
        this.compartimentoCarga.carregarCarga(valor);
    }

    public void descarregarCarga(int valor) {
        this.compartimentoCarga.descarregarCarga(valor);
    }

    public float getCapacidadeTotalCarga() {
        return this.compartimentoCarga.getCapacidadeTotal();
    }

    public float getQntdAtualCarga() {
        return this.compartimentoCarga.getQntAtual();
    }

}