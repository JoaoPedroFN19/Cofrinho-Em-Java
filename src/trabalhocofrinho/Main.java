package trabalhocofrinho;

// A classe Main contém o método main, que é o ponto de entrada do programa.
// No início do método, um objeto Scanner chamado teclado é criado para ler a entrada do usuário.
// Um objeto Cofrinho chamado cofrinho é criado para representar o cofrinho onde as moedas serão armazenadas.
// É iniciado um loop do-while que continuará executando até que o programa seja encerrado explicitamente.
// Dentro do loop, o menu principal é exibido ao usuário com as opções disponíveis.
// A entrada do usuário é lida para obter a opção selecionada.
// Dependendo da opção selecionada, diferentes ações são executadas, como adicionar moedas, remover moedas, listar moedas, calcular o total convertido para Real ou encerrar o programa.
// O loop continua executando até que o programa seja explicitamente encerrado pela opção "5-Encerrar".
// No final do programa, o objeto Scanner é fechado para liberar os recursos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao;

        do {
            System.out.println("Cofrinho");
            System.out.println("1-Adicionar Moeda");
            System.out.println("2-Remover Moeda");
            System.out.println("3-Listar Moedas");
            System.out.println("4-Calcular total convertido para Real");
            System.out.println("5-Encerrar");
            System.out.println("Escolha a opcao: ");

            while (!teclado.hasNextInt()) {
                System.out.println("Erro! Essa opcao nao existe: ");
                System.out.println("Tente novamente: ");
                teclado.next();
            }
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Voce escolheu a opcao 1 adicionar moeda!");
                    int tipo;
                    do {
                        System.out.println("Escolha o tipo da moeda que deseja adicionar:");
                        System.out.println("1-Real");
                        System.out.println("2-Dolar");
                        System.out.println("3-Euro");

                        while (!teclado.hasNextInt()) {
                            System.out.println("Erro! Tipo de moeda invalido.");
                            System.out.println("Escolha o tipo da moeda que deseja adicionar:");
                            System.out.println("1-Real");
                            System.out.println("2-Dolar");
                            System.out.println("3-Euro");
                            teclado.next();
                        }
                        tipo = teclado.nextInt();
                    } while (tipo <= 0 || tipo > 3);

                    if (tipo == 1) {
                        System.out.println("Digite o valor da moeda que deseja adicionar: ");
                        double valor = teclado.nextDouble();
                        Real real = new Real(valor);
                        cofrinho.adicionar(real);
                    } else if (tipo == 2) {
                        System.out.println("Digite o valor da moeda que deseja adicionar: ");
                        double valor = teclado.nextDouble();
                        Dolar dolar = new Dolar(valor);
                        cofrinho.adicionar(dolar);
                    } else if (tipo == 3) {
                        System.out.println("Digite o valor da moeda que deseja adicionar: ");
                        double valor = teclado.nextDouble();
                        Euro euro = new Euro(valor);
                        cofrinho.adicionar(euro);
                    } else {
                        System.out.println("Erro! voce digitou uma opcao invalida");
                    }
                    break;

                case 2:
                    System.out.println("Voce escolheu a opcao remover moeda!");
                    System.out.println("Qual moeda voce deseja remover ?");
                    System.out.println("1-Real");
                    System.out.println("2-Dolar");
                    System.out.println("3-Euro");

                    do {
                        while (!teclado.hasNextInt()) {
                            System.out.println("Erro! Essa opcao nao existe: ");
                            System.out.println("Tente novamente: ");
                            teclado.next();
                        }
                        opcao = teclado.nextInt();
                    } while (opcao <= 0 || opcao > 3);

                    if (opcao == 1) {
                        System.out.println("Digite o valor da moeda que deseja remover: ");
                        double valor = teclado.nextDouble();
                        cofrinho.remover(valor);
                    } else if (opcao == 2) {
                        System.out.println("Digite o valor da moeda que deseja remover: ");
                        double valor = teclado.nextDouble();
                        cofrinho.remover(valor);
                    } else if (opcao == 3) {
                        System.out.println("Digite o valor da moeda que deseja remover: ");
                        double valor = teclado.nextDouble();
                        cofrinho.remover(valor);
                    } else {
                        System.out.println("Erro! Essa opcao nao existe: ");
                    }
                    break;

                case 3:
                    System.out.println("Listar moedas");
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                    cofrinho.somarMoedas();
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    teclado.close();
                    return;

                default:
                    System.out.println("Erro, voce digitou um valor invalido!");
                    System.out.println("Tente novamente...");
            }
        } while (true);
    }
}
