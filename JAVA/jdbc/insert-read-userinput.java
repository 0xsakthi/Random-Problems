import java.sql.*;
interface cred{
	String url = "jdbc:mysql://localhost/python";
	String name = "root";
	String pass = "root";
}
class auth implements cred{  
	public static void insert_data(Connection con,String roll_num,String name,String mark) throws Exception{
		String query = "insert into school values(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1,roll_num);
		pstmt.setString(2,name);
		pstmt.setString(3,mark);
		pstmt.executeUpdate();
	}
	public static void get_data(Connection con,String col) throws Exception{
		String query = "select * from school";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()){
			System.out.println(rs.getString(col));
		}

	}
	public static void main(String args[]) throws Exception{
	Connection con = DriverManager.getConnection(url,name,pass);
	}

} 
