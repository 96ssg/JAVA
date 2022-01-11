package Example;

public class Grade {
//필드
	int math;
	int science;
	int english;

//생성자
	Grade() {
	}

	Grade(int math) {
		this.math = math;
	}

	Grade(int math, int science) {
		this.math = math;
		this.science = science;
	}

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	//메소드
	double average() {
		double avg = 0;
		int sum = math + science + english;
		avg = sum / 3.0;
		return avg;
	}
}
