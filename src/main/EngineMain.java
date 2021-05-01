package main;

import apps.SandboxApp;
import core.Engine;

public class EngineMain {
	public static void main(String[] args) {
		Engine engine = new Engine();
		SandboxApp app = new SandboxApp();
		engine.SetApp(app);
		engine.Run(800, 600);
	}
}
