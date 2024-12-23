package org.example.java_fundamentals.files_and_APIs.writing_to_txt_file;

import org.example.java_fundamentals.files_and_APIs.ModifyingDirectoryAndFiles;

import java.io.*;

public class CrudWritingFile {

    ModifyingDirectoryAndFiles modifyingDirectoryAndFiles = new ModifyingDirectoryAndFiles();

    public void write(String urlDirectoryAndNameFolder, String nameFile, User user) {
        File ls = new File(urlDirectoryAndNameFolder);
        modifyingDirectoryAndFiles.createDirectory("C:\\", "ArquivosTesteJava");
        modifyingDirectoryAndFiles.createFile(urlDirectoryAndNameFolder, nameFile);
        File arqFile = new File(ls, nameFile);


        try {
            //Devemos passar no construtor do FileWriter qual arquivo
            // vamos manipular.
            // Esse construtor aceita dois tipos de parâmetros,
            // File ou String.
            //O parâmetro true indica que reescrevemos no arquivo
            // sem apagar o que já existe.
            // O false apagaria o conteúdo do arquivo e escreveria
            // o novo conteúdo.
            // Se não usar o 2° parâmetro, ele por padrão será false.
            //O mais importante, essa linha abre o fluxo do arquivo
            FileWriter fileWriter = new FileWriter(arqFile, true);

            //Agora vamos usar a classe PrintWriter para escrever
            //fisicamente no arquivo.
            //Precisamos passar o objeto FileReader em seu construtor
            PrintWriter printWriter = new PrintWriter(fileWriter);

            //Agora vamos escrever no arquivo com o método  println(),
            // que nos permite escrever linha a linha no arquivo
            printWriter.println(user.getId());
            printWriter.println(user.getName());
            printWriter.println(user.getPleaseNote());

            printWriter.flush();
            System.out.println("WritingFile");
            printWriter.close();
            System.out.println("Ok");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void read(String urlDirectoryAndNameFolder, String arq) {
        File ls = new File(urlDirectoryAndNameFolder);
        File arqFile = new File(ls, arq);
        try {
            //Indicamos o arquivo que será lido
            FileReader fileReader = new FileReader(arqFile);

            //Criamos o objeto bufferReader que nos
            // oferece o método de leitura readLine()
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //String que irá receber cada linha do arquivo
            String line = "";

            //Fazemos um loop linha a linha no arquivo,
            // enquanto ele seja diferente de null.
            //O método readLine() devolve a linha na
            // posicao do loop para a variavel linha.
            while ((line = bufferedReader.readLine()) != null) {
                //Aqui imprimimos a linha
                System.out.println(line);
            }
            //liberamos o fluxo dos objetos ou fechamos o arquivo
            fileReader.close();
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
