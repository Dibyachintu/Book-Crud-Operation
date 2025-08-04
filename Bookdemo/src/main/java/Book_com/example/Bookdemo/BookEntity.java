package Book_com.example.Bookdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book_information")
public class BookEntity {
	
	@Id
	
	private int id;
	private String title;
	private String auther;
	private Integer published_Year;
	private String isbn;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public Integer getPublished_Year() {
		return published_Year;
	}
	public void setPublished_Year(Integer published_Year) {
		this.published_Year = published_Year;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", title=" + title + ", auther=" + auther + ", published_Year=" + published_Year
				+ ", isbn=" + isbn + "]";
	}
	
	
	
}
