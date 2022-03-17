interface pSquare{
	public boolean square(int number);
}

public class RunnerFile{
	public static void main(String[]args){
		pSquare p = (int number) -> {
			if(Math.sqrt(number) % 1 == 0)
			{
				return true;
			}
			return false;
		};
		System.out.println("Is 49 a perfect square?"+p.square(50));
	}
}