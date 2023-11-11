package ru.etozhealexis.itprojects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.etozhealexis.itprojects.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    @Modifying
////    @Query("UPDATE WHERE User.userName = :userName")
//    void update(@Param("userName") String userName);
}
