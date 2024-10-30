package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ControllerCliente {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Cliente> clienteList = new ArrayList<>();
    private static Cliente cliente = new Cliente();

    //dados de objeto testes
    static {
        clienteList.add(new Cliente(1, "Alice Silva", "alice.silva@exemplo.com", "111222333", true));
        clienteList.add(new Cliente(2, "Bruno Oliveira", "bruno.oliveira@exemplo.com", "222333444", false));
        clienteList.add(new Cliente(3, "Carla Souza", "carla.souza@exemplo.com", "333444555", true));
        clienteList.add(new Cliente(4, "Daniel Santos", "daniel.santos@exemplo.com", "444555666", false));
        clienteList.add(new Cliente(5, "Eduarda Lima", "eduarda.lima@exemplo.com", "555666777", true));
        clienteList.add(new Cliente(6, "Fernando Almeida", "fernando.almeida@exemplo.com", "666777888", false));
        clienteList.add(new Cliente(7, "Gabriela Costa", "gabriela.costa@exemplo.com", "777888999", true));
        clienteList.add(new Cliente(8, "Henrique Pereira", "henrique.pereira@exemplo.com", "888999000", false));
        clienteList.add(new Cliente(9, "Isabela Rocha", "isabela.rocha@exemplo.com", "999000111", true));
        clienteList.add(new Cliente(10, "Jorge Martins", "jorge.martins@exemplo.com", "000111222", false));
        clienteList.add(new Cliente(11, "Karina Mendes", "karina.mendes@exemplo.com", "111222333", true));
        clienteList.add(new Cliente(12, "Lucas Fernandes", "lucas.fernandes@exemplo.com", "222333444", false));
        clienteList.add(new Cliente(13, "Mariana Ferreira", "mariana.ferreira@exemplo.com", "333444555", true));
        clienteList.add(new Cliente(14, "Natália Ramos", "natalia.ramos@exemplo.com", "444555666", false));
        clienteList.add(new Cliente(15, "Otávio Pires", "otavio.pires@exemplo.com", "555666777", true));
        clienteList.add(new Cliente(16, "Paula Nascimento", "paula.nascimento@exemplo.com", "666777888", false));
        clienteList.add(new Cliente(17, "Quintino Silva", "quintino.silva@exemplo.com", "777888999", true));
        clienteList.add(new Cliente(18, "Renata Alves", "renata.alves@exemplo.com", "888999000", false));
        clienteList.add(new Cliente(19, "Samuel Oliveira", "samuel.oliveira@exemplo.com", "999000111", true));
        clienteList.add(new Cliente(20, "Tatiane Costa", "tatiane.costa@exemplo.com", "000111222", false));
        clienteList.add(new Cliente(21, "Ursula Martins", "ursula.martins@exemplo.com", "111222333", true));
        clienteList.add(new Cliente(22, "Vinícius Ribeiro", "vinicius.ribeiro@exemplo.com", "222333444", false));
        clienteList.add(new Cliente(23, "Wanda Lima", "wanda.lima@exemplo.com", "333444555", true));
        clienteList.add(new Cliente(24, "Xuxa Santos", "xuxa.santos@exemplo.com", "444555666", false));
        clienteList.add(new Cliente(25, "Yasmin Almeida", "yasmin.almeida@exemplo.com", "555666777", true));
        clienteList.add(new Cliente(26, "Zeca Pimentel", "zecapimentel@exemplo.com", "666777888", false));
        clienteList.add(new Cliente(27, "André Sousa", "andre.souza@exemplo.com", "777888999", true));
        clienteList.add(new Cliente(28, "Bia Oliveira", "bia.oliveira@exemplo.com", "888999000", false));
        clienteList.add(new Cliente(29, "Célia Santos", "celia.santos@exemplo.com", "999000111", true));
        clienteList.add(new Cliente(30, "Davi Mendes", "davi.mendes@exemplo.com", "000111222", false));
        clienteList.add(new Cliente(31, "Ellen Ferreira", "ellen.ferreira@exemplo.com", "111222333", true));
        clienteList.add(new Cliente(32, "Fábio Almeida", "fabio.almeida@exemplo.com", "222333444", false));
        clienteList.add(new Cliente(33, "Gustavo Nascimento", "gustavo.nascimento@exemplo.com", "333444555", true));
        clienteList.add(new Cliente(34, "Helena Pires", "helena.pires@exemplo.com", "444555666", false));
        clienteList.add(new Cliente(35, "Igor Rocha", "igor.rocha@exemplo.com", "555666777", true));
        clienteList.add(new Cliente(36, "Juliana Ribeiro", "juliana.ribeiro@exemplo.com", "666777888", false));
        clienteList.add(new Cliente(37, "Karla Costa", "karla.costa@exemplo.com", "777888999", true));
        clienteList.add(new Cliente(38, "Leonardo Martins", "leonardo.martins@exemplo.com", "888999000", false));
        clienteList.add(new Cliente(39, "Mônica Alves", "monica.alves@exemplo.com", "999000111", true));
        clienteList.add(new Cliente(40, "Nicolas Ferreira", "nicolas.ferreira@exemplo.com", "000111222", false));
        clienteList.add(new Cliente(41, "Olivia Santos", "olivia.santos@exemplo.com", "111222333", true));
        clienteList.add(new Cliente(42, "Pedro Lima", "pedro.lima@exemplo.com", "222333444", false));
        clienteList.add(new Cliente(43, "Quiteria Silva", "quiteria.silva@exemplo.com", "333444555", true));
        clienteList.add(new Cliente(44, "Rafael Oliveira", "rafael.oliveira@exemplo.com", "444555666", false));
        clienteList.add(new Cliente(45, "Sofia Mendes", "sofia.mendes@exemplo.com", "555666777", true));
        clienteList.add(new Cliente(46, "Tadeu Almeida", "tadeu.almeida@exemplo.com", "666777888", false));
        clienteList.add(new Cliente(47, "Umberto Costa", "umberto.costa@exemplo.com", "777888999", true));
        clienteList.add(new Cliente(48, "Vanessa Martins", "vanessa.martins@exemplo.com", "888999000", false));
        clienteList.add(new Cliente(49, "William Nascimento", "william.nascimento@exemplo.com", "999000111", true));
        clienteList.add(new Cliente(50, "Xanderson Rocha", "xanderson.rocha@exemplo.com", "000111222", false));

    }


    public static void cadastrarCliente() {
        try {
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Telefone: ");
            String telefone = sc.nextLine();
            cliente = new Cliente(gerarID(clienteList), name, email, telefone, true);
            clienteList.add(cliente);
            System.out.println("Cliente cadastrado com sucesso!");
            System.out.println(cliente);
            System.out.println("\n enter para continuar");
            sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void buscarCliente() {
        sc = new Scanner(System.in);
        try {
            System.out.print("Digite o ID do cliente: ");
            int id = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            if (id <= 0) {
                System.out.println("ID deve ser maior que zero.");
            }
            Cliente cliente = buscador(id);
            if (cliente == null) {
                System.out.println("cliente não encontrado!");
                System.out.println("Enter para continuar...");
                sc.nextLine();
                return;
            }if (!cliente.isAtivo()){
                System.out.println("Cliente desativado");
                System.out.println("Enter para continuar...");
                sc.nextLine();
            }else{
                System.out.println("Cliente encotrado");
                System.out.println(cliente);
                System.out.println("Enter para continuar...");
                sc.nextLine();

            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Por favor, insira um número inteiro para o ID.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado.");
            e.printStackTrace();
        }
    }



    public static void excluirCliente() {
        try {
            System.out.println("Digite o ID do cliente: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (id > 0 && id <= clienteList.size()) {
                Cliente cliente = clienteList.get(id - 1);
                boolean ativado = true;
                while (ativado) {
                    System.out.printf("Você realmente deseja desativar ou excluir o cliente: %s?%n", cliente.getNome());
                    System.out.println("""
                            1 - Desativar cliente
                            2 - Excluir cliente
                            3 - cancelar
                            """);
                    int op = sc.nextInt();
                    sc.nextLine();
                    if (op == 1 || op == 2 || op == 3) {
                        if (op == 1) {
                            cliente.setAtivo(false);
                            System.out.println("Cliente Desativado com sucesso!");
                            System.out.println(cliente);
                            System.out.println("Enter para continuar...");
                            sc.nextLine();
                            ativado = false;
                        } if(op == 2 ){
                            clienteList.remove(cliente);
                            System.out.println("Cliente excluido com sucesso!");
                            System.out.println(cliente);
                            System.out.println("Enter para continuar...");
                            sc.nextLine();
                            ativado = false;
                        }
                        else {
                            System.out.println("Cancelado com sucesso!");
                            System.out.println("Enter para continuar...");
                            sc.nextLine();
                            ativado = false;
                        }
                    } else {
                        System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                    }
                }

            } else {
                System.out.println("Cliente nao encontrado com sucesso!");
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado.");
        }
    }

    public static void atualizarCliente() {

    }

    public static void listarCliente() {
        try{
            System.out.println("""
                    Qual lista deseja?
                    1 - Clientes ativos
                    2 - Clientes desativados 
                    3 - Todos
                    """);
            int op = sc.nextInt();
            sc.nextLine();
            if(op == 1){
                for (Cliente cliente : clienteList) {
                    if (cliente.isAtivo()) {
                        System.out.println(cliente);
                    }
                }
            }else if(op == 2){
                for (Cliente cliente : clienteList) {
                    if (!cliente.isAtivo()) {
                        System.out.println(cliente);
                    }
                }
            }else{
                for (Cliente cliente : clienteList) {
                    System.out.println(cliente);
                }
            }
        }catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static void recuperarCliente() {

    }

    public static int gerarID(ArrayList<Cliente> clientes) {
        if (!clientes.isEmpty()) {
            return (clientes.get(clientes.size() - 1).getId()) + 1;
        }
        return 1;
    }

    public static Cliente buscador(int id) {
        for(Cliente c : clienteList) {
            if (c.getId() == id) {
                return c;
            }
        }
            return null;
    }
}
