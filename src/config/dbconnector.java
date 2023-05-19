package config;

import java.sql.*;
import javax.swing.JOptionPane;

public class dbconnector {
    
    private Connection connection;
    
    public dbconnector(){
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/restotracker", "root", "");
            }catch(SQLException e){
                System.err.println("Cannot connect to database: " + e.getMessage());
            }
        
    }
    
    public ResultSet getdata(String sql) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        return rst;
    }
    
    public int insertdata(String sql){
        int result;
//    String sql = "INSERT INTO customers (name, email) VALUES ('John Smith', 'john@example.com')";
            try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Inserted Successfully!");
            ps.close();
            result = 1;
            }catch(SQLException e){
                System.out.println("Connection Error: "+e);
                 result = 0;
            }
            return result;
    }
    
    public void deletedata(int id, String table, String table_id) {
       try {
       
        PreparedStatement ps = connection.prepareStatement("DELETE FROM "+table+" WHERE "+table_id+" = ?");
        ps.setInt(1, id);
        int rowsDeleted = ps.executeUpdate();
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Successfully Deleted!");
        } else {
            System.out.println("No rows were deleted.");
        }
        ps.close();
        connection.close();
    } catch (SQLException e) {
        System.out.println("Error deleting data: " + e);
    }
}
    
    public void updatedata(String sql){
       try {
            PreparedStatement ps = connection.prepareStatement(sql);
            int rowsUpdated = ps.executeUpdate();
            if(rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Successfully Updated!");
            }else{
                JOptionPane.showMessageDialog(null, "Successfully Failed!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error" +e);
        }
    }
      
    
}


