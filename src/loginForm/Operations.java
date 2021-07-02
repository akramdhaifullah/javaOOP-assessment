/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginForm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mySQLConnection.MySQLConnection;
import sessionAttributes.Student;

/**
 *
 * @author Akram Dhaifullah
 */
public class Operations {

    public static boolean isAdminLogin(String username, String password, JFrame frame) {
        try {
            Connection myConn = MySQLConnection.getConnection();
            String mySqlQuery
                    = "SELECT * FROM admin WHERE USERNAME = '"
                    + username
                    + "' AND PASSWORD = '"
                    + password
                    + "'";
            PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: " + e.getMessage());
        }

        return false;
    }

    public static boolean isStudentLogin(String username, String password, JFrame frame) {
        try {
            Connection myConn = MySQLConnection.getConnection();
            String mySqlQuery
                    = "SELECT * FROM mahasiswa WHERE EMAIL = '"
                    + username
                    + "' AND NIM = '"
                    + password
                    + "'";
            PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Student.setNIM(resultSet.getString("NIM"));
                Student.setName(resultSet.getString("NAMA"));
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: " + e.getMessage());
        }

        return false;
    }

    public static boolean isLectureLogin(String username, String password, JFrame frame) {
        try {
            Connection myConn = MySQLConnection.getConnection();
            String mySqlQuery
                    = "SELECT * FROM dosen WHERE USERNAME = '"
                    + username
                    + "' AND PASSWORD = '"
                    + password
                    + "'";
            PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: " + e.getMessage());
        }

        return false;
    }
}
