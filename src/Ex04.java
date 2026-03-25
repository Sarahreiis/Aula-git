void main() {
    Scanner sc = new Scanner(System.in);
    int passos, passosrestantes, passosextras, passosmeta;

    passosmeta = 10000;

    IO.println("Digite quantos passos vc deu hoje ao total");
    passos = sc.nextInt();

    if (passos == passosmeta) {
        IO.println("Você atingiu sua meta");


    } else if (passos < passosmeta) {
        IO.println("você não atingiu sua meta faltam : ");
        passosrestantes = passosmeta - passos;
        IO.println("faltam " + passosrestantes);

    }else {
        IO.println("Você ultrapassou sua meta : ");
        IO.println(passos - 10000);



    }



}