public class Stringclass {
    public static void main(String[] args) {
      StringBuilder sb= new StringBuilder("Good");
      //print data at particular index
      System.out.println(sb.charAt(0));
      //change  the char value in the string
      sb.setCharAt(0, 'F');
      System.out.println(sb);

      // insert the caracter at particuler index 
      sb.insert(4, 'y');
      System.out.println(sb);
    // printing the length of the string 
    System.out.println(sb.length());
    // deleting the character from the string
    sb.delete(4, 5);
    System.out.println(sb);
    // deleting the multiple characters
    sb.delete(1, 3);
    System.out.println(sb);
   //creating another string builder
   StringBuilder sb1= new StringBuilder("library");
   //appending
   sb.append("yy");
   System.out.println(sb1);
   sb.append('3');
   System.out.println(sb1);
   System.out.println("character at index 3 of library is "+sb1.charAt(3));
   //deleting character only
   sb1.deleteCharAt(6);
   System.out.println(sb1);
   // over writing the charatar position
   sb1.setCharAt(0, 'L');
   System.out.println(sb1);
  // reversing the string
  System.out.println(sb);
  sb.reverse();
  System.out.println(sb);
  StringBuilder ob= new StringBuilder();
  System.out.println(ob.isEmpty());
  ob.append("Partigya");
  System.out.println(ob.isEmpty());
  System.out.println(ob.capacity());
  StringBuilder k= new StringBuilder("My Name is Mr. Singhania");
  k.substring(3,23);
  System.out.println(k);
  // searching the characters
  System.out.println(k.indexOf("pragya"));
  // program to reverse a string 
  StringBuilder a=new StringBuilder("babli");
  for(int i=0;i<a.length()/2;i++){
    int front =i;
    int back= a.length()-1-i;
    char frontchar =a.charAt(front);
    char backchar=a.charAt(back);
    a.setCharAt(front,backchar );
    a.setCharAt(back,frontchar);
  }
  System.out.println(a);
    }
}
