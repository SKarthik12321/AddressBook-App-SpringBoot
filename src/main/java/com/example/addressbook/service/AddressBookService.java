package com.example.addressbook.service;

import com.example.addressbook.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AddressBookService {

    private Map<Long, AddressBook> data = new HashMap<>();
    private Long idCounter = 1L;

    public AddressBook create(AddressBook entry) {
        entry.setId(idCounter++);
        data.put(entry.getId(), entry);
        return entry;
    }

    public Collection<AddressBook> getAll() {
        return data.values();
    }

    public AddressBook getById(Long id) {
        return data.get(id);
    }

    public AddressBook update(Long id, AddressBook entry) {
        entry.setId(id);
        data.put(id, entry);
        return entry;
    }

    public String delete(Long id) {
        data.remove(id);
        return "Deleted successfully";
    }
}
