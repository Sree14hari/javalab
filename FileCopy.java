import java.io.*;
import java.util.*;
class FileCopy {
public static void main(String[] args) {
try {
File F = new File("newfile.txt");
FileWriter W = new FileWriter("file2.txt");
Scanner scn = new Scanner(F);
while (scn.hasNextLine()) {
String con = scn.nextLine();
W.write(con + "\n");
}
W.close();
scn.close();
System.out.println("Content Copied Successfully");
} 
catch (FileNotFoundException e) {
System.out.println("Source file not found: " + e);
}
catch (IOException e) 
{
System.out.println("An error occurred: " + e);
}
}
}