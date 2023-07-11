package trabalhocofrinho;

// A classe Dolar é uma subclasse da classe abstrata Moeda e representa uma moeda em Dólar.
// O construtor Dolar recebe um valor e chama o construtor da classe pai (Moeda) para atribuir o valor à variável valor da moeda.
// O método converter() é sobrescrito para realizar a conversão do valor da moeda Dólar para Real, multiplicando-o por 5.06.
// O método info() é sobrescrito para exibir uma mensagem informando a conversão do Dólar para Real, utilizando o método converter() para obter o valor convertido.
// O método toString() é sobrescrito para retornar uma representação em string da moeda Dólar, incluindo o prefixo "Dólar: " seguido do valor convertido.
// Essa classe fornece a implementação específica para a moeda Dólar, incluindo sua conversão para Real e informações adicionais sobre a moeda.
public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return valor * 5.06;
    }

    @Override
    public void info() {
        System.out.println("Conversão de dólar para Real: " + this.converter());
    }

    @Override
    public String toString() {
        return "Dólar: " + converter();
    }
}
