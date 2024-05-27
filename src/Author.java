import java.util.ArrayList;
import java.util.InputMismatchException;
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
        for (int i = 0; i < libraryAuthors.size(); i++) { //nuskaito kiekvieną objektą visame array dydyje (size)
            Author author = libraryAuthors.get(i); //radus reikalingą objektą gauna ID
            if (author.getId() == oldID) { // jei gautas ID sutampa su ivestu ID, dirba toliau ties tuo objektu
                System.out.println("Įveskite naują autoriaus vardą:");
                String newName = sc.nextLine(); //pasiima naują vardą
                System.out.println("Įveskite naują autoriaus pavardę:");
                String newSurname = sc.nextLine();
                System.out.println("Įveskite naują autoriaus ID:");
                long newID = sc.nextLong(); //pasiima naują ID
                sc.nextLine();
                author.setName(newName); //įgalina vardą, pavardę
                author.setSurname(newSurname);
                System.out.println("Autoriaus duomenys atnaujinti: " + newID + " " + newName + " " + newSurname);
                return;
            } else System.out.println("Autorius nerastas.");
        }
    }

    public static void removeAuthor(Scanner sc, ArrayList<Author> libraryAuthors) {
        boolean authorFound = false;
        while (true) {
            System.out.println("Įveskite autoriaus ID, kurį norite ištrinti");
            try {
                long authorID = sc.nextLong();
                for (int i = 0; i < libraryAuthors.size(); i++) {
                    Author author = libraryAuthors.get(i);
                    if (author.getId() == authorID) {
                        libraryAuthors.remove(author);
                        System.out.println("Autorius ištrintas");
                        authorFound = true;
                        break;
                    }
                }
                if (!authorFound) {
                    System.out.println("Autorius pagal tokį ID nerastas");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Klaida vedant ID. Įveskite keturis skaitmenis");
                sc.next();
            }
        }
    }
}