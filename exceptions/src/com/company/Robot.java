package com.company;

public class Robot {

  public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
    RobotConnection connection = null;
    for (int i = 1; i <= 3; i++) {
      try {
        connection = robotConnectionManager.getConnection();
        connection.moveRobotTo(toX, toY);
        return;
      } catch(RobotConnectionException e){
        if (i == 3) {
          throw new RobotConnectionException(e.getMessage());
        }
      } finally{
        if (connection != null) {
          try {
            connection.close();
          } catch (RuntimeException e) {
            //
          }
        }
      }
    }
  }
}
