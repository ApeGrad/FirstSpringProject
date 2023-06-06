package homework.models;

import javax.persistence.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "Book")
public class Book {
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "title")
        @NotEmpty
        @Size(min=8,max=30, message = "Book should be in size from 8 to 30 characters")
        private String title;

        @Column(name = "author")
        @NotEmpty
        @Size(min = 15, message = "Name should be in this format: Boris Braga Sergeevich")
        private String author;
        @Column(name = "year")
        @Min(value = 1700)
        private int year;
        @ManyToOne
        @JoinColumn(name = "person_id", referencedColumnName = "id")
        private Person owner;

        @Column(name = "taken_at")
        @Temporal(TemporalType.TIMESTAMP)
        private Date takenAt;

        @Transient
        private boolean expired;

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

        public Person getOwner() {
                return owner;
        }

        public void setOwner(Person owner) {
                this.owner = owner;
        }

        public Date getTakenAt() {
                return takenAt;
        }

        public void setTakenAt(Date takenAt) {
                this.takenAt = takenAt;
        }

        public boolean isExpired() {
                return expired;
        }

        public void setExpired(boolean expired) {
                this.expired = expired;
        }
}
