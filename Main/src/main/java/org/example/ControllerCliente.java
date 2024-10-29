package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class ControllerCliente {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Cliente> clienteList = new ArrayList<>();
    private static Cliente cliente = new Cliente();

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
        Scanner sc = new Scanner(System.in);
        boolean clienteEncontrado = false;
        try {
            System.out.print("Digite o ID do cliente: ");
            int id = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            for (Cliente cliente : clienteList) {
                if (cliente.getId() == id) {
                    if (cliente.isAtivo()) {
                        System.out.println("Cliente encontrado com sucesso!");
                        System.out.println(cliente);
                    } else {
                        System.out.println("Cliente desativado");
                        System.out.println(cliente);
                    }
                    clienteEncontrado = true;
                    System.out.println("\nPressione Enter para continuar");
                    sc.nextLine();
                    break;
                }
            }

            if (!clienteEncontrado) {
                System.out.println("Cliente inexistente.");
            }

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida. Por favor, insira um número inteiro para o ID.");
            e.printStackTrace();
        }
    }


    public static void excluirCliente() {

    }

    public static void atualizarCliente() {

    }

    public static void listarCliente() {
    }

    public static int gerarID(ArrayList<Cliente> clientes) {
        if (!clientes.isEmpty()) {
            return (clientes.get(clientes.size() - 1).getId()) + 1;
        }
        return 1;
    }
}
