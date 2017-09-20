import static org.junit.Assert.*;

import org.junit.Test;

public class GameTests {
	int W = 4;
	int H = 8;
	
	Rock Rock1 = new Rock(W, H);
	
	@Test
	public void Rock_Constructor_GetX_GetY_ToString_Test() {
		assertTrue("xCoord must be between 0 and " + Integer.toString(W), 0 <= Rock1.getX() && Rock1.getX() < W);
		assertEquals("yCoord must be 0", 0, Rock1.getY());
		assertEquals("Model must be O", "O", Rock1.toString());
	}
	
	@Test
	public void Rock_MoveRock_SetY_GetY_Test() {
		Rock1.moveRock();
		assertEquals("yCoord must be 1", 1, Rock1.getY());
		
	}
	
	Player Player1 = new Player(H, W);
	long createTime = System.currentTimeMillis();
	
	@Test
	public void Player_Constructor_GetX_GetY_GetScore_GetTime_ToString_Test() {
		assertEquals("Xcoord must be " + Integer.toString(W/2), W/2, Player1.getX());
		assertEquals("Ycoord must be " + Integer.toString(H), H, Player1.getY());
		assertEquals("Model must be X", "X", Player1.toString());
		assertEquals("Score must be 0", 0, Player1.getScore());
		assertEquals("Time difference must be 0", 0, Player1.getTime());
	}
	
	@Test
	public void Player_UpScore_GetScore_Test() {
		Player1.upScore();
		assertEquals("Score must be 1", 1, Player1.getScore());
	}
	
	@Test
	public void Player_SetY_GetY_Test() {
		Player1.setYcoord(0);
		assertEquals("Ycoord must be 0", 0, Player1.getY());
	}
	
	@Test
	public void Player_MoveLeft_SetX_GetX_GetScore_Test() {
		Player1.moveLeft();
		assertEquals("Xcoord must be " + Integer.toString((W/2) - 1), (W/2) - 1, Player1.getX());
		assertEquals("Score must be 1", 1, Player1.getScore());
	}
	
	@Test
	public void Player_MoveRight_SetX_GetX_GetScore_Test() {
		Player1.moveRight();
		assertEquals("Xcoord must be " + Integer.toString((W/2) + 1), (W/2) + 1, Player1.getX());
		assertEquals("Score must be 1", 1, Player1.getScore());
		
	}

}