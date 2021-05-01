package apps;

import core.App;
import graphics.Mesh;

public class SandboxApp extends App {
	private Mesh mesh;
	
	public SandboxApp() {super("Sandbox");}
	
	float vertices[] = new float[]
			{-0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.5f};
	
	float texCoords[] = new float[]
			{0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0};
	
	public void OnCreate() {
		mesh = new Mesh(vertices, texCoords);
	}
	
	public void OnUpdate() {
		mesh.Render();
	}
	
	public void OnDestroy() {
		
	}
}
