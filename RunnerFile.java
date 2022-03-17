interface QuotientCalculations{
	public float quotientCalc(float f1, float f2);
}
public class RunnerFile{
	public static void main(String[]args){
		QuotientCalculations q = (float f1, float f2) -> {
			return f1/f2;
		};
		System.out.printf("Quotient: %.3f", q.quotientCalc(10.0f,3.0f));
		System.out.println();
	}
}