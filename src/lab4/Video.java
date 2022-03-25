package lab4;

public class Video extends MediaItem 
{
	private String director;
	private String genre;
	private int year;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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
		System.out.println("Video:");
		System.out.println("[id=" + getId() + ", title=" + getTitle() + ", copies=" + getCopies() + ", runtime=" + getRuntime() + ", director=" + director + ", genre=" + genre + ", Year=" + year + "]");
	}

}
