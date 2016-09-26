package com.mikhalechko.contacts.repository;

import com.mikhalechko.contacts.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
