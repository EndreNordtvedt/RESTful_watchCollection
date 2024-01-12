package com.watch.watchcollection.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.watch.watchcollection.Entity.watches;
import com.watch.watchcollection.Repository.watchesRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ssl.SslProperties.Bundles.Watch;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class watchController {

    @Autowired
    watchesRepository repo;

    // Get all watches
    @GetMapping("/watches")
    public List<watches> getAllWatches() {
        List<watches> all = repo.findAll();
        return all;
    }

    // Get watch by id
    @GetMapping("/watches/{id}")
    public watches getWatchById(@PathVariable int id) {
        watches wanted = repo.findById(id).get();
        return wanted;
    }

    // Add new watch to the collection
    @PostMapping("/watches/add")
    @ResponseStatus(code = HttpStatus.CREATED) // Dette gir status 201 = Created og ikke 200 = Ok som er default
    public void addWatch(@RequestBody watches watch) {
        repo.save(watch);
    }

    // Update a watch in the collection
    @PutMapping("/watches/update/{id}")
    public void updateWatch(@PathVariable int id, @RequestBody watches updatedWatch) {
        watches existing = repo.findById(id).get();
        // Update only the non-null fields
        if (updatedWatch.getBrand() != null)
            existing.setBrand(updatedWatch.getBrand());
        if (updatedWatch.getName() != null)
            existing.setName(updatedWatch.getName());
        if (updatedWatch.getPrice() != 0)
            existing.setPrice(updatedWatch.getPrice());
        if (updatedWatch.getYear() != 0)
            existing.setYear(updatedWatch.getYear());

        // Save the updated watch
        repo.save(existing);
    }

    // Delete a watch from the collection
    @DeleteMapping("/watches/delete/{id}")
    public void deleteWatch(@PathVariable int id) {
        watches wanted = repo.findById(id).get();
        repo.delete(wanted);
    }
}
