package com.vinaylogics.springbasics.bootstrap;

import com.vinaylogics.springbasics.domain.Address;
import com.vinaylogics.springbasics.domain.Author;
import com.vinaylogics.springbasics.domain.Book;
import com.vinaylogics.springbasics.domain.Publisher;
import com.vinaylogics.springbasics.repositories.AddressRepository;
import com.vinaylogics.springbasics.repositories.AuthorRepository;
import com.vinaylogics.springbasics.repositories.BookRepository;
import com.vinaylogics.springbasics.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private final AddressRepository addressRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository, AddressRepository addressRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.addressRepository = addressRepository;
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");
        Publisher publisher = new Publisher("SFG Publishing");
        Address address = new Address("St Petersburg", "FL", "Russia", "33701");
        publisher.setAddress(address);
        address.setPublisher(publisher);

        publisherRepository.save(publisher);
        addressRepository.save(address);

        System.out.println("Publisher Count : "+publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "393945959");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);


        System.out.println("Number of Books : " + bookRepository.count());
        System.out.println("Publisher Number of books " + publisher.getBooks().size());

    }
}
