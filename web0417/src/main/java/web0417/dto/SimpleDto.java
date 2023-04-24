package web0417.dto;

public class SimpleDto {
	//파라미터이름과 변수명이 동일하여야함.
	private String mid;
	private String singer;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "SimpleDto [mid=" + mid + ", singer=" + singer + "]";
	}

}
