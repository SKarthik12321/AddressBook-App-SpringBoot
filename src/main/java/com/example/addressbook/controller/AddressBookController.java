package com.example.addressbook.controller;

import com.example.addressbook.model.AddressBook;
import com.example.addressbook.service.AddressBookService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private final AddressBookService service;

    public AddressBookController(AddressBookService service) {
        this.service = service;
    }

    @PostMapping
    public AddressBook create(@RequestBody AddressBook entry) {
        return service.create(entry);
    }

    @GetMapping
    public Collection<AddressBook> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AddressBook getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public AddressBook update(@PathVariable Long id, @RequestBody AddressBook entry) {
        return service.update(id, entry);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }
}