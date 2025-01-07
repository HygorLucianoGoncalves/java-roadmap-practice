package org.example.JavaFundamentals.FilesAndAPIs;

public class Test {
    public static void main(String[] args) {

        String urlDirectory = "C:\\ArquivosTesteJava";
        ModifyingDirectoryAndFiles modifyingDirectoryAndFiles = new ModifyingDirectoryAndFiles();

        modifyingDirectoryAndFiles.createDirectory("C:\\","ArquivosTesteJava");
        modifyingDirectoryAndFiles.createFile("C:\\ArquivosTesteJava","nomeTesteONEpsipsi");
        modifyingDirectoryAndFiles.listFileInDirectory("C:\\ArquivosTesteJava");
//        modifyingDirectoryAndFiles.renamingTheFile(urlDirectory,"nomeTesteONEpsipsi","ArquivosTesteJavaNewName");
//        modifyingDirectoryAndFiles.deleteFile(urlDirectory,"ArquivosTesteJavaNewName");
//        modifyingDirectoryAndFiles.deleteDirectory(urlDirectory);
//        modifyingDirectoryAndFiles.checkingTheFileType("C:\\");



    }
}
