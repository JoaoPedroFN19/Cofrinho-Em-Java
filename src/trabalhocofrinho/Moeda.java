package trabalhocofrinho;

// A classe abstrata Moeda representa uma moeda genérica.
// A classe possui um atributo protegido valor, que armazena o valor da moeda.
// O construtor Moeda recebe um valor e atribui-o ao atributo valor.
// O método getValor() retorna o valor da moeda.
// O método abstrato converter() deve ser implementado pelas subclasses para realizar a conversão do valor da moeda.
// O método abstrato info() deve ser implementado pelas subclasses para fornecer informações específicas sobre a moeda.
// O método toString() é declarado como abstrato e será implementado pelas subclasses para retornar uma representação em string da moeda.
// Essa classe fornece a base para as subclasses como Real, Dolar e Euro implementarem seus próprios métodos de conversão e informações específicas da moeda.
public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public abstract double converter();

    public abstract void info();

    @Override
    public abstract String toString();
}
