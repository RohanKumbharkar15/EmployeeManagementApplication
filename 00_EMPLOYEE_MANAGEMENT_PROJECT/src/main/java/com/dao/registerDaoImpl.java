package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DbConnection;
import com.model.register;

public class registerDaoImpl implements registerDao {

	@Override
	public int create(List<register> lst) {

		int i = 0;

		DbConnection Db = new DbConnection();
		Connection con = Db.myconnection();
		register robj = lst.get(0);
		lst = null;
		try {
			PreparedStatement pstate = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			pstate.setInt(1, robj.getEmpID());
			pstate.setString(2, robj.getEmpNAME());
			pstate.setString(3, robj.getEmpSALARY());
			pstate.setString(4, robj.getEmpMOBILE());
			pstate.setString(5, robj.getEmpLOC());
			i = pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i > 0) {
			System.out.println("record Save");
		}
		return i;
	}

	@Override
	public List<register> retrive(int empID) {
		List<register> lstrec = null;
		int i = 0;
		ResultSet rs = null;
		DbConnection db = new DbConnection();

		Connection con = db.myconnection();

		try {
			PreparedStatement pstate = con.prepareStatement("select * from employee where empID=?");
			pstate.setInt(1, empID);
			rs = pstate.executeQuery();
			// if
			if (rs.next()) {
				register robj = new register(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				lstrec = new ArrayList<register>();
				lstrec.add(robj);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstrec;
	}

	@Override
	public int delete(List<register> lst) {
		int i = 0;
		DbConnection db = new DbConnection();
		Connection con = db.myconnection();
		register robj = lst.get(0);
		lst = null;
		try {
			PreparedStatement pstate = con.prepareStatement("delete from employee where empID=?");
			pstate.setInt(1, robj.getEmpID());

			i = pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i > 0) {
			System.out.println("record Save");
		}
		return i;

	}

	@Override
	public int update(List<register> lst) {
		int i = 0;
		DbConnection db = new DbConnection();
		Connection con = db.myconnection();
		register robj = lst.get(0);

		try {
			PreparedStatement pstate = con
					.prepareStatement("update employee set empNAME=?,empSALARY=?,empMOBILE=?,empLOC=? where empID=?");
			pstate.setString(1, robj.getEmpNAME());
			pstate.setString(2, robj.getEmpSALARY());
			pstate.setString(3, robj.getEmpMOBILE());
			pstate.setString(4, robj.getEmpLOC());
			pstate.setInt(5, robj.getEmpID());
			i = pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	@Override
	public List<register> displayAll() {
		String str = "select * from employee";
		DbConnection db = new DbConnection();

		Connection con = db.myconnection();
		List<register> lstreg = new ArrayList<register>();
		try {
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(str);
			while (rs.next()) {
				register robj = new register(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				lstreg.add(robj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstreg;
	}

}
