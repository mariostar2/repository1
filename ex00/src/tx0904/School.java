package tx0904;

public class School  {
	/*
	 * 전체 학생수
	 * 대비 남학생수
	 * 여학생수
	 */
	protected int totalCnt;  //전체
	protected int mentotalCnt; //남자학생
	protected int womentotalCnt; // 여자학생
	
	public School() {
	
	}
	public School(int totalCnt, int mentotalCnt, int womentotalCnt) {
		this.totalCnt =totalCnt;
		this.mentotalCnt = mentotalCnt;
		this.womentotalCnt = womentotalCnt;
	}

	
	public int getTotalcnt() {
		return totalCnt;
	}
	
	public void setTotalCnt(int totalCnt) {
		this.totalCnt =  totalCnt;
	}
	
	public int getmentotalCnt() {
		return mentotalCnt;
	}
	
	public void setmentotalCnt(int mentotalCnt) {
		this.mentotalCnt =  mentotalCnt;
	}
	
	public int getwomentotalCnt() {
		return totalCnt;
	}
	
	public void setwomentotalCnt(int womentotalCnt) {
		this.womentotalCnt =  womentotalCnt;
	}
	
	@Override
	public String toString() {
		return String.format("총 학생 인원 :%d 남자 인원:%d 여자 인원: %d", totalCnt,mentotalCnt,womentotalCnt);
	}
	
	
}
