package com.example.pr6_secondmicroservice.Repositories;

import com.example.pr6_secondmicroservice.Models.Appeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppealRepository extends JpaRepository<Appeal, Long> {

}
