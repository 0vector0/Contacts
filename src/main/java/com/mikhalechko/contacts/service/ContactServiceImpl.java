package com.mikhalechko.contacts.service;

import com.mikhalechko.contacts.model.Contact;
import com.mikhalechko.contacts.repository.ContactRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
@Transactional
@Service("contactService")
public class ContactServiceImpl implements ContactService {


    private ContactRepository contactRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Contact> findAll() {
        // TODO: 26.09.2016 read about com.google.guava
//        return Lists.newArrayList(contactRepository.findAll());
        return new ArrayList((Collection) contactRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Contact findById(Long id) {
        return contactRepository.findOne(id);
    }

    @Override
    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }
}
