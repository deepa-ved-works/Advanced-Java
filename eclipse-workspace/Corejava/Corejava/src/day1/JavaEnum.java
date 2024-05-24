package day1;

class FreshJuice {
	//enum used to select option
	enum FreshJuiceSize { SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}

public class JavaEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size : "+juice.size);			
	}

}
