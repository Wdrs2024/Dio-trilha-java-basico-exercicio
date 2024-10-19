import java.util.HashMap; // É uma implementação da interface Map que armazena pares de chave-valor. Ele permite que você armazene e recupere dados de forma eficiente
import java.util.Locale; // É usada para representar informações de localização específicas, como idioma, país e variantes de idioma. Ela é muito útil em aplicativos que precisam se adaptar a diferentes configurações regionais, como formatação de números, datas e textos
import java.util.Map; // É uma instrução em Java que importa a interface Map do pacote java.util.
import java.util.Scanner; // É uma instrução em Java que importa a classe Scanner do pacote java.util

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Mapeando números de contas, agências, clientes e saldos
        Map<Integer, String> contas = new HashMap<>();
        Map<String, Integer> agencias = new HashMap<>();
        Map<Integer, Double> saldos = new HashMap<>();

        // Adicionando algumas contas para teste
        contas.put(1021, "MARIO ANDRADE");
        agencias.put("067-8", 1021);
        saldos.put(1021, 237.48);
        
        contas.put(2024, "Sofia Barbosa");
        agencias.put("070-8", 2024);
        saldos.put(2024, 1500.00);

        // Solicitando os dados ao usuário
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt(); // Lê o número da conta

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next(); // Lê o número da agência

        // Verificando se a conta existe (containsKey(Object key-> é um método da interface Map em Java que verifica se um determinado mapa contém uma chave específica.)
        if (contas.containsKey(numero) && agencias.containsKey(agencia)) {
            String nomeCliente = contas.get(numero); // Obtém o nome do cliente
            double saldo = saldos.get(numero); // Obtém o saldo

            // Exibindo a mensagem final
            String mensagem = "Olá " + nomeCliente + 
                              ", obrigado por criar uma conta em nosso banco, " +
                              "sua agência é " + agencia + 
                              ", conta " + numero + 
                              " e seu saldo " + saldo + 
                              " já está disponível para saque.";

            System.out.println(mensagem);
        } else {
            System.out.println("Conta ou agência não encontrada.");
        }

        // Fechando o scanner
        scanner.close();
    }
}


