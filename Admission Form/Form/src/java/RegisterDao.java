
import java.beans.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterDao {
    
    public void loadDriver(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public Connection getConnection(){
        Connection conn = null;
        try{
            conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhay","root","");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return conn;
    }
    
    public String insert(Member member)
    {
        
            loadDriver();
            Connection conn = getConnection();
            String result = "Data entered successfully";
           
            String sql = "insert into member values(?,?,?,?)";
            PreparedStatement ps;
        try {    
            ps = conn.prepareStatement(sql);
            ps.setString(1, member.getName());
            ps.setString(2, member.getPswd());
            ps.setString(3, member.getEmail());
            ps.setString(4, member.getPhone());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDao.class.getName()).log(Level.SEVERE, null, ex);
            result = "Data not enterd"+ex;
        }
    return result;
    }
    
    
}
