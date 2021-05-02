package graphics;

import static org.lwjgl.stb.STBImage.*;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import org.lwjgl.BufferUtils;

import util.Utils;

public class Texture {
	private shader.Texture texture;
	
	public Texture(String fileName) {
		IntBuffer w = BufferUtils.createIntBuffer(1);
		IntBuffer h = BufferUtils.createIntBuffer(1);
		IntBuffer c = BufferUtils.createIntBuffer(1);
		
		ByteBuffer data = stbi_load(Utils.GetTexturesDir() + fileName, w, h, c, 4);
		
		int width = w.get();
		int height = h.get();
		
		texture = new shader.Texture(data, width, height);
		texture.Create();
		
		stbi_image_free(data);
	}
	
	public void Bind() {
		texture.Bind();
	}
	
	public void Unbind() {
		texture.Unbind();
	}
}
