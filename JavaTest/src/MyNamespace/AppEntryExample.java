package MyNamespace; 

import java.io.*;

public class AppEntryExample{
    
    public static void main(String[] args) throws Exception {
        // create parser object
        TxtToRtfParser testobj = new TxtToRtfParser();

        // determine environment / os variables
        testobj.Init(args);



    }
}