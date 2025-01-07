package org.example.JavaFundamentals.FilesAndAPIs.WritingToTxtFile;

public class User {
    private Integer id;
    private String name;
    private String pleaseNote;

    public User() {
    }

    public User(Integer id, String name, String pleaseNote) {
        this.id = id;
        this.name = name;
        this.pleaseNote = pleaseNote;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPleaseNote() {
        return pleaseNote;
    }

    public void setPleaseNote(String pleaseNote) {
        this.pleaseNote = pleaseNote;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pleaseNote='" + pleaseNote + '\'' +
                '}';
    }
}
