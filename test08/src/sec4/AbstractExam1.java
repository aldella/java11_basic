package sec4;

public class AbstractExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		User u1 = new User();
		User u1 = new Member();
		u1.setIp("192.168.1.152");
		u1.setPort(80);
//		u1.setId("asdlkfadfasd");
//		u1.setPw("123321");
		u1.connect();
		
		u1 = new Staff();
		u1.connect();
		
		Member u2 = new Member();
		u2.setIp("192.168.0.121");
		u2.setPort(80);
		u2.setId("asdlkfadfasd");
		u2.setPw("123321");
		u2.connect();
		
		Staff u3 = new Staff();
		u3.setIp("192.168.0.164");
		u3.setPort(80);
		u3.setLevel(2);
		u3.setPart("기술부");
		u3.setName("최태영");
		u3.connect();
	}

}