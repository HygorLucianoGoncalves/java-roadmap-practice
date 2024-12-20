package org.example.JavaFundamentals.filesAndAPIs;

import java.io.File;
import java.io.IOException;

public class ExempleFilesAndApis {
    static final String urldirectory = "C:\\";
    static final String urlfile = "ArquivosTesteJava";


    public static void main(String[] args) {


        //Criando diretórios e arquivos
        File directory = new File(urldirectory + urlfile);
        if (!directory.exists()) {
            boolean statusDir = directory.mkdir();
            System.out.println("Directory " + directory.getName() + " created");
        }

        //Criando um arquivo
        File fileTest = new File(directory, "criandoArquivo.txt");
        if (!fileTest.exists()) {
            try {
                boolean statusArq = fileTest.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Listando os Arquivos
        File ls = new File(urldirectory + urlfile);
        for (File file : ls.listFiles()) {
            System.out.println(file);
        }

        //Renomeando o arquivo
        File lsTwo = new File(urldirectory + urlfile);
        File arq = new File(lsTwo, "arq_02.txt");
        File arq2 = new File(lsTwo, "arq_03.txt");
        boolean statusRename = arq.renameTo(arq2);
        System.out.println("Renomedo: " + statusRename + " -> New name: " + arq);


        //Verificando o tipo de arquivo
        File dir = new File("C:\\TutorialArquivos");

        File dir2 = new File(dir + "\\DiretorioDois");
        dir2.mkdirs();

        File dir3 = new File(dir + "\\DiretorioTres");
        dir3.mkdir();

        File arq3 = new File(dir, "arq_03.txt");
        try {
            arq3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                System.out.println(f + " é um diretório.");
            } else if (f.isFile()) {
                System.out.println(f.getName() + " é um arquivo.");
            }
        }


        //Deletando dir and arq
        System.out.println(dir2.delete());
        System.out.println(dir3.delete());


    }
}
