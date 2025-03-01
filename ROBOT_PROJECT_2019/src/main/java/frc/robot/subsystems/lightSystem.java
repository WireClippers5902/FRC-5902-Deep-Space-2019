package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DriverStation;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class lightSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  // public final SpeedController color = RobotMap.lights;
  public void getAllianceColor() {
    DriverStation.Alliance color;
    color = DriverStation.getInstance().getAlliance();
    if (color == DriverStation.Alliance.valueOf("Blue")) {
      blue();
    } else if (color == DriverStation.Alliance.valueOf("Red")) {
      red();
    } else {
      scannerGray();
    }
  }
  public void getAllianceColorMovement() {
    DriverStation.Alliance color;
    color = DriverStation.getInstance().getAlliance();
    if (color == DriverStation.Alliance.valueOf("Blue")) {
      chaseBlue();

    } else if (color == DriverStation.Alliance.valueOf("Red")) {
      chaseRed();

    } else {
      scannerGray();
    }
  }
  public void party() {
    RobotMap.lightsR.set(-.77);
    RobotMap.lightsL.set(-.77);
  }


  public void chaseBlue() {
    RobotMap.lightsR.set(-.29);
    RobotMap.lightsL.set(-.29);
  }

  public void chaseRed() {
    RobotMap.lightsR.set(-.31);
    RobotMap.lightsL.set(-.31);
  }

  public void BPMOcean() {
    RobotMap.lightsR.set(-.65);
    RobotMap.lightsL.set(-.65);
  }

  public void BPMLava() {
    RobotMap.lightsR.set(-.63);
    RobotMap.lightsL.set(-.63);
  }

  public void revenge() {
    RobotMap.lightsR.set(-.05);
    RobotMap.lightsL.set(-.05);
  }

  public void white() {
    RobotMap.lightsR.set(.93);
    RobotMap.lightsL.set(.93);
  }

  public void blueShots() {
    RobotMap.lightsR.set(-.83);
    RobotMap.lightsL.set(-.83);
  }

  public void blue() {
    RobotMap.lightsR.set(.85);
    RobotMap.lightsL.set(.85);
  }

  public void red() {
    RobotMap.lightsR.set(.61);
    RobotMap.lightsL.set(.61);
  }

  public void beatBlue() {
    RobotMap.lightsR.set(-.23);
    RobotMap.lightsL.set(-.23);
  }

  public void oceanBlue() {
    RobotMap.lightsR.set(-.41);
    RobotMap.lightsL.set(-.41);
  }

  public void redShots() {
    RobotMap.lightsR.set(-.85);
    RobotMap.lightsL.set(-.85);
  }

  public void scannerRed() {
    RobotMap.lightsR.set(-.35);
    RobotMap.lightsL.set(-.35);
  }

  public void beatRed() {
    RobotMap.lightsR.set(-.25);
    RobotMap.lightsL.set(-.25);
  }

  public void beatWhite() {
    RobotMap.lightsR.set(-.21);
    RobotMap.lightsL.set(-.21);
  }

  public void scannerGray() {
    RobotMap.lightsR.set(-.33);
    RobotMap.lightsL.set(-.33);
  }

  public void gray() {
    RobotMap.lightsR.set(.95);
    RobotMap.lightsL.set(.95);
  }

  public void strobeYellow() {
    RobotMap.lightsR.set(-.07);
    RobotMap.lightsL.set(-.07);

  }

  public void lavaError() {
    RobotMap.lightsR.set(.49);
    RobotMap.lightsL.set(.49);

  }

  public void rainbowGlitter() {
    RobotMap.lightsR.set(-.89);
    RobotMap.lightsL.set(-.89);
  }

  public void confetti() {
    RobotMap.lightsR.set(-.87);
    RobotMap.lightsL.set(-.87);
  }

  public void off() {
    RobotMap.lightsR.set(0);
    RobotMap.lightsL.set(0);
  }

  public void smartdash(double color) {
    RobotMap.lightsR.set(color);
    RobotMap.lightsL.set(color);
  }
  
/*   public String getLightColor() {
    String Color = "Null";
    switch ((int)(color.get()*100)) {
    case   0: Color = "Off"; break;
    case  49: Color = "Error"; break;
    case  -7: Color = "Strobe"; break;
    case  95: Color = "Gray"; break;
    case -33: Color = "Scanner Gray"; break;
    case -41: Color = "Calming Ocean"; break;
    case -85: Color = "Red Bullets"; break;
    case -35: Color = "Scanner Red"; break;
    case -21: Color = "Beat White"; break;
    case -25: Color = "Beat Red"; break;
    case -23: Color = "Beat Blue"; break;
    case -77: Color = "Party Time"; break;
    case  -5: Color = "How I really feel"; break;
    case  93: Color = "Revenge"; break;
    case -83: Color = "Blue Shots"; break;
    case  85: Color = "Blue"; break;
    case  61: Color = "Red"; break;}
    return Color;
  } */

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

}
