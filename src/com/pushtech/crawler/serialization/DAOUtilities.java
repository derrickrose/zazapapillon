package com.pushtech.crawler.serialization;

import java.sql.SQLException;

public class DAOUtilities {

   public static void closeAll(java.sql.ResultSet resultSet, java.sql.PreparedStatement searchStatement, java.sql.Connection connection) {

      if (resultSet != null) try {
         resultSet.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      if (searchStatement != null) try {
         searchStatement.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      if (connection != null) try {
         connection.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      System.out.println("nicely closed");

   }

}
