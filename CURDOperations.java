//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.PreparedStatement;
//
//public class CURDOperations extends EmployeeDetails{
//	
//	EmployeeDetails employeeDetails= new EmployeeDetails();
//	
//	protected int insertEmployeeDetails() throws ClassNotFoundException, SQLException {
//		int status= 0;
//		
//		Connection connection=DatabaseConnection.databaseConnectionStatus();
//		String query="insert into Employees values(?,?,?,?,?,?) ";
//		PreparedStatement  preparedStatement = connection.prepareStatement(query);
//		preparedStatement.setString(1,employeeDetails.EmployeeName);
//		preparedStatement.setString(2,employeeDetails.DateofBirth);
//		preparedStatement.setString(3,employeeDetails.EmployeeId);
//		preparedStatement.setString(4,employeeDetails.DateofJoin);
//		preparedStatement.setString(5,employeeDetails.MobileNo);
//		preparedStatement.setString(6,employeeDetails.Email);
//		
//		status=preparedStatement.executeUpdate();
//		connection.close();
//		return status;
//	}
//
//
//	
//}
