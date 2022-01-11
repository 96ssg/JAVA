package Example;

public class TV {
	//메소드
	String company = "LG";
	String years = "2017";
	String size = "32";
	void showInfo() {
		 System.out.println(company+" 에서 만든 " + years+"년형 "+size+" 인치 TV");
	}
	//생성자
    TV(){}
    TV(String company){
    	this.company = company;
    }
    TV(String company, String years){
    	this.company = company;
    	this.years = years;
    }
    TV(String company, String years, String size){
    	this.company = company;
    	this.years = years;
    	this.size = size;
    }
 
}
