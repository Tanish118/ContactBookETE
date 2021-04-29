package com.ETE_Backend_wala.ContactCreater.service;

import com.ETE_Backend_wala.ContactCreater.CreatingTable.User;
import com.ETE_Backend_wala.ContactCreater.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  {


    @Autowired
    public Userrepo userrepo;

    public boolean adduser(User user)
    {

        if(this.userrepo.existsById(user.getEmail())){
            return false;
        }
        else{
            try {
                this.userrepo.save(user);
            }
            catch (Exception e)
            {
                return false;
            }
            return true;
        }

    }
    public List<User> getallusers()
    {
//        List<User> userlist=userrepo.findAll();
//
        return (List<User>) this.userrepo.findAll();
    }

    public void deleteuser(String email)
    {
         this.userrepo.deleteById(email);
    }

    public void update(User user)
    {
            this.userrepo.save(user);


    }
}

