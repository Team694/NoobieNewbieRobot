/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team694.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Winch Constants

	public static final int WINCHMOTOR = -1;
	
	//Drivetrain Constants
	public static final int DRIVETRAIN_LEFT_TOP_MOTOR = -1;
	public static final int DRIVETRAIN_LEFT_BOTTOM_MOTOR = -1;
	public static final int DRIVETRAIN_RIGHT_TOP_MOTOR = -1;
	public static final int DRIVETRAIN_RIGHT_BOTTOM_MOTOR = -1;
	
	//Blender Constants
	public static final int BLENDER_OUTER_WHEEL_MOTOR = -1;
	public static final int BLENDER_CENTER_WHEEL_MOTOR = -1;

	//Gear trap constants
	public static final int GEAR_TRAP_SOLENOID_PORT = 2;
	
	//Gear pusher constants
	public static final int GEARPUSHER_GEARPUSHER = 3;

    public static final int LIMIT_SWITCH = -1;
    public static final int IR_SENSOR_PORT = -1;
    public static final int LINE_SENSOR_PORT = -1;
}
