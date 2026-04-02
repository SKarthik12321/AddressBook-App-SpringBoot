package com.example.addressbook.controller;

import com.example.addressbook.model.AddressBook;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private Map<Long, AddressBook> data = new HashMap<>();
    private Long idCounter = 1L;

    @PostMapping
    public AddressBook create(@RequestBody AddressBook entry) {
        entry.setId(idCounter++);
        data.put(entry.getId(), entry);
        return entry;
    }

    @GetMapping
    public Collection<AddressBook> getAll() {
        return data.values();
    }

    @GetMapping("/{id}")
    public AddressBook getById(@PathVariable Long id) {
        return data.get(id);
    }

    @PutMapping("/{id}")
    public AddressBook update(@PathVariable Long id, @RequestBody AddressBook entry) {
        entry.setId(id);
        data.put(id, entry);
        return entry;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        data.remove(id);
        return "Deleted successfully";
    }
}