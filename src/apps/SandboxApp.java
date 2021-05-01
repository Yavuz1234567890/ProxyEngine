package apps;

import core.App;
import core.Color;
import graphics.Mesh;
import graphics.Shader;
import graphics.Texture;

public class SandboxApp extends App {
	private Mesh mesh;
	private Shader shader;
	private Texture tex;
	
	public SandboxApp() {super("Sandbox");}
	
	float vertices[] = new float[]
			{-0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.5f};
	
	float texCoords[] = new float[]
			{0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0};
	
	public void OnCreate() {
		tex = new Texture("indir (2).jpg");
		shader = new Shader("textured_shader");
		mesh = new Mesh(vertices, texCoords);
	}
	
	public void OnUpdate() {
		shader.Bind();
		tex.Bind();
		shader.SetColor(new Color(1, 1, 1, 1));
		mesh.Render();
		tex.Unbind();
		shader.Unbind();
	}
	
	public void OnDestroy() {
		
	}
}
