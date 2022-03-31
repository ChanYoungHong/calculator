
abstract class Binder{
	
	abstract int calc(int init, int start, int step, int end, BinaryOp binder);

}

class Calculator extends Binder {
	
	@Override
	 int calc(int init, int start, int step, int end, BinaryOp binder) {

		if(init == 0) {
			for(int i= start; i<=end; i++) {
				init += i;
			}
		}else {
			for(int i= start; i<=end; i++) {
				init *= i;
			}
		}
		return init;
	}
}

class BinaryOp {
}

class Multiflier extends BinaryOp{
}

class Adder extends BinaryOp{
}

public class FirstQuestion {

	public static void main(String[] args) {
		
		BinaryOp adder = new Adder(); 
		BinaryOp mult = new Multiflier(); 
		Binder calc = new Calculator();
		
		int addResult = calc.calc(0, 1, 1, 10, adder); 
		int mulResult = calc.calc(1, 1, 1, 10, mult);
		
		System.out.println(addResult);
		System.out.println(mulResult);

	}
}
    
