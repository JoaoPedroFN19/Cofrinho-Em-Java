package trabalhocofrinho;

// A classe Real é uma subclasse da classe abstrata Moeda e representa uma moeda em Real.
// O construtor Real recebe um valor e chama o construtor da classe pai (Moeda) para atribuir o valor à variável valor da moeda.
// O método converter() é sobrescrito para retornar o próprio valor da moeda, já que não há conversão necessária para a moeda Real.
// O método info() é sobrescrito para exibir uma mensagem informando que não é necessário fazer a conversão, pois a moeda é Real.
// O método toString() é sobrescrito para retornar uma representação em string da moeda Real, incluindo o prefixo "Real: " seguido do próprio valor da moeda.
// Essa classe fornece a implementação específica para a moeda Real, onde não é necessário realizar conversão, pois a moeda já está em Real.
public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return valor;
    }

    @Override
    public void info() {
        System.out.println("Não é necessário fazer a conversão!");
    }

    @Override
    public String toString() {
        return "Real: " + this.converter();
    }
}
