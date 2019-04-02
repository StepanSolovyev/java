package MyNamespace; 
import java.sql.Date;

class Record{
    //basic
Date PeriodStart;
Date PeriodEnd;
String FirstName, LastName, SurName;
String Faculty, Department, Specialty;
String Location;
String Chief, ResponsiblePerson;
Date SignDate;

//table data
RecordTable tabledata;

public void WriteToRTF(Record[] list, String PathToFile) throws Exception{
    for (Record rec : list) {
        
        // create new print form to fill
        PrintForm form = new PrintForm();
        
    
    
        
    }
    
        }
}