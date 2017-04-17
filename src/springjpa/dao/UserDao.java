package springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import springjpa.model.UserModel;

//@Component
public interface UserDao  extends JpaRepository<UserModel, Long>{

}
