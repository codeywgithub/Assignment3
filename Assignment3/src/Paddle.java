import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		// TODO: Set width to Settings.PADDLE_WIDTH
		setWidth(Settings.PADDLE_WIDTH);
		// TODO: Set width to Settings.PADDLE_HEIGHT
		setHeight(Settings.PADDLE_HEIGHT);
		// TODO: Call resetPosition
		resetPosition();
	}
	
	public void resetPosition() {
		// TODO: Set initial position x and y (use INITIAL_PADDLE_X/Y)
		setX(Settings.INITIAL_BALL_X);
		setY(Settings.INITIAL_BALL_Y);
		// Note: Check Ball.java for a hint
	}
	
	public void update() {
		x += xVelocity;
		if(x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) {
			x = 300;
			this.xVelocity = -1;
		}
		
		if(x <= 0) {
			// TODO: Set x to 0 so it does not leave the screen
			x = 0;
			// TODO: Change the x velocity to make the ball go right
			this.xVelocity = 1;
			
		}
		// TODO: Prevent the paddle from moving outside of the screen
		// This can be done using two if statements (one for the left side of the screen and one for the right)

	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		// TODO: Set x velocity
		this.xVelocity = vel;
	}
}
