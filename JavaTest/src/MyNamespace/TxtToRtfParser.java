package MyNamespace;

import java.io.*;

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

    // if input file txt formatted
    private void ParseTXTFile(String Filepath)         throws Exception {}

    // if input file word formatted
    private void ParseWordFile(String Filepath)        throws Exception {}

    // if input data from console
    private void ParseConsoleInput(String []args)    throws Exception {}
    
    // write result to file
    private void WriteResult(Record []records)    throws Exception {}
    
    
    // get and set environment vars; validate application args
    public void Init(String[] args)throws Exception {
        _envosarch = System.getProperty("os.arch");
        _envosname = System.getProperty("os.name");
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

    } else{
        
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