package homework.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
        private int id;
        @NotEmpty
        @Size(min=8,max=30, message = "Book should be in size from 8 to 30 characters")
        private String title;
        @NotEmpty
        @Size(min = 15, message = "Name should be in this format: Boris Braga Sergeevich")
        private String author;
        @Min(value = 1700)
        private int year;

        public Book(){

        }
        public Book(String title, String author, int year) {
                this.title = title;
                this.author = author;
                this.year = year;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }
}
