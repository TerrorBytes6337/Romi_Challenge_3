package frc.robot.commands;

import frc.robot.subsystems.Arm;
import edu.wpi.first.wpilibj2.command.CommandBase;
import java.util.function.Supplier;


public class MoveArm extends CommandBase {
   private final Arm m_arm;
   private final Supplier<Double> m_speedSupplier;

  public MoveArm (Supplier<Double> speed, Arm arm){
      m_arm = arm;
      m_speedSupplier = speed;
      addRequirements(arm);
   }

   // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_arm.liftUp(m_speedSupplier.get());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

}
