package math;

public class Vec2 {

	public class Vec2f {
		private float x, y;
		
		public Vec2f() {
		}
		
		public Vec2f(float x, float y) {
			this.x = x;
			this.y = y;
		}
		
		public void Set(float x, float y) {
			this.x = x;
			this.y = y;
		}
		
		public void Set(Vec2f vec) {
			this.x = vec.x;
			this.y = vec.y;
		}
		
		public float X() {
			return x;
		}
		
		public float Y() {
			return y;
		}
	}
	
	public class Vec2i {
		private int x, y;
		
		public Vec2i() {
		}
		
		public Vec2i(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void Set(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void Set(Vec2i vec) {
			this.x = vec.x;
			this.y = vec.y;
		}
		
		public int X() {
			return x;
		}
		
		public int Y() {
			return y;
		}
	}
	
}