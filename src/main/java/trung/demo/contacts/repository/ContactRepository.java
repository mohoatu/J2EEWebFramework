package trung.demo.contacts.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import trung.demo.contacts.model.Contact;

@Repository
public interface ContactRepository extends
		PagingAndSortingRepository<Contact, Integer> {
	Page<Contact> findByNameLike(Pageable pageable, String name);
}