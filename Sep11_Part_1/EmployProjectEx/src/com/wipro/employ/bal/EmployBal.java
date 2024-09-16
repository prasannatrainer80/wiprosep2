package com.wipro.employ.bal;

import java.io.IOException;
import java.util.List;

import com.wipro.employ.dao.EmployDaoImpl;
import com.wipro.employ.exception.EmployException;
import com.wipro.employ.model.Employ;

public class EmployBal {

	static StringBuilder sb = new StringBuilder();
	static EmployDaoImpl impl = new EmployDaoImpl();
	
	public boolean validateEmploy(Employ employ) {
		boolean isValid = true;
		if (employ.getEmpno() <=0) {
			sb.append("Employ No Cannot be Zero Or Negative...\r\n");
			isValid = false;
		}
		if (employ.getName().length() < 5) {
			sb.append("Employ Name Contains min. 5 Characters...\r\n");
			isValid = false;
		}
		
		if (employ.getBasic() < 10000 || employ.getBasic() > 90000) {
			sb.append("Employ Basic Must be between 10000 and 90000");
			isValid = false;
		}
		return isValid;
	}
	
	public String updateEmployBal(Employ employUpdated) throws EmployException {
		if (validateEmploy(employUpdated)) {
			return impl.updateEmployDao(employUpdated);
		}
		throw new EmployException(sb.toString());
	}
	
	public String deleteEmployBal(int empno) {
		return impl.deleteEmployDao(empno);
	}
	public Employ searchEmployBal(int empno) {
		return impl.searchEmployDao(empno);
	}
	public String addEmployBal(Employ employ) throws EmployException {
		if (validateEmploy(employ)==true) {
			return impl.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	public String writeFileBal() throws IOException {
		return impl.writeToFileDao();
	}
	
	public String readFileBal() throws ClassNotFoundException, IOException {
		return impl.readFromFileDao();
	}
	public List<Employ> showEmployBal() {
		return impl.showEmployDao();
	}
}
