package tx0909;

public enum Operation {
	PLUS{
		@Override
		public int calculate(int a, int b) {
			return a+b;
		}
	},
	MINUS{
		@Override
		public int calculate(int a,int b ) {
			return a-b;
		}
	};

	public abstract int calculate(int a, int b );

	
}
