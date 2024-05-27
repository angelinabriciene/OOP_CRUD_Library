public class Author {
    private int id;
    private String name;
    private String surename;

    public int getId() {
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

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }
    public Author() {
    }

    public Author(int id, String name, String surename) {
        this.id = id;
        this.name = name;
        this.surename = surename;
    }
}
