void main () {






    Scanner sc = new Scanner(System.in);
    int estudar, horasrestantes, horasextras, estudarmeta;

    estudarmeta = 40;

    IO.println(" quantas horas você estudou hoje?");
    estudar = sc.nextInt();

    if (estudar == estudarmeta) {
        IO.println("Você conseguiu atingir seu objetivo");


    } else if (estudar < estudarmeta) {
        IO.println("você não atingiu seu objetivo faltam : ");
        horasrestantes = estudarmeta - estudar;
        IO.println("faltam " + horasrestantes);

    }else{

        IO.println("Você ultrapassou sua meta : ");
        IO.println(estudar - 40);





    }































}
