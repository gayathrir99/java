import java.io.*;
public class displayfile
{
	public static void main(String args[])throws IOException,FileNotFoundException
	{
		int i;
		File f1=new File("d:\\java\\files\\display.txt");
		FileInputStream in=new FileInputStream(f1);
		do
		{
			i=in.read();
			if(i!=-1)
			{
				System.out.print((char)i);
			}
		}
		while(i!=-1);
		in.close();
	}
}