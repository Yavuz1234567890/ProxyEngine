package core;

import display.Window;
import math.Vec2;

public abstract class App {
	protected String appname;
	protected Engine engine;
	protected Window window;
	
	public App(String appname) {
		this.appname = appname;
	}
	
	public void OnCreate() {}
	public void OnUpdate() {}
	public void OnDestroy() {}
	
	public void Init(Engine engine, Window window) {
		this.window = window;
		this.engine = engine;
	}
	
	public String GetAppName() {
		return appname;
	}
}
