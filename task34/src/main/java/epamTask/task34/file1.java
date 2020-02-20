package epamTask.task34;

public class file1 extends vehicle1 implements radSwitch
{

	private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

    //@Override
    public void turnRadioOn() {
        radioOn = true;
    }

    //@Override
    public void turnRadioOff() {
        radioOn = false;
    }
}

abstract class vehicle implements engineSwitch 
{

	private boolean engineRunning;
	
	public boolean isEngineRunning() {
	    return engineRunning;
	}
	
	//@Override
	public void startEngine() {
	    engineRunning = true;
	}
	
	//@Override
	public void shutDownEngine() {
	    engineRunning = false;
	}

}

 class Drone extends vehicle implements camSwitch {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }

   // @Override
    public void turnCameraOn() {
        cameraOn = true;
    }

   // @Override
    public void turnCameraOff() {
        cameraOn = false;
    }
}

