package prtc5;

public class MainEx {

	
		// TODO Auto-generated method stub
		
			public static void dbWork(DataAccessObject dao) {
    			dao.select();
    			dao.insert();
    			dao.update();
    			dao.delete();
		}
			public static void main(String[] args) {
    			dbWork(new OracleDao());
    			dbWork(new MySqlDao());
    			MyAdder adder = new MyAdder();
    			System.out.println(adder.add(5,10));
    			System.out.println(adder.add(10));
			}
			

}
