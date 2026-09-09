package tx0909_3;

public class BlackPrint extends Printable{
	

	private String blackPrinter;

	public BlackPrint(int pagecnt, boolean colorcopy,
			 String black) {
		super(pagecnt,colorcopy);
		this.blackPrinter = black;
	}

	public String getBlack() {
		return blackPrinter;
	}

	public void setBlack(String black) {
		this.blackPrinter = black;
	}

	@Override
	public String toString() {
		return String.format("흑백 프린터:%s\n" ,blackPrinter);
	}
	
}
