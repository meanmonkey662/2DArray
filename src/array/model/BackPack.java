package array.model;

public class BackPack {
	private String[][] bagstuff;
	private int x;
	private int y;

	public BackPack() {
		bagstuff = new String[5][5];
	}

	public void addStuff(int x, int y, String content) {
		this.x = x;
		this.y = y;
		bagstuff[x][y] = content;
	}

	public String getContents() {
		return bagstuff[x][y];
	}

	public void removeStuff(int x, int y) {
		this.x = x;
		this.y = y;
		bagstuff[x][y] = "";
	}

}