package filo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;


public class create{
	Long acc;
	String name;
	Long bal;
	String nameNumberString;
	Long newacc;
	String newname;
	Long newbal;
	int index;
	public create(long acc,String name,long bal){
		this.acc = acc;
		this.name= name;
		this.bal  = bal;
	}
	public void printi(){
		System.out.println(acc+" "+name+" "+bal);
	}
	public void creati(){
	try{
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
				System.out.println(acc+" "+newacc);
				if(acc.equals(newacc)){
					found = true;
					break;
				}
			}
			if(found==false){
				nameNumberString = String.valueOf(acc)+","+name+","+String.valueOf(bal);
				raf.writeBytes(nameNumberString);
				raf.writeBytes(System.lineSeparator());
				System.out.println(" Account Added ");
				raf.close();
			}
			else{
				raf.close();
				System.out.println("Input Account is Already Exist");
			}
		}
		catch (IOException ioe) {

			System.out.println(ioe);
		}
		catch (NumberFormatException nef) {

			System.out.println(nef);
		}
	}

}