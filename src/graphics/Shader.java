package graphics;

import org.lwjgl.opengl.GL20;

import core.Color;
import shader.ShaderProgram;
import util.Utils;

public class Shader {
	private shader.Shader vertex, fragment;
	private ShaderProgram program;
	
	public Shader(String fileName) {
		program = new ShaderProgram();
		vertex = new shader.Shader(GL20.GL_VERTEX_SHADER);
		vertex.Load(Utils.LoadFile(Utils.GetShaderDir() + fileName + ".vert"));
		vertex.ShowErrors();
		fragment = new shader.Shader(GL20.GL_FRAGMENT_SHADER);
		fragment.Load(Utils.LoadFile(Utils.GetShaderDir() + fileName + ".frag"));
		fragment.ShowErrors();
		program.AddShader(vertex, fragment);
		program.Link();
	}
	
	public void SetColor(Color color) {
		program.SetColor(color);
	}
	
	public void Bind() {
		program.Bind();
	}
	
	public void Unbind() {
		program.Unbind();
	}
}
