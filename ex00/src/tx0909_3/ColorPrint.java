package tx0909_3;

public class ColorPrint extends Printable {
	private String colorPrinter;
	
	public ColorPrint(int pagecnt , boolean colorcopy,String colorPrinter ) {
		super(pagecnt ,colorcopy);
		this.colorPrinter = colorPrinter;
	}

	public String getColorPrinter() {
		return colorPrinter;
	}

	public void setColorPrinter(String colorPrinter) {
		this.colorPrinter = colorPrinter;
	}


	
	
	
	
}
