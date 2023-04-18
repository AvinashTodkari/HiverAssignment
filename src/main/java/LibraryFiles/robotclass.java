package LibraryFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class robotclass
{
	
public void mouseclick(int x,int y) throws AWTException, InterruptedException
{
	Robot robot=new Robot();
	robot.mouseMove(x, y);
	Thread.sleep(500);
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(500);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
}

public void performkeyboardkeypress() throws AWTException
{
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
}
}
