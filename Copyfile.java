import  java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Copyfile
{
 
 public static void main(String[] args)
 {
  try{
  FileReader fr=new FileReader("D:\\java\\files\\filecopy.txt");
  FileWriter fw=new FileWriter("D:\\java\\files\\filecopy1.txt");
  String str="";
  int i;
  while((i=fr.read())!=-1){
   str+=(char)i;
  }
 
fw.write(str);
fr.close();
fw.close();
System.out.print("Copying Done");

 }
 catch(IOException e){
   System.out.println("Exception");
  }


 }

}