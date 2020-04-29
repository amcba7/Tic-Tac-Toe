import java.util.Scanner;
import java.io.IOException;
abstract class AbstractPlayer implements Player {
	private String name;
	private String mark;
	private int input;
	private boolean isNumber;
    public static Board b = new Board();
	private Scanner cin = new Scanner(System.in);
	public AbstractPlayer(String name,String mark) {
		this.name = name;
		this.mark = mark;
		setMark();
		win();
	}
	public String getName() {
		return name;
	}
	public String getMark() {
		return mark;
	}
	public void set(int input) {
		input--;
		if (b.check(input)==true) {
			System.out.println("Already Marked");
			b.show();
			setMark();
			return;
		}
		b.setMark(input,getMark());
		b.show();
	}
	public void setMark() {
		System.out.println(getName()+"Select the number to mark on the the board");
		do {
			if (cin.hasNextInt()) {
				input = cin.nextInt();
				isNumber = true;
			} else {
				System.out.println("invalid Input please Enter Integer Value only");
				isNumber = false;
				cin.next();
			}
		} while (!(isNumber));
		cls();
		switch (input) {
			case 1:
			set(input);
			break;
			case 2:
			set(input);
			break;
			case 3:
			set(input);
			break;
			case 4:
			set(input);
			break;
			case 5:
			set(input);
			break;
			case 6:
			set(input);
			break;
			case 7:
			set(input);
			break;
			case 8:
			set(input);
			break;
			case 9:
			set(input);
			break;
			default:
			System.out.println("invalid input");
			b.show();
			setMark();
			break;
		}
	}
	public void win() {
		//checking rows:-
		if (b.getMark(0) == getMark() && b.getMark(1) == getMark() && b.getMark(2) == getMark()) {
			System.out.println(getName()+"Won the match");
			System.exit(0);
		}
		if (b.getMark(3) == getMark() && b.getMark(4) == getMark() && b.getMark(5) == getMark()) {
			System.out.println(getName()+"Won the match");
			System.exit(0);
		}
		if (b.getMark(6) == getMark() && b.getMark(7) == getMark() && b.getMark(8) == getMark()) {
			System.out.println(getName()+"Won the match");
			System.exit(0);
		}
		//checking cols:-
		if (b.getMark(0) == getMark() && b.getMark(3) == getMark() && b.getMark(6) == getMark()) {
			System.out.println(getName()+"Won the match");
			System.exit(0);
		}
		if (b.getMark(1) == getMark() && b.getMark(4) == getMark() && b.getMark(7) == getMark()) {
			System.out.println(getName()+"Won the match");
			System.exit(0);
		}
		if (b.getMark(2) == getMark() && b.getMark(5) == getMark() && b.getMark(8) == getMark()) {
			System.out.println(getName()+"Won the match");
			System.exit(0);
		}
		// last case :-
		if (b.getMark(0) == getMark() && b.getMark(4) == getMark() && b.getMark(8) == getMark()) {
			System.out.println(getName()+"Won the match");
			System.exit(0);
		}
		if (b.getMark(2) == getMark() && b.getMark(4) == getMark() && b.getMark(6) == getMark()) {
			System.out.println(getName()+"Won the match");
			System.exit(0);
		}
	}
	public void cls() {
		try {
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}