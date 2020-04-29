class Board {
	private String [] board = {"1","2","3","4","5","6","7","8","9"};
	private boolean [] check = new boolean[9];
	public void show() {
		System.out.println("\t\t\n\n");
		System.out.println("\t\t\t\t"+board[0]+"\t|\t"+board[1]+"\t|\t"+board[2]);
		System.out.println("\t\t\t-------------------------------------------------");
		System.out.println("\t\t\t\t"+board[3]+"\t|\t"+board[4]+"\t|\t"+board[5]);
		System.out.println("\t\t\t-------------------------------------------------");
		System.out.println("\t\t\t\t"+board[6]+"\t|\t"+board[7]+"\t|\t"+board[8]);
		System.out.println("\n\n\n");
		if (full(check)==true) {
			System.out.println("Game over");
			System.exit(0);
		}
	}
	public String getMark(int get) {
		return this.board[get];
	}
	public void setMark(int set , String mark) {
		this.board[set] = mark;
		this.check[set] = true;
	}
	public boolean check(int set) {
		if (check[set] == true) 
			return true;
		return false;
	}
	public boolean full(boolean [] check) {
		for (boolean i : check) {
			if (i==false) {
				return false;
			}
		}
		return true;
	}
}