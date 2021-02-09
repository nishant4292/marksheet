package com.rays.jdbc;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		MarksheetBean bean = new MarksheetBean();
		// bean.setRollno(102);
		// bean.setId(11);
		// bean.setRollno(104);
		// setFname("akshay");
		// bean.setLname("yadav");
		// bean.setPhy(86);
		// bean.setChm(95);
		// bean.setMath(78);
		MarksheetModel m = new MarksheetModel();
		// m.add(bean);
		// m.update(bean);
		// m.delete(bean);
		// m.select(bean);
		// m.search(bean);
		 m.meritlist(bean);
	}

}
