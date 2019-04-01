package TxtToRtf;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

public class TxtToRtf {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\Administrator\\Desktop\\convertFile");

        String source = dir.getCanonicalPath() + File.separator + "newFile.txt";
        String dest = dir.getCanonicalPath() + File.separator + "Dest.rtf";

        File fin = new File(source);
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));

        FileWriter fstream = new FileWriter(dest, true);
        BufferedWriter out = new BufferedWriter(fstream);

        String aLine = null;
        while ((aLine = in.readLine()) != null) {
          //   Process each line and add output to Dest.rtf file
            out.write(aLine);
            out.newLine();
        }

         // do not forget to close the buffer reader
        in.close();

         // close buffer writer
        out.close();
    }
}