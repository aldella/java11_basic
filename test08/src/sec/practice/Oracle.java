package sec.practice;

public class Oracle implements Database{
	private String url;
	private String port;
	private String id;
	private String pw;
//	Connection;
//	PreparedStatement;
//	ResultSet;
	private String tbname;
	private String condition;
	private int field1;
	private int value1;
	
	@Override
	public void connect(String url, String port, String id, String pw) {
		// TODO Auto-generated method stub
		System.out.println(url+":"+port+"/"+id+";"+pw);
	}

	@Override
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs!=null) {
			System.out.println("결과셋(저장소) 닫기");
		}
		if(pstmt!=null) {
			System.out.println("데이터베이스 비활성화");
		}
		if(conn!=null) {
			System.out.println("데이터베이스 연결 종료");
		}
	}

	@Override
	public void select(String tbname, String condition) {
		// TODO Auto-generated method stub
		System.out.println("select * from " + tbname + " " + condition);
	}

	@Override
	public void insert(String tbname, String field1, int field2) {
		// TODO Auto-generated method stub
		System.out.println("insert into " + tbname + " values (" + field2 + ", "+ field1 + ")");
	}

	@Override
	public void update(String tbname, String field1, int value1, String condition) {
		// TODO Auto-generated method stub
		System.out.println("update " + tbname + " set " + field1 + "=" + value1 +" " + condition);
	}

	@Override
	public void delete(String tbname, String condition) {
		// TODO Auto-generated method stub
		System.out.println("delete from " + tbname + " " + condition);
	}
	
	
	
	//////////////////getter setter/////////////////////////////
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTbname() {
		return tbname;
	}

	public void setTbname(String tbname) {
		this.tbname = tbname;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	
	
}
