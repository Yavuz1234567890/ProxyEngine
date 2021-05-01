package graphics;

import org.lwjgl.opengl.GL20;

import shader.ShaderProgram;
import util.Utils;

public class Shader {
	private shader.Shader vertex, fragment;
	private ShaderProgram program;
	
	public Shader(String fileName) {
		vertex = new shader.Shader(GL20.GL_VERTEX_SHADER);
		vertex.Load(Utils.GetShaderDir() + fileName + ".vert");
		fragment = new shader.Shader(GL20.GL_FRAGMENT_SHADER);
		fragment.Load(Utils.GetShaderDir() + fileName + ".frag");
		program = new ShaderProgram();
		program.AddShader(vertex, fragment);
		program.Link();
	}
	
	public void Bind() {
		program.Bind();
	}
	
	public void Unbind() {
		program.Unbind();
	}
}
