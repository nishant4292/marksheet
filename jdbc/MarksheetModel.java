package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class MarksheetModel {
	public void meritlist(MarksheetBean bean) throws Exception {
		ResourceBundle re = ResourceBundle.getBundle("com.rays.jdbc.app");
		Class.forName(re.getString("driver"));
		Connection co = DriverManager.getConnection(re.getString("url"), re.getString("user"), re.getString("pass"));
		co.setAutoCommit(false);
        PreparedStatement p = co.prepareStatement(
				"select * ,(phy + chm + math) as total,(((phy + chm +math)/300)*100) as percentage from marksheet where ((phy +chm +math)/300 *100)>=40 order by percentage desc limit 0,3");
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t " + rs.getInt(2) + " \t " + rs.getString(3) + "\t " + rs.getString(4)
					+ "\t " + rs.getInt(5) + "\t  " + rs.getInt(6) + "\t  " + rs.getInt(7) + "\t " + rs.getInt(8)
					+ " \t" + rs.getInt(9));

		}
		co.commit();
		p.close();
		co.close();

	}

	public void search(MarksheetBean bean) throws Exception {
		ResourceBundle re = ResourceBundle.getBundle("com.rays.jdbc.app");
		Class.forName(re.getString("driver"));
		Connection co = DriverManager.getConnection(re.getString("url"), re.getString("user"), re.getString("pass")); // co.setAutoCommit(false);

		PreparedStatement p = co.prepareStatement("select * from marksheet where rollno =? ");
		p.setInt(1, bean.getRollno());
		ResultSet rs = p.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getInt(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " "
					+ rs.getInt(5) + "  " + rs.getInt(6) + "  " + rs.getInt(7));

		}
		// co.commit();
		p.close();
		co.close();

	}

	public void select(MarksheetBean bean) throws Exception {
		ResourceBundle re = ResourceBundle.getBundle("com.rays.jdbc.app");
		Class.forName(re.getString("driver"));
		Connection co = DriverManager.getConnection(re.getString("url"), re.getString("user"), re.getString("pass"));

		PreparedStatement p = co.prepareStatement("select * from marksheet ");

		ResultSet rs = p.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getInt(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " "
					+ rs.getInt(5) + "  " + rs.getInt(6) + "  " + rs.getInt(7));

		}
		p.close();
		co.close();
	}

	public void delete(MarksheetBean bean) throws Exception {
		ResourceBundle re = ResourceBundle.getBundle("com.rays.jdbc.app");
		Class.forName(re.getString("driver"));
		Connection co = DriverManager.getConnection(re.getString("url"), re.getString("user"), re.getString("pass"));
		co.setAutoCommit(false);
		PreparedStatement p = co.prepareStatement("delete from marksheet where id = ?");
		p.setInt(1, bean.getId());
		p.executeUpdate();
		co.commit();
		System.out.println("deleted");
		p.close();
		co.close();

	}

	public void update(MarksheetBean bean) throws Exception {
		ResourceBundle re = ResourceBundle.getBundle("com.rays.jdbc.app");
		Class.forName(re.getString("driver"));
		Connection co = DriverManager.getConnection(re.getString("url"), re.getString("user"), re.getString("pass"));
		co.setAutoCommit(false);
		PreparedStatement p = co.prepareStatement("update  marksheet set fname=?,lname=? where id=?");
		p.setInt(3, bean.getId());
		// p.setInt(2, bean.getRollno());
		p.setString(1, bean.getFname());
		p.setString(2, bean.getLname());
		// p.setInt(4, bean.getPhy());
		// p.setInt(6, bean.getChm());
		// p.setInt(7, bean.getMath());
		p.executeUpdate();
		co.commit();
		System.out.println("updated");
		p.close();
		co.close();

	}

	public void add(MarksheetBean bean) throws Exception {
		ResourceBundle re = ResourceBundle.getBundle("com.rays.jdbc.app");
		Class.forName(re.getString("driver"));
		Connection co = DriverManager.getConnection(re.getString("url"), re.getString("user"), re.getString("pass"));
		co.setAutoCommit(false);
		PreparedStatement p = co.prepareStatement("insert into marksheet values (?,?,?,?,?,?,?)");
		p.setInt(1, bean.getId());
		p.setInt(2, bean.getRollno());
		p.setString(3, bean.getFname());
		p.setString(4, bean.getLname());
		p.setInt(5, bean.getPhy());
		p.setInt(6, bean.getChm());
		p.setInt(7, bean.getMath());
		p.executeUpdate();

		co.commit();
		System.out.println("inserted");
		p.close();
		co.close();

	}

}
