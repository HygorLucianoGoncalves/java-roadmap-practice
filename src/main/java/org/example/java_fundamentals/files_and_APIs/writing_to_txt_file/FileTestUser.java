package org.example.java_fundamentals.files_and_APIs.writing_to_txt_file;

import org.example.java_fundamentals.files_and_APIs.ModifyingDirectoryAndFiles;

public class FileTestUser {
    public static void main(String[] args) {
        ModifyingDirectoryAndFiles modifyingDirectoryAndFiles = new ModifyingDirectoryAndFiles();
        CrudWritingFile crudWritingFile = new CrudWritingFile();

        User user1 = new User(1, "Ronaldinho Gaúcho", "Jogador de Futebol");
        User user2 = new User(2, "Nelson Piquet", "Piloto de Fómula 1");
        User user3 = new User(3, "Monteiro Lobato", "Escritor");
        User user4 = new User(4, "Luana Piovani", "Atriz");
        User user5 = new User(5, "Ana Maria Braga", "Apresentadora de Televisão");
        User user6 = new User(6, "João Carlos", "Programador JEE");


        crudWritingFile.write("C:\\ArquivosTesteJava","teste",user1);
        crudWritingFile.read("C:\\ArquivosTesteJava","teste");



    }
}
