
package org.usfirst.frc.team172.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * The main autonomous command to pickup and deliver the
 * soda to the box.
 */
public class Autonomous extends CommandGroup {
    public Autonomous() {
    	addSequential(new PrepareToPickup());
        addSequential(new Pickup());
        addSequential(new SetDistanceToBox(0.02));
        addSequential(new Place());
        addSequential(new SetDistanceToBox(0.60));
        addParallel(new SetWristSetpoint(-45));
        addSequential(new CloseClaw());
    }
}
