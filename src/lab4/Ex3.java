package lab4;

public class Ex3
{
	public static void main(String[] args) 
	{
		WrittenItem[] w = new WrittenItem[2];
		MediaItem[] m = new MediaItem[2];
		w[0] = new Book();
		w[1]= new JournalPaper();
		m[0]= new Video();
		m[1] = new CD();
		w[0].setId(101);
		w[0].setTitle("Book 1");
		w[0].setCopies(3);
		w[0].setAuthor("Author 1");
		w[1].setId(102);
		w[1].setTitle("Journal Paper 1");
		w[1].setCopies(3);
		w[1].setAuthor("Author 2");
		((JournalPaper) w[1]).setYear(2010);
		m[0].setId(201);
		m[0].setTitle("Video 1");
		m[0].setCopies(3);
		m[0].setRuntime(150);
		((Video) m[0]).setDirector("Director 1");
		((Video) m[0]).setGenre("Genre 1");
		((Video) m[0]).setYear(2012);
		m[1].setId(202);
		m[1].setTitle("CD 1");
		m[1].setCopies(3);
		m[1].setRuntime(120);
		((CD) m[1]).setArtist("Artist 1");
		((CD) m[1]).setGenre("Genre 2");
		for (int i = 0; i < 2; i++)
		{
			w[i].print();
			w[i].checkOut();
			w[i].print();
			w[i].checkIn();
			w[i].print();
		}
		for (int i = 0; i < 2; i++)
		{
			m[i].print();
			m[i].checkOut();
			m[i].print();
			m[i].checkIn();
			m[i].print();
		}
		
	}
}
