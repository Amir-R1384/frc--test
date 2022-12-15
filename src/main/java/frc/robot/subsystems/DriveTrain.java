// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  private Spark rightDriver1 = new Spark(Constants.MOTOR_RIGHT_1_ID);
  private Spark rightDriver2 = new Spark(Constants.MOTOR_RIGHT_2_ID);
  private Spark leftDriver1 = new Spark(Constants.MOTOR_LEFT_1_ID);
  private Spark leftDriver2 = new Spark(Constants.MOTOR_LEFT_2_ID);

  /** Creates a new DriveTrain. */
  public DriveTrain() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setRightMotors(double speed) {
    rightDriver1.set(-speed);
    rightDriver2.set(-speed);
  }

  public void setLeftMotors(double speed) {
    leftDriver1.set(speed);
    leftDriver2.set(speed);
  }
}
