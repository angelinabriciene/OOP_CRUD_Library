import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    private long id;
    private String name;
    private String surname;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surename) {
        this.surname = surename;
    }

    public Author() {
    }

    public Author(int id, String name, String surename) {
        this.id = id;
        this.name = name;
        this.surname = surename;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surename='" + surname + '\'' +
                '}';
    }

    public static void addAuthor(Scanner sc, ArrayList<Author> libraryAuthors) {
        Author aut = new Author();
//        int authorCount = 0;
        System.out.println("Įveskite autoriaus vardą");
        aut.setName(sc.nextLine());
        System.out.println("Įveskite autoriaus paradę");
        aut.setSurname(sc.nextLine());
//        authorCount++;
//        aut.setId(authorCount);
        System.out.println("Įveskite ID numerį");
        aut.setId(sc.nextInt());
        System.out.println("Autorius užregistruotas.");
        libraryAuthors.add(aut);
    }

    public static void listAuthors(ArrayList<Author> libraryAuthors) {
        System.out.println("Autorių sąrašas: " + libraryAuthors);
    }

    public static void editAuthor(Scanner sc, ArrayList<Author> libraryAuthors) {
        System.out.println("Įveskite autoriaus ID, kurį norite redaguoti:");
        long oldID = sc.nextLong();
        sc.nextLine();
        for (int i = 0; i < libraryAuthors.size(); i++) {
            Author author = libraryAuthors.get(i);
            if (author.getId() == oldID) {
                System.out.println("Įveskite naują autoriaus vardą:");
                String newName = sc.nextLine();
                System.out.println("Įveskite naują autoriaus pavardę:");
                String newSurname = sc.nextLine();
                System.out.println("Įveskite naują autoriaus ID:");
                long newID = sc.nextLong();
                sc.nextLine();
                author.setName(newName);
                author.setSurname(newSurname);
                if (newID != 0) {
                    author.setId((int) newID);
                }
                System.out.println("Autorius sėkmingai atnaujintas!");
                return;
            }
        }
        System.out.println("Autorius nerastas.");
    }
}
