package br.com.fatec.sistemacomercioweb;

import br.com.fatec.sistemacomercioweb.model.Cliente;
import br.com.fatec.sistemacomercioweb.service.ClienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class TesteCliente {
    public static void main(String[] args) {
        // Inicializa o Spring Boot
        try (ConfigurableApplicationContext context =
                     SpringApplication.run(
                             SistemaComercioWebApplication.class, args)) {

            // Obtém o Service gerenciado pelo Spring
            ClienteService service =
                    context.getBean(ClienteService.class);

            // TESTE 1 - CADASTRAR CLIENTE
            Cliente cliente = new Cliente(
                    "Maria Eduarda da Silva",
                    "17777478906",
                    "11999456150",
                    "maria.e@email.com"
            );

            Cliente clienteSalvo = service.cadastrarcliente(cliente);

            System.out.println("Cliente cadastrado!" + clienteSalvo);


            // TESTE 2 - LISTAR CLIENTES
            System.out.println("\nLISTA DE CLIENTES:");

            for (Cliente c : service.listarcliente()) {
                System.out.println(c);
            }
        }
    }
}