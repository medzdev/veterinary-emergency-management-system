//Nome: Gabriel Mediotti Marques
//RA: 2266377
public class Principal {
    public static void main(String[] args) {
        System.out.println("\n\tBem vindo ao Sistema de Gerenciamento do Departamento de Emergências Veterinárias!");
        Integer repetirMenu = 0;

        do {
            repetirMenu = 0;
            System.out.println("\n\tSelecione qual menu deseja acessar: ");
            System.out.println("\n\t(A) Menu de Gerenciamento de Fichas Cadastrais de Pessoas");
            System.out.println("\n\t(B) Menu de Gerenciamento de Fichas Cadastrais Animais");
            System.out.println("\n\t(C) Menu de Gerenciamento de Fichas Médicas e Fila de Atendimento");
            System.out.println("\n\t(X) Sair");
            Leitura leitor = new Leitura();
            Character opcaoMenu = leitor.input("Insira a opcao desejada: ").toLowerCase().charAt(0);

            switch (opcaoMenu){
                case 'a':
                    MenuFichaCadastralPessoa menuFichaCadastralPessoa = new MenuFichaCadastralPessoa();
                    break;
                case 'b':
                    MenuFichaCadastralAnimal menuFichaCadastralAnimal = new MenuFichaCadastralAnimal();
                    break;
                case 'c':
                    FilaDeAtendimento novaFilaDeAtendimento = new FilaDeAtendimento();
                    break;
                case 'd':
                    System.out.println("Menu (D): Gerenciamento da Fila de Atendimento");
                    break;
                case 'x':
                    System.out.println("Sair do Sistema");
                    break;
                default:
                    System.out.println("Opção errada! Tentar novamente.");
                    repetirMenu = 1;
                    break;
            }
        } while (repetirMenu.equals(1));
    }
}
