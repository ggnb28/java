package project;

import java.time.LocalDateTime;
import java.util.Objects;

// ���� ���, ��ȸ
// ������ Book �����̴�.
// ������ �ֿ� �Ӽ���? ����, �帣, ����, �Ǹŷ�,
public class Webtoon implements Book {
	private String isbn;
	private String title;
	private String genre;
	private String author;
	private LocalDateTime date;
	private int count;
	
	public Webtoon(){};
	public Webtoon(String isbn, String genre, String title, String author) {
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.date = LocalDateTime.now();
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	@Override
	public String toString() {
		// �⺻�� : ��Ű��.Ŭ������@Hexa�ؽ��ڵ�
		return "Webtoon [title=" + title + ", genre=" + genre + ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, date, genre, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // �����ϴ� ��ü�� ������ true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Webtoon other = (Webtoon) obj;
		return Objects.equals(author, other.author) && Objects.equals(date, other.date)
				&& Objects.equals(genre, other.genre) && Objects.equals(title, other.title);
	}
	
	
}