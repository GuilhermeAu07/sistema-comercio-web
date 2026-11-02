package br.com.fatec.sistemacomercioweb;

import br.com.fatec.sistemacomercioweb.model.Produto;
import br.com.fatec.sistemacomercioweb.service.ProdutoService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

public class TesteProduto {
    public static void main(String[] args) {
        // Inicializa o Spring Boot
        try (ConfigurableApplicationContext context =
                     SpringApplication.run(
                             SistemaComercioWebApplication.class, args)) {

            // Obtém o Service gerenciado pelo Spring
            ProdutoService service =
                    context.getBean(ProdutoService.class);

            // TESTE 1 - CADASTRAR PRODUTO
            Produto produto = new Produto(
                    "Cabo de rede",
                    "cabo de conexão direta ao computador",
                    BigDecimal.valueOf(23.90),
                    19
            );

            Produto produtoSalvo = service.cadastrarproduto(produto);

            System.out.println("Produto cadastrado!" + produtoSalvo);

            // TESTE 2 - LISTAR PRODUTOS
            System.out.println("\nLISTA DE PRODUTOS:");

            for (Produto p : service.listarproduto()) {
                System.out.println(p);
            }

        }
    }
}
