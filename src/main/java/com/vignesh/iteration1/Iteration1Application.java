package com.vignesh.iteration1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vignesh.iteration1.GameControl;
import com.vignesh.iteration1.contra;
import com.vignesh.iteration1.mario;
import com.vignesh.iteration1.packman;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
class contra{
	
	public void up() {
		System.out.println("contra UP");
	}
	public void down() {
		System.out.println("contra down");
	}
	public void left() {
		System.out.println("contra left");
	}
	public void right() {
		System.out.println("contra right");
	}
	
}
class packman{
	
	public void up() {
		System.out.println("packman UP");
	}
	public void down() {
		System.out.println("packman down");
	}
	public void left() {
		System.out.println("packman left");
	}
	public void right() {
		System.out.println("packman right");
	}
	
}

class mario{
	public void up() {
		System.out.println("mario UP");
	}
	public void down() {
		System.out.println("mario down");
	}
	public void left() {
		System.out.println("mario left");
	}
	public void right() {
		System.out.println("mario right");
	}
}

class GameControl{
	
	packman game;
	
	GameControl(packman game){
		this.game=game;
	}
//	@Override
//	public String toString() {
//		
//		return "game: "+game;
//	} 
	void Gamerunner() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}

public class Iteration1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Iteration1Application.class, args);
		mario mario=new mario();
		packman packman=new packman();
		contra kantra=new contra();
		
		GameControl game=new GameControl(packman);
//		System.out.println(game);
//		game.game.up();
		game.Gamerunner();
	}

}
