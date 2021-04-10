package Day4;

public class Music {
	private double playMusic;
	
	public Music(double playMusic) {
		// TODO Auto-generated constructor stub
		this.playMusic = playMusic;
	}

	public Music() {
		// TODO Auto-generated constructor stub
	}

	public double getPlayMusic() {
		return playMusic;
	}

	public void setPlayMusic(double playMusic) {
		this.playMusic = playMusic;
	}

	public boolean doStartMusicByRadio(double playMusic){
		if(playMusic == 91.1||playMusic == 98.3||playMusic == 101.3){
			return true;
		}
		return false;
	}
}
