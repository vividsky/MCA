class Five{
	public static void main(String[] args){
		for (int i = 0; i<5; i++) {
			System.out.printf("  *");
		}
		System.out.println(" ");
		
		for (int i = 0; i<2; i++) {
			System.out.println("  *");
		}
		for (int i = 0; i<4; i++) {
			System.out.printf("  *");
		}
		System.out.println(" ");
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<4; j++) {
				System.out.printf("   r");
			} System.out.println("  *");
		}
		for (int i = 0; i<4; i++) {
			System.out.printf("  *");
		}
	}
}