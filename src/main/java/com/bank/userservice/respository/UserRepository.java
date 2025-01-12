package com.bank.userservice.respository;

import com.bank.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

  public List<User> findByUserName(String userName);

  //jpql query where it is taking 1st param and fetching values
  @Query("SELECT u FROM user u WHERE u.email = ?1")
  public User getUserByEmail(String email);

  public boolean existsByEmail(String email);

  public boolean existsByUserName(String userName);
  public boolean existsByPhoneNumber(String phoneNumber);
}
