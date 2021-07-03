package guru.springframework.srpring5Webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.srpring5Webapp.domain.Author;
import guru.springframework.srpring5Webapp.domain.Book;
import guru.springframework.srpring5Webapp.domain.Publisher;
import guru.springframework.srpring5Webapp.repositories.AuthorRepository;
import guru.springframework.srpring5Webapp.repositories.BookRepository;
import guru.springframework.srpring5Webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner{
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Author eric = new Author("Eric", "Evancs");
		Book ddd = new Book("Domain Driven", "122112 Computer Application");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Develpoment With EJB", "23222");
		
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
		Author pankaj = new Author("Pankaj","Prasun");
		Book firstBook = new Book("FistBook of Pankaj", "2323232");
		
		pankaj.getBooks().add(firstBook);
		firstBook.getAuthors().add(pankaj);
		
		authorRepository.save(pankaj);
		bookRepository.save(firstBook);
		
		
		Publisher publisherFirst = new Publisher("RAJ PUBLISHER", "Address India Delhi","New Delhi", "State1", "2322322");
		Publisher publisherSecond = new Publisher("RAJ PUBLISHER111", "111Address India Delhi","1111New Delhi", "1111State1", "22122322322");
		
		publisherRepository.save(publisherFirst);
		publisherRepository.save(publisherSecond);
		
		System.out.println("Started in Bootstrap");
		System.out.println("Number of Book: " +bookRepository.count());
		System.out.println("Number of publisher: " +publisherRepository.count());
		
	}

}
