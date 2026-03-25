void main () {






    Scanner sc = new Scanner(System.in);
    int guardar, reaisrestantes, reiasextras, guardarmeta;

    guardarmeta = 500;

    IO.println(" quantos reais você guardou hoje");
    guardar = sc.nextInt();

    if (guardar == guardarmeta) {
        IO.println("Você conseguiu atingir seu objetivo");


    } else if (guardar < guardarmeta) {
        IO.println("você não atingiu seu objetivo faltam : ");
        reaisrestantes = guardarmeta - guardar;
        IO.println("faltam " + reaisrestantes);

    }else{

        IO.println("Você ultrapassou sua meta : ");
        IO.println(guardar - 500);





    }































}
