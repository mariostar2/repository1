package tx0909_3;

public class Printable  {
	
	protected int pagecnt;
	protected boolean colorcopy;//

	
	public Printable(int pagecnt, boolean colorcopy ) {
		this.pagecnt = pagecnt;
		this.colorcopy =colorcopy;
	
	}
	
	public int getPageCnt() {
		return pagecnt;
	}
	public void setPageCnt(int pageCnt) {
		this.pagecnt = pageCnt;
	}
	public boolean isColorCopy() {
		return colorcopy;
	}
	public void setColorCopy(boolean colorCopy) {
		this.colorcopy = colorCopy;
	}
	public int getPagecnt() {
		return pagecnt;
	}
	
	public void setPagecnt(int pagecnt) {
		this.pagecnt = pagecnt;
	}
	
	public boolean isColorcopy() {
		return colorcopy;
	}
	public void setColorcopy(boolean colorcopy) {
		this.colorcopy = colorcopy;
	}
	
	
	
	
	
	


}
