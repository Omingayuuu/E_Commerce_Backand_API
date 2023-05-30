package com.pxp.SQLite.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxp.SQLite.demo.entity.Users;
import com.pxp.SQLite.demo.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}
	
	public Users getUserById(Integer id) {
		return usersRepository.findById(id).get();
	}
	
	@Transactional
    public Users createUser(Users user){
        try {
        	return usersRepository.save(user);
        } catch (Exception e){
            throw e;
        }
    }
	
//	@Transactional
//    public String updateUser(Users user){
//        if (usersRepository.existsById(user.getId())){
//            try {
//                Optional<Users> dataUser = usersRepository.findById(user.getId());
//                
//                Users studentToBeUpdate = usersRepository.findById(dataUser.get()).get();
//                studentToBeUpdate.setName(student.getName());
//                studentToBeUpdate.setEmail(student.getEmail());
//                studentRepository.save(studentToBeUpdate);
//                return "Student record updated.";
//            }catch (Exception e){
//                throw e;
//            }
//        }else {
//            return "Student does not exists in the database.";
//        }
//    }
}
