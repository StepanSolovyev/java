package MyNamespace; 
import java.sql.Date;

class Record{
    //basic
Date PeriodStart;
Date PeriodEnd;
String FirstName, LastName, SurName;
String Faculty, Department, Specialty, Group;
String Location;
String Chief, ResponsiblePerson;
Date SignDate;

//table data
RecordTable tabledata;
public void WriteToRTF(Record[] list,String PathToFile) throws Exception{
    for (Record rec : list) {
        
        // create new print form to fill
        PrintForm form = new PrintForm();
        for(String str : form.DefaultPrintForm){
            if(str.contains("x1x")){
                str.replace("x1x", "\\'3f }{\\cf1\\ul\\ulc0\\b0\\rtlch \\ltrch\\loch\\fs24\\loch\\f7\\hich\\af7 \n\r"+rec.PeriodStart.toString()+"}");
            }
            if(str.contains("x2x")){
                str.replace("x2x", "\\'3f }{\\cf1\\ul\\ulc0\\b0\\rtlch \\ltrch\\loch\\fs24\\loch\\f7\\hich\\af7 \n\r"+rec.PeriodEnd.toString()+"}");
            }
            if(str.contains("x3x")){
                str.replace("x3x", "\\'3f }{\\cf1\\ul\\ulc0\\b0\\rtlch \\ltrch\\loch\\fs24\\loch\\f7\\hich\\af7 \n\r"+(rec.LastName+" "+rec.FirstName+" "+rec.SurName)+"}");
            }
            if(str.contains("x4x")){
                str.replace("x4x", "\\'3f }{\\cf1\\ul\\ulc0\\b0\\rtlch \\ltrch\\loch\\fs24\\loch\\f7\\hich\\af7 \n\r"+rec.Department+"}");
            }
            if(str.contains("x5x")){
                str.replace("x5x", "\\'3f }{\\cf1\\ul\\ulc0\\b0\\rtlch \\ltrch\\loch\\fs24\\loch\\f7\\hich\\af7 \n\r"+rec.Group+"}");
            }
            if(str.contains("x6x")){
                str.replace("x6x", "\\'3f }{\\cf1\\ul\\ulc0\\b0\\rtlch \\ltrch\\loch\\fs24\\loch\\f7\\hich\\af7 \n\r"+rec.Specialty+"}");
            }
            if(str.contains("x7x")){
                str.replace("x7x", "\\'3f }{\\cf1\\ul\\ulc0\\b0\\rtlch \\ltrch\\loch\\fs24\\loch\\f7\\hich\\af7 \n\r"+rec.Location+"}");
            }
            if(str.contains("x8x")){
                str.replace("x8x", "\\'3f }{\\cf1\\ul\\ulc0\\b0\\rtlch \\ltrch\\loch\\fs24\\loch\\f7\\hich\\af7 \n\r"+rec.Chief+"}");
            }
            if(str.contains("x9x")){
                str.replace("x9x", "\\'3f }{\\cf1\\ul\\ulc0\\b0\\rtlch \\ltrch\\loch\\fs24\\loch\\f7\\hich\\af7 \n\r"+rec.ResponsiblePerson+"}");
            }

            form.Write(PathToFile);
        }
    
    
        
    }
    
        }

}