package src.com.app.file;

import java.io.*;

import com.app.POJO.studentPOJO;

public class WriteFileClass {
	
	private String path;
	private boolean append_to_file = false;
	
	public WriteFileClass() {
		// TODO Auto-generated constructor stub
	}
	public WriteFileClass(String file_path) {
		// TODO Auto-generated constructor stub
		this.path = file_path;
	}
	
	public WriteFileClass(String file_path,boolean append_value) {
		// TODO Auto-generated constructor stub
		this.path = file_path;
		this.append_to_file = append_value;
	}
	
	public void writeToFile(studentPOJO stud) throws IOException
	{
		FileWriter write = new FileWriter(path,append_to_file);
		PrintWriter print_line = new PrintWriter(write);
		
		print_line.printf("%s"+"%n", stud);
		print_line.close();
	}
	
}
