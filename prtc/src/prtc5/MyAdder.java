package prtc5;

public class MyAdder implements AdderInterface {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		
		return x + y;
	}

	@Override
	public int add(int n) {
		int sum = 0;
		for(int i=1; i<46; i++) {
			sum = n + i;
		}
			return sum;
		
	}

}
