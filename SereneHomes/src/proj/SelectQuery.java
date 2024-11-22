package proj;
import java.sql.*;
import javax.swing.JOptionPane;

public class SelectQuery 
{
	public static ResultSet getData(String q) 
	{
		Connection sqlcon = null;
		ResultSet rs = null;
		Statement st = null;
		
		try 
		{
			sqlcon = ConnectionProvider.getConnection();
			st = sqlcon.createStatement();
			rs = st.executeQuery(q);
			
			return rs;
		}
		catch(Exception ex) 
		{
			JOptionPane.showMessageDialog(null, ex);
			return null;
		}
	}
	
}
