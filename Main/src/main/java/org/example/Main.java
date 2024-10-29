package org.example;

// TODO 1: Implementar a classe Cliente com os atributos: ID, nome, email e telefone.
// TODO 1: Criar método adicionarCliente(Cliente cliente) para adicionar um novo cliente.
// TODO 2: Criar método listarClientes() para retornar uma lista com todos os clientes cadastrados.
// TODO 3: Criar método atualizarCliente(int id, Cliente cliente) para atualizar os dados de um cliente com base no ID.
// TODO 4: Criar método removerCliente(int id) para remover um cliente com base no ID.♠
// TODO 5: Criar método buscarCliente(int id) para buscar um cliente pelo ID e retornar suas informações.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        boolean controlador = true;

        while (controlador) {

            try {
                System.out.println("""
                        1 - Cadastrar cliente
                        2 - Listar clientes
                        3 - Atualizar cliente
                        4 - Excluir cliente
                        5 - Buscar cliente
                        0 - Sair
                        """);
                int op = SC.nextInt();
                switch (op) {
                    case 1:
                        ControllerCliente.cadastrarCliente();
                        break;
                    case 2:
                        ControllerCliente.listarCliente();
                        break;
                    case 3:
                        ControllerCliente.atualizarCliente();
                        break;
                    case 4:
                        ControllerCliente.excluirCliente();
                        break;
                    case 5:
                        ControllerCliente.buscarCliente();
                        break;
                    case 0:
                        System.out.println("Saindo do programa: ");
                        controlador = false;
                        break;
                    default:
                        System.out.println("Opção invalida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }


}
