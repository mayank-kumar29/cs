package lab4;

public class JournalPaper extends WrittenItem
{
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public void print() 
	{
		System.out.println("JournalPaper:");
		System.out.println("[id=" + getId() + ", title=" + getTitle() + ", copies=" + getCopies() + ", author=" + getAuthor() + ", Year=" + year + "]");
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
	
}
