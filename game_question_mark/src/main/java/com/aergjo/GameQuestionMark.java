package com.aergjo;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * First asset for creating a game
 *
 */
public class GameQuestionMark 
{
    public static void main( String[] args )
    {
        run();
    }

    private static void run() {
        if ( !glfwInit() ) {
            throw new RuntimeException("Cannot initialize GLFW");
        }

		glfwWindowHint(GLFW_RESIZABLE, GLFW_FALSE); // the window will be resizable

        long window = glfwCreateWindow(300, 300, "Hello", NULL, NULL);

        if (window == NULL) {
            throw new RuntimeException("Cannot initialize window");
        }

        glfwMakeContextCurrent(window);

        while ( !glfwWindowShouldClose(window) ) {
			glfwPollEvents();
        }
        
        glfwTerminate();
    }
}
