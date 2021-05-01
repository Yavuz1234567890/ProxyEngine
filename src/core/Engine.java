package core;

import display.Window;

public class Engine {
	private App app;
	private Window window;
	
	public Engine() {
		
	}
	
	public void SetApp(App app) {
		this.app = app;
	}
	
	public void Run(int width, int height) {
		if(app == null)return;
		window = new Window(app.GetAppName(), width, height);
		app.OnCreate();
		
		while(window.Running()) {
			app.OnUpdate();
			window.Update();
		}
		
		app.OnDestroy();
		window.Destroy();
	}
}
