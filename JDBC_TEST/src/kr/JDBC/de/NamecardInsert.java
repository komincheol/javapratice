package kr.JDBC.de;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NamecardInsert {
	static final String URL = "jdbc:oracle:thin:@70.12.50.50:1521:XE";
	static final String USER = "dream01";
	static final String PASS = "catcher";

	public static void main(String[] args) {
		// JDBC����̹��� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		Statement stmt = null;
		String sql = "INSERT INTO NAMECARD VALUES " + "(SEQ_NAMECARD_NO.NEXTVAL," + "'ȫ�浿'," + "'011-0000-0000',"
				+ "'hongkildong@gmail.org'," + "'Ȱ���')";
		try {
			// Connection �α�
			con = DriverManager.getConnection(URL, USER, PASS);
			// SQL ����
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(sql);
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
