package com.yedam.java.Class;

public class Won2Dollar extends Converter {
	public Converter(double ratio) {
		this.ratio = ratio;
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		
	}
	
}
