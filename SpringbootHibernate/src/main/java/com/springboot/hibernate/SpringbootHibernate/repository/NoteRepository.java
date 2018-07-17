package com.springboot.hibernate.SpringbootHibernate.repository;

import com.springboot.hibernate.SpringbootHibernate.Model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
