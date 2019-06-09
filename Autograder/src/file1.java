import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file1 {

public static void main(String[] args) throws FileNotFoundException {

final String FILENAME1 = "testfiles/Fibo2.java";
final String FILENAME2 = "testfiles/fibo22.java";

try {

BufferedReader br1 = new BufferedReader(new FileReader(FILENAME1));
BufferedReader br2 = new BufferedReader(new FileReader(FILENAME2));

String line1 = br1.readLine();
String line2 = br2.readLine();

boolean aree = true;

int lineNum = 1;

while(line1!=null || line2!=null)
{
if(!line1.contentEquals(line2))
{
aree = false;
System.out.println("Two files have different content. They differ at line: " + lineNum);
System.out.println("File1 has: " + line1 + " and File2 has : " + line2 +" at line " + lineNum);
}

line1 = br1.readLine();
line2 = br2.readLine();

lineNum++;

}

if(aree)
{
System.out.println("File1 and File2 contents are same.");
}

br1.close();
br2.close();
} catch (IOException e) {

e.printStackTrace();
}

}

}