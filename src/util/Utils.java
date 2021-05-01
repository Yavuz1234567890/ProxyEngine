package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import org.lwjgl.BufferUtils;

public class Utils {
	public static String GetShadersDir() {
		return "res/shaders/";
	}
	
	public static String GetTexturesDir() {
		return "res/textures/";
	}
	
	public static String LoadFile(String path) {
		StringBuilder b = new StringBuilder();
		try {
			BufferedReader r = new BufferedReader(new FileReader(new File(path)));
			String line;
			while((line = r.readLine()) != null) {
				b.append(line);
				b.append("\n");
			}
			r.close();
		} catch (IOException e) {
			System.err.println("File loading failed!");
		}
		return b.toString();
	}
	
	public static FloatBuffer CreateBuffer(float[] data) {
		FloatBuffer buffer = BufferUtils.createFloatBuffer(data.length);
		buffer.put(data).flip();
		return buffer;
	}
	
	public static IntBuffer CreateBuffer(int[] data) {
		IntBuffer buffer = BufferUtils.createIntBuffer(data.length);
		buffer.put(data).flip();
		return buffer;
	}
	
	public static ByteBuffer CreateBuffer(byte[] data) {
		ByteBuffer buffer = BufferUtils.createByteBuffer(data.length);
		buffer.put(data).flip();
		return buffer;
	}
}
