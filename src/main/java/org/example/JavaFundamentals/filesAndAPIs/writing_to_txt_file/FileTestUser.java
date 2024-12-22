package org.example.JavaFundamentals.filesAndAPIs.writing_to_txt_file;

import org.example.JavaFundamentals.filesAndAPIs.ModifyingDirectoryAndFiles;

public class FileTestUser {
    public static void main(String[] args) {
        ModifyingDirectoryAndFiles modifyingDirectoryAndFiles = new ModifyingDirectoryAndFiles();
        CrudWritingFile crudWritingFile = new CrudWritingFile();
        User bartSimpson = new User();

        bartSimpson.setId(1);
        bartSimpson.setName("Bart Simpson");
        bartSimpson.setPleaseNote("cartoon character.");


        modifyingDirectoryAndFiles.createDirectory("C:\\","ArquivosTesteJava");


        crudWritingFile.write("C:\\ArquivosTesteJava","nameTestFile", bartSimpson);
        crudWritingFile.read("C:\\ArquivosTesteJava","nameTestFile");


    }
}
