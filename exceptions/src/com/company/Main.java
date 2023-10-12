package com.company;

public class Main {

  public static void main(String[] args) {
    Robot.moveRobot(new RobotConnectionManager() {
      @Override
      public RobotConnection getConnection() {
        return new RobotConnection() {
          @Override
          public void moveRobotTo(int x, int y) {

          }

          @Override
          public void close() {

          }
        };
      }
    }, 10, 20);
  }
}
