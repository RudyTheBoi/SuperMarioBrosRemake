package com.mario.main.game;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import com.mario.main.engine.GameEngine;
import com.mario.main.engine.IGameLogic;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Main {
	public static void main(String args[]) {
		try {
			boolean vSync = true;
			IGameLogic gameLogic = new DummyGame();
			GameEngine gameEng = new GameEngine("GAME", 600, 480, vSync, gameLogic);
			gameEng.run();
		} catch (Exception excp) {
			excp.printStackTrace();
			System.exit(-1);
		}
	}
}
