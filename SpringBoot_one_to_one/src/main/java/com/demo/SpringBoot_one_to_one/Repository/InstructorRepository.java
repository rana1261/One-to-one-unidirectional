package com.demo.SpringBoot_one_to_one.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBoot_one_to_one.model.Instructor;
@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
