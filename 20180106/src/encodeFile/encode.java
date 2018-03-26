package encodeFile;

import java.io.*;

public class encode {
    public static void main(String[] args) throws Exception {
        File encodingFile = new File("E:/wuyiyong/wu/encodingFile.txt");
        File encodedFile = new File("E:/wuyiyong/wu/encodeFile.txt");
        encodeFile(encodingFile,encodedFile);
    }
    public static void encodeFile(File encodingFile, File encodedFile) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(encodingFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(encodedFile));
        int tmp;
        while((tmp = bufferedReader.read())!=-1){
            if('9' == tmp){ //0
                tmp='0';
            }else if(tmp=='z'){//z
                tmp='a';
            }else if(tmp=='Z'){//Z
                tmp='A';
            }else if(tmp>='0'&&tmp<'9'||tmp>='A'&&tmp<'Z'||tmp>='a'&&tmp<'z'){
                tmp++;
            }
            System.out.print((char)tmp);
            bufferedWriter.write(tmp);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

}