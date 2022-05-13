package filo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

public class update{
	Long acc;
	String name;
	Long bal;
	String nameNumberString;
	Long newacc;
	String newname;
	Long newbal;
	int index;
	public update(long acc,String name,long bal){
		this.acc = acc;
		this.name = name;
		this.bal = bal;
	}
	public void printi(){
		System.out.print(acc+" "+name+" "+bal);
	}
	public void updati(){
	try{
		File file = new File("/home/sakthi/hacking/ZOHO/Week1-rev/file-handling-project/fili/account.txt");
			if(!file.exists()){
				file.createNewFile();
			}
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		boolean found = false;
		while(raf.getFilePointer()<raf.length()){
			nameNumberString = raf.readLine();
			String[] lineSplit = nameNumberString.split(",");
			newacc = Long.parseLong(lineSplit[0]);
			newname = lineSplit[1];
			newbal = Long.parseLong(lineSplit[2]);
			if(acc.equals(newacc)){
				found = true;
				break;
			}
		}
		if(found==true){ 
			File tmpFile = new File("temp.txt");
			RandomAccessFile tmpraf = new RandomAccessFile(tmpFile,"rw");
			raf.seek(0);
			while(raf.getFilePointer()<raf.length()){
				nameNumberString = raf.readLine();
				index = nameNumberString.indexOf(",");
				acc = Long.parseLong(nameNumberString.substring(0,index));

				if(newacc.equals(acc)){
					nameNumberString = String.valueOf(acc)+","+name+","+String.valueOf((bal+newbal));
				}
				tmpraf.writeBytes(nameNumberString);
				tmpraf.writeBytes(System.lineSeparator());
				raf.seek(0);
				tmpraf.seek(0);
				while (tmpraf.getFilePointer() < tmpraf.length())
				 {
					raf.writeBytes(tmpraf.readLine());
					raf.writeBytes(System.lineSeparator());
				}

			}
				raf.setLength(tmpraf.length());

				tmpraf.close();
				raf.close();

				// Deleting the temporary file
				tmpFile.delete();
				System.out.println(" Balance updated. ");
		}else{
			raf.close();
			System.out.println("acc number is does not exist!");
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