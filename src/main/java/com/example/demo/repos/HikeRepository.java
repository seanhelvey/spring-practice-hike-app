package com.example.demo.repos;

import com.example.demo.models.Hike;
import org.springframework.data.repository.CrudRepository;

public interface HikeRepository extends CrudRepository<Hike, Long> {
    Iterable<Hike> findByName(String name);
}
