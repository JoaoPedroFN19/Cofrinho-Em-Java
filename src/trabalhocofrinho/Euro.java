package trabalhocofrinho;

// A classe Euro é uma subclasse da classe abstrata Moeda e representa uma moeda em Euro.
// O construtor Euro recebe um valor e chama o construtor da classe pai (Moeda) para atribuir o valor à variável valor da moeda.
// O método converter() é sobrescrito para realizar a conversão do valor da moeda Euro para Real, multiplicando-o por 5.56.
// O método info() é sobrescrito para exibir uma mensagem informando a conversão do Euro para Real, utilizando o método converter() para obter o valor convertido.
// O método toString() é sobrescrito para retornar uma representação em string da moeda Euro, incluindo o prefixo "Euro: " seguido do valor convertido.
// Essa classe fornece a implementação específica para a moeda Euro, incluindo sua conversão para Real e informações adicionais sobre a moeda.
public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return valor * 5.56;
    }

    @Override
    public void info() {
        System.out.println("Conversão de Euro para Real: " + this.converter());
    }

    @Override
    public String toString() {
        return "Euro: " + converter();
    }
}
