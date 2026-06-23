import java.util.Scanner;
public class ownException2{
	public static void main (String[]args) throws WrongVowelLetterException{
		String k=" ";
		System.out.println("Enter the vowel letter : ");
		try{
			k=readLetter();
		}catch(WrongVowelLetterException e){
			System.out.println("ERROR!:"+e.toString());
		}
		System.out.println("Letter is " +k);
	}
	public static String readLetter() throws WrongVowelLetterException{	
		Scanner sc=new Scanner(System.in);
		String l=sc.next();
		if(!l.equals("a")&&!l.equals("e")&&!l.equals("i")&&!l.equals("o")&&!l.equals("u")){
			throw new WrongVowelLetterException(l);
		}
		return l;
	}
}
class WrongVowelLetterException extends Exception{
	public String k;
	public WrongVowelLetterException(String k){
		this.k=k;
	}
	public String toString(){
	return"\nyou enterd a wrong letter,please enter vowel letter.";
	}
}
