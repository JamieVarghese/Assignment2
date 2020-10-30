/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonadventuregui;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jamie
 */
public final class DBManager 
{
    Connection conn;
    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";
    private static final String URL = "jdbc:derby:ScoreBoard;create = true";
    
    public void establishConnection()
    {
        try
        {
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            String sucess = "Connected";
        }
        
        catch(SQLException ex)
        {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void createTable()
    {
        try
        {
            Statement statement = conn.createStatement();
            this.checkExistedTable("ScoreBoard"); 
            statement.addBatch("CREATE TABLE SCOREBOARD(MONSTERS_SLAIN INT)");
            statement.addBatch("INSERT INTO SCOREBOARD VALUES");
            statement.executeBatch();
            
        }
        
        catch(SQLException ex)
        {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void updateValues(int x)
    {
        try
        {
            PreparedStatement pstmt = conn.prepareStatement(" UPDATE SCOREBOARD SET MONSTERS_SLAIN= ? ");
            pstmt.setInt(1, x);
            pstmt.executeUpdate();
        }
        
        catch(SQLException ex)
        {
            System.err.println("SQLException: " + ex.getMessage());
        }       
    }
    
    public int getQuery()
    {
        int monsterSlain = 0;
        ResultSet rs = null;
        try
        {
            Statement statement = conn.createStatement();
            rs = statement.executeQuery("SELECT MONSTERS_SLAIN");
            
            while(rs.next())
            {
                monsterSlain = rs.getInt("A1");
            }
        }
        catch(SQLException ex)
        {
            System.err.println("SQLException: " + ex.getMessage());
        }
                        
        return monsterSlain;
    }
    
    public void checkExistedTable(String name)
    {
        try
        {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, null, types);
            Statement statement = this.conn.createStatement();
            while (rs.next()) 
            {
                String table_name = rs.getString("TABLE_NAME");
                System.out.println(table_name);
                if (table_name.equalsIgnoreCase(name)) 
                {
                    statement.executeUpdate("Drop table " + name);
                    System.out.println("Table " + name + " has been deleted.");
                    break;
                }
            }
            rs.close();
            statement.close();
        }
        catch (SQLException ex) 
        {
            System.err.println("SQLException: " + ex.getMessage());
        }
        }        
}
