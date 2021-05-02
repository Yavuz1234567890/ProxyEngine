package math;

import java.nio.FloatBuffer;

import org.lwjgl.BufferUtils;

public class Matrix4x4 {
	public float m[][] = new float[4][4];
	
	public Matrix4x4() {
		SetIdentity();
	}

	private void SetIdentity() {
		m[0][0] = 1; m[0][1] = 0; m[0][2] = 0; m[0][3] = 0;
		m[1][0] = 0; m[1][1] = 1; m[1][2] = 0; m[1][3] = 0;
		m[2][0] = 0; m[2][1] = 0; m[2][2] = 1; m[2][3] = 0;
		m[3][0] = 0; m[3][1] = 0; m[3][2] = 0; m[3][3] = 1;
	}
	
	public static Matrix4x4 Ortho(float left, float right, float bottom, float top, float near, float far) {
		Matrix4x4 mat = new Matrix4x4();
		
		float width = right - left;
		float height = top - bottom;
		float depth = far - near;
		
		mat.m[0][0] = 2f / width;
		mat.m[1][1] = 2f / height;
		mat.m[2][2] = 2f / depth;
		mat.m[3][0] = -(right + left) / width;
		mat.m[3][1] = -(top + bottom) / height;
		mat.m[3][2] = -(far + near) / depth;
		
		return mat;
	}
	
	public FloatBuffer ToBuffer() {
		FloatBuffer buffer = BufferUtils.createFloatBuffer(16);
		buffer.put(m[0][0]).put(m[0][1]).put(m[0][2]).put(m[0][3]);
		buffer.put(m[1][0]).put(m[1][1]).put(m[1][2]).put(m[1][3]);
		buffer.put(m[2][0]).put(m[2][1]).put(m[2][2]).put(m[2][3]);
		buffer.put(m[3][0]).put(m[3][1]).put(m[3][2]).put(m[3][3]);
		buffer.flip();
		return buffer;
	}
}
