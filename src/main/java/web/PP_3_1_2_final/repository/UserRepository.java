package web.PP_3_1_2_final.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import web.PP_3_1_2_final.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
