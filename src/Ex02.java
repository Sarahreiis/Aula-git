void main() {

    Scanner sc = new Scanner(System.in);
    IO.println("nome do cliente");
    String nome = sc.next();

    IO.println("prato escolhido");
    String prato = sc.next();

    IO.println("valor do prato");
    double valor = sc.nextDouble();

    IO.println("Informações do pedido");
    IO.println("Seu nome é " + nome);
    IO.println("Seu prato escolhido é " + prato);
    IO.println("O valor será " + valor);



}