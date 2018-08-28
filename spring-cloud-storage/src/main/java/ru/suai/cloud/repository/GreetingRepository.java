package ru.suai.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.suai.cloud.model.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
