package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Arm extends SubsystemBase {

 // The Romi has the arm motor set to PWM channel
 private final Servo m_arm = new Servo(6);
 
 private final double MAX_ANGLE = 1.0;
 private final double MIN_ANGLE = 0.5;
 

 /** Creates a new Arm. */
 public Arm() {
 }


 /** Lifts Arm. */
 public void liftUp(double pos) {
    if (pos > MAX_ANGLE){
        pos = MAX_ANGLE;
    } else if (pos < MIN_ANGLE) {
        pos = MIN_ANGLE;
    }
    m_arm.set(pos);  

 }

/** Lowers Arm. */
 public void liftDown(double speed) {
    // WRITE ME  
    m_arm.set(speed);
}

}
