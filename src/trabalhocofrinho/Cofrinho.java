package trabalhocofrinho;

import java.util.ArrayList;

// A classe Cofrinho representa um cofrinho que contém uma lista de moedas.
// O método adicionar recebe uma instância de Moeda e a adiciona à lista de moedas do cofrinho.
// O método remover recebe um valor e remove a primeira moeda com esse valor da lista de moedas do cofrinho.
// O método listagemMoedas percorre a lista de moedas e imprime cada uma delas.
// O método somarMoedas calcula a soma dos valores convertidos de todas as moedas na lista e retorna o total.
// A lista de moedas é armazenada como um atributo privado listaMoedas, que é uma instância da classe ArrayList<Moeda>.
// A lista de moedas é inicializada vazia no construtor da classe.
// A classe Cofrinho utiliza os métodos getValor() e converter() da classe Moeda para obter o valor e converter cada moeda, respectivamente.
public class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    public void remover(double valor) {
        Moeda moedaRemover = null;
        for (Moeda moeda : listaMoedas) {
            if (moeda.getValor() == valor) {
                moedaRemover = moeda;
                break;
            }
        }
        if (moedaRemover != null) {
            listaMoedas.remove(moedaRemover);
        } else {
            System.out.println("Não há moedas no cofrinho com o valor especificado!");
        }
    }

    public void listagemMoedas() {
        for (Moeda moeda : listaMoedas) {
            System.out.println(moeda);
        }
    }

    public double somarMoedas() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        System.out.println("Total: " + total);
        return total;
    }
}
