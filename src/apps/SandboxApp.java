package apps;

import core.App;
import core.Color;
import graphics.Mesh;
import graphics.Shader;

public class SandboxApp extends App {
	private Mesh mesh;
	private Shader shader;
	
	public SandboxApp() {super("Sandbox");}
	
	float vertices[] = new float[]
			{-0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.5f};
	
	float texCoords[] = new float[]
			{0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0};
	
	public void OnCreate() {
		shader = new Shader("default");
		mesh = new Mesh(vertices, texCoords);
	}
	
	public void OnUpdate() {
		shader.Bind();
		shader.SetColor(new Color(1, 0, 0, 1));
		mesh.Render();
		shader.Unbind();
	}
	
	public void OnDestroy() {
		
	}
}
