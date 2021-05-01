package core;

public abstract class App {
	private String appname;
	
	public App(String appname) {
		this.appname = appname;
	}
	
	public void OnCreate() {}
	public void OnUpdate() {}
	public void OnDestroy() {}
	
	public String GetAppName() {
		return appname;
	}
}
