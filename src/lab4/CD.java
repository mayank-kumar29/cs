package lab4;

public class CD extends MediaItem
{
	private String genre;
	private String artist;
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public void checkIn() 
	{
		setCopies(getCopies() + 1);
	}

	@Override
	public void checkOut() 
	{
		setCopies(getCopies() - 1);
	}
	
	@Override
	public void print() 
	{
		System.out.println("CD:");
		System.out.println("[id=" + getId() + ", title=" + getTitle() + ", copies=" + getCopies() + ", runtime=" + getRuntime() + ", artist=" + artist +", genre=" + genre + "]");
	}

}
