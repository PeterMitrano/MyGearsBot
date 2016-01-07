package org.usfirst.frc.team172.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Pickup a soda can (if one is between the open claws) and
 * get it in a safe state to drive around.
 */
public class Pickup extends CommandGroup {
    public  Pickup() {
    	addSequential(new CloseClaw());
    	addParallel(new SetElevatorSetpoint(0.25));
    	addSequential(new SetWristSetpoint(-45));
    }
}
