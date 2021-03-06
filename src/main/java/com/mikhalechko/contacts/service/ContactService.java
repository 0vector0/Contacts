package com.mikhalechko.contacts.service;

import com.mikhalechko.contacts.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
}
