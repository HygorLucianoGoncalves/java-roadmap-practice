package org.example.java_fundamentals.files_and_APIs;

import java.io.File;
import java.io.IOException;

public class ModifyingDirectoryAndFiles {

    //Criando diretórios e arquivos
    public void createDirectory(String urlDirectory, String nameFolder) {
        File directory = new File(urlDirectory + nameFolder);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Directory " + directory.getName() + " created");
        }
    }

    //Criando um arquivo
    public void createFile(String urlDirectoryAndNameFolder, String nameFile) {
        File fileTest = new File(urlDirectoryAndNameFolder, nameFile);
        try {
            fileTest.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Listando os Arquivos
    public void listFileInDirectory(String urlDirectory) {
        File ls = new File(urlDirectory);
        for (File file : ls.listFiles()) {
            System.out.println(file);
        }
    }

    //Renomeando o arquivo
    public void renamingTheFile(String urlDirectoryAndNameFolder, String nameFile, String newNameFile) {
        File ls = new File(urlDirectoryAndNameFolder);
        File arq = new File(ls, nameFile);
        File arq2 = new File(ls, newNameFile);
        boolean statusRename = arq.renameTo(arq2);
        if (statusRename) {
            System.out.println("Renaming: " + statusRename + " -> New name: " + arq);
        }
    }

    //Deletando diretórios e arquivos
    public void deleteDirectory(String urlDirectory) {
        File directory = new File(urlDirectory);
        boolean delete = directory.delete();
        if (delete) {
            System.out.println("Directory " + directory.getName() + " deleted");
        }
    }

    //Delete Arquivos
    public void deleteFile(String urlDirectory, String nameFolderOrNameFile) {
        File fileTest = new File(urlDirectory, nameFolderOrNameFile);
        boolean delete = fileTest.delete();
        if (delete) {
            System.out.println("File " + fileTest.getName() + " deleted");
        }

    }

    //Verificando o tipo de arquivo
    public void checkingTheFileType(String urlDirectory) {
        File dir = new File(urlDirectory);
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                System.out.println(f + " é um diretório.");
            } else if (f.isFile()) {
            } else if (f.isFile()) {
                System.out.println(f.getName() + " é um arquivo.");
            }
        }

    }
}


