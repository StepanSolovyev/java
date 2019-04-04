package MyNamespace;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.FilerException;

public class TxtToRtfParser {
    // environment data
    private String 
        _envosarch,
        _envosname,
        _envosversion,

        _envosuserdir,
        _envosusername,
        _envosuserhome,

        _envospseparator,
        _envosfseparator,
        _envoslserparator,

        _envosjversion;

    // input data types;
    private Boolean 
    _isRTFInput     = false,
    _isTXTInput     = false, 
    _isConsoleInput = false;
    
    // maximum args value during console input
    int _ConsoleInputArgsMAX = 5;

    Record[] ParsedRecords;

    // if input file txt formatted
    private Record[] ParseTXTFile(String Filepath)         throws Exception {
        
        // file read preparation        
        File file = new File(Filepath); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        // 
        String st, FullFileAsString = ""; 
        while ((st = br.readLine()) != null) {
        FullFileAsString += (st+_envoslserparator);
        } 
        
        String[] FileRecord = FullFileAsString.split(_envoslserparator);
        int arraylength = FileRecord.length;
        
        // both arrays have same length
        Record[]  arraytoreturn = new Record[arraylength];
        for(int i = 0; i < arraytoreturn.length ; i++)
{
    arraytoreturn[i] = new Record();
}
        
        // parse strings one by one 
        // also define file struct
        for(int currentindex = 0;currentindex <arraylength;currentindex++){
            arraytoreturn[currentindex].PeriodStart         = FileRecord[currentindex].split(" ")[0];
            arraytoreturn[currentindex].PeriodEnd           = FileRecord[currentindex].split(" ")[1];
            
            arraytoreturn[currentindex].FirstName           = FileRecord[currentindex].split(" ")[2];
            arraytoreturn[currentindex].LastName            = FileRecord[currentindex].split(" ")[3];
            arraytoreturn[currentindex].SurName             = FileRecord[currentindex].split(" ")[4];
            
            arraytoreturn[currentindex].Department          = FileRecord[currentindex].split(" ")[5];
            arraytoreturn[currentindex].Group               = FileRecord[currentindex].split(" ")[6];

            arraytoreturn[currentindex].Specialty           = FileRecord[currentindex].split(" ")[7];
            
            arraytoreturn[currentindex].Location            = FileRecord[currentindex].split(" ")[8];

            arraytoreturn[currentindex].OrganizationResponsiblePerson = FileRecord[currentindex].split(" ")[9];
            arraytoreturn[currentindex].UniversityResponsiblePerson   = FileRecord[currentindex].split(" ")[10];
            arraytoreturn[currentindex].SignDate            = FileRecord[currentindex].split(" ")[11];
        }


        return arraytoreturn;
}

    // if input file word formatted
    private void ParseWordFile(String Filepath)        throws Exception {}

    // if input data from console
    private void ParseConsoleInput(String []args)    throws Exception {}
    
    // write result to file
    private void WriteResult(Record []records)    throws Exception {}
    
    
    // get and set environment vars; validate application args
    public void Init(String[] args)throws Exception {
        _envosarch = System.getProperty("os.arch");
        _envosname = System.getProperty("os.name").toLowerCase();
        _envosversion = System.getProperty("os.version");

        _envospseparator = System.getProperty("path.separator");
        _envosfseparator = System.getProperty("file.separator");
        _envoslserparator = System.getProperty("line.separator");

        _envosjversion = System.getProperty("java.runtime.version");

        _envosuserhome = System.getProperty("user.home");
        _envosuserdir   = System.getProperty("user.dir");
        _envosusername  = System.getProperty("user.name");

        // args validation step 1: determine input data type rtf/txt/console
    if (args.length > 1 && args.length < _ConsoleInputArgsMAX) {
        _isConsoleInput = true; return;

    }

        
        {
        if (args[0].split("\\.")[1].equals("rtf")){
            _isRTFInput = true;
        }
        if (args[0].split("\\.")[1].equals("txt")){
            _isTXTInput = true;
        }}
        
        // if validation failed - throw exception
        if (!(_isRTFInput || _isConsoleInput || _isTXTInput)){
        throw new IllegalArgumentException("incoming arguments validation failed");}
    
        // args validation step 2: validate args data by type

        // txt - check if file exists and parsable
        if(_isTXTInput){
            // test path
            File tmpDir = new File(args[0]);
            boolean exists = (tmpDir.exists() && !tmpDir.isDirectory());
            
            // run parser
            this.ParsedRecords =  this.ParseTXTFile(args[0]);
            // run writer
        }

        // rtf - check if file exists and parsable
        if(_isRTFInput){
            // test path

            // run parser

            // run writer

        }
        
        // console - check if args count and format valid
        if(_isConsoleInput){
            // run parser

            // run writer
        }


        return;
    }
    


}
