package filo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

public class read{
	public void run(int checkacc){
		try{
			String nameNumberString;
			Long newacc;
			String newname;
			Long newbal;
			int index;

			File file = new File("/home/sakthi/hacking/ZOHO/Week1-rev/file-handling-project/fili/account.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			RandomAccessFile raf = new RandomAccessFile(file,"rw");
			boolean found = false;
			while(raf.getFilePointer() < raf.length()){
				nameNumberString = raf.readLine();
				String[] lineSplit = nameNumberString.split(",");
				newacc = Long.parseLong(lineSplit[0]);
				newname = lineSplit[1];
				newbal = Long.parseLong(lineSplit[2]);
				System.out.println(
					"name: " + newname + "\n"
					+ "Acc num: " + newacc + "\n"+"Balance: "+newbal);
			}
			}
			catch (IOException ioe)
			{

				System.out.println(ioe);
			}
			catch (NumberFormatException nef)
			{

				System.out.println(nef);
			}
		}
	}