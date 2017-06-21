/* display a text file

to use this program, spceify the nae
of the file that oyu want to see.
for example, to see a file called TEST.TXT,
use the following command line.

java showfile test.txt
*/

import java.io.*;



class ShowFile {public static void main(String args[]) {
	int i;
	FileInputStream fin;
	//String example = "TEST.txt";
	
	//first make sure that a file has been specified.
	if(args.length !=1) {
		System.out.println("Usage: ShowFile File");
		return;
	}
	
	try {
		fin = new FileInputStream(args[0]);
	} catch(FileNotFoundException exc) {
		System.out.println("File Not Found");
		return;
	}
	
	try {
		//read bytes until EOF is encountered
		do {
			i = fin.read();
			if(i != -1) System.out.print((char) i );
		} while (i != -1);
	}catch(IOException exc) {
		System.out.println("ERROR reading file.");
		}
		
		try {
			fin.close();
		} catch(IOException exc) {
			System.out.println("Error closing file.");
		}
	}
}