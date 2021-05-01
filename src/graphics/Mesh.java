package graphics;

import buffers.VertexArrayBuffer;
import buffers.VertexBuffer;
import util.Utils;

public class Mesh {
	private float[] vertices, textureCoords;
	
	private VertexArrayBuffer vao;
	private VertexBuffer vbo, tbo;
	
	public Mesh(float[] vertices, float[] textureCoords) {
		this.vertices = vertices;
		this.textureCoords = textureCoords;
		
		vao = new VertexArrayBuffer();
		vbo = new VertexBuffer();
		vbo.Data(Utils.CreateBuffer(vertices));
		VertexBuffer.VertexAttribPointer(0, 3);
		tbo = new VertexBuffer();
		tbo.Data(Utils.CreateBuffer(textureCoords));
		VertexBuffer.VertexAttribPointer(1, 2);
	}
	
	public void Render() {
		vao.StartDraw();
		vbo.Bind();
		VertexBuffer.VertexAttribPointer(0, 2);
		tbo.Bind();
		VertexBuffer.VertexAttribPointer(1, 2);
		vao.RenderArray(6);
		vbo.Unbind();
		vao.EndDraw();
	}
	
	public int VertexCount() {
		return vertices.length;
	}
}
