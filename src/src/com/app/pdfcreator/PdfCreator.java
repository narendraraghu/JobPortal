package src.com.app.pdfcreator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import com.app.POJO.studentPOJO;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class PdfCreator {
	
public PdfCreator() {
	// TODO Auto-generated constructor stub
}	
    public void create(studentPOJO stud )
	 {
	         try {
	        	     OutputStream file = new FileOutputStream(new File("E:/Test.pdf"));
		               Document document = new Document();
		             PdfWriter.getInstance(document, file);
		               document.open();
		               
		             document.add(new Paragraph(stud.toString()));
		             document.add(new Paragraph(new Date().toString()));
		               document.close();
		             file.close();
	              }
		 catch (Exception e)
		 {
		               e.printStackTrace();
	                   }
                               }

	
}
