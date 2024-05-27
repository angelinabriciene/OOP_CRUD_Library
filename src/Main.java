import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sveiki atvykę į rekomendacijų biblioteką. Pasirinkite vieną iš funkcijų:");
        System.out.println("1. Įvesti naują autorių");
        System.out.println("2. Pamatyti visą autorių sąrašą");
        System.out.println("3. Redaguoti pasirinktą autorių");
        System.out.println("4. Ištrinti autorių iš sąrašo");
        System.out.println("5. Išeiti iš programos");
        System.out.println("---------------");
        ArrayList<Author> libraryAuthors = new ArrayList<>();
        Author a = new Author();
        a.setId(5555);
        a.setName("Petras");
        a.setSurname("Petraitis");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    Author.addAuthor(sc,libraryAuthors);
                    break;
                case 2:
                    Author.listAuthors(libraryAuthors);
                    break;
                case  3:
                    Author.editAuthor(sc, libraryAuthors);
                    break;
                case 4:




            }
        }
    }
}