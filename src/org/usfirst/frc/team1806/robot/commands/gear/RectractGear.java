package org.usfirst.frc.team1806.robot.commands.gear;

import org.usfirst.frc.team1806.robot.Robot;
import org.usfirst.frc.team1806.robot.States.GearHolder;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RectractGear extends Command {

    public RectractGear() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.gearSS);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.states.gearTracker = GearHolder.IN;
    	Robot.gearSS.extend();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
