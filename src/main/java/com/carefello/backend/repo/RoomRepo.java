package com.carefello.backend.repo;

import com.carefello.backend.model.Employee;
import com.carefello.backend.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface RoomRepo extends JpaRepository<Room, Integer> {
    Room findBytype(String roomType);
}
