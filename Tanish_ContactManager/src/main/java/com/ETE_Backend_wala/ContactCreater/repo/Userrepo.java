package com.ETE_Backend_wala.ContactCreater.repo;

import com.ETE_Backend_wala.ContactCreater.CreatingTable.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepo extends JpaRepository<User,String> {

}
