package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
    private XboxController controller = new XboxController(Constants.XBOX_CONTROLLER_PORT);

    public double getLeftY() {
        return controller.getLeftY();
    }

    public double getRightY() {
        return controller.getRightY();
    }
}
