package lab4;

public class Book extends WrittenItem
{
    @Override
	public void print() 
	{
		System.out.println("Book:");
		System.out.println("[id=" + getId() + ", title=" + getTitle() + ", copies=" + getCopies() + ", author=" + getAuthor() + "]");
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
