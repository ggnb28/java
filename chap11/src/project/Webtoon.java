package project;

import java.time.LocalDateTime;
import java.util.Objects;

// 웹툰 등록, 조회
// 웹툰은 Book 종류이다.
// 웹툰의 주요 속성은? 제목, 장르, 저자, 판매량,
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
		// 기본형 : 패키지.클래스명@Hexa해쉬코드
		return "Webtoon [title=" + title + ", genre=" + genre + ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, date, genre, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 참조하는 객체가 같은면 true
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
