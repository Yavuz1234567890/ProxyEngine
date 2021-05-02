package math;

public class Rect {
	
	public class Rectf {
		private float left, top, right, bottom;
		
		public Rectf() {
		}
		
		public Rectf(float left, float top, float right, float bottom) {
			this.left = left;
			this.top = top;
			this.right = right;
			this.bottom = bottom;
		}
		
		public void Set(float left, float top, float right, float bottom) {
			this.left = left;
			this.top = top;
			this.right = right;
			this.bottom = bottom;
		}
		
		public void Set(Rectf rect) {
			this.left = rect.left;
			this.top = rect.top;
			this.right = rect.right;
			this.bottom = rect.bottom;
		}
		
		public boolean Contains(float x, float y) {
			return x > left && x < right && y > top && y < bottom;
		}
		
		public boolean Contains(Vec2.Vec2f vec) {
			return Contains(vec.X(), vec.Y());
		}
		
		public boolean Intersects(Rectf rect) {
			return Contains(rect.left, rect.top);
		}
		
		public float Left() {
			return left;
		}
		
		public float Top() {
			return top;
		}
		
		public float Right() {
			return right;
		}
		
		public float Bottom() {
			return bottom;
		}
	}
	
	public class Recti {
		private int left, top, right, bottom;
		
		public Recti() {
		}
		
		public Recti(int left, int top, int right, int bottom) {
			this.left = left;
			this.top = top;
			this.right = right;
			this.bottom = bottom;
		}
		
		public void Set(int left, int top, int right, int bottom) {
			this.left = left;
			this.top = top;
			this.right = right;
			this.bottom = bottom;
		}
		
		public void Set(Recti rect) {
			this.left = rect.left;
			this.top = rect.top;
			this.right = rect.right;
			this.bottom = rect.bottom;
		}
		
		public boolean Contains(int x, int y) {
			return x > left && x < right && y > top && y < bottom;
		}
		
		public boolean Contains(Vec2.Vec2i vec) {
			return Contains(vec.X(), vec.Y());
		}
		
		public boolean Intersects(Recti rect) {
			return Contains(rect.left+rect.right, rect.top+rect.bottom);
		}
		
		public float Left() {
			return left;
		}
		
		public float Top() {
			return top;
		}
		
		public float Right() {
			return right;
		}
		
		public float Bottom() {
			return bottom;
		}
	}
	
}
