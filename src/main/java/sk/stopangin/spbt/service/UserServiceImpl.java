package sk.stopangin.spbt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.stopangin.spbt.model.User;
import sk.stopangin.spbt.repository.UserRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User update(User user) {
        User update = userRepository.findById(user.getId());

        //personal info
        if (user.getLastName() != null) {
            update.setLastName(user.getLastName());
        }
        if (user.getName() != null) {
            update.setName(user.getName());
        }
        if (user.getGender() != null) {
            update.setUsername(user.getGender());
        }
        if (user.getDate() != null) {
            update.setDate(user.getDate());
        }
        if (user.getDescription() != null) {
            update.setDescription(user.getDescription());
        }
        //contact info
        if (user.getAddress()!= null) {
            update.setAddress(user.getAddress());
        }
        if (user.getCity() != null) {
            update.setCity(user.getCity());
        }
        if (user.getPhone() != null) {
            update.setPhone(user.getPhone());
        }
        if (user.getEmail() != null) {
            update.setEmail(user.getEmail());
        }
        //job info
        if (user.getPossition() != null) {
            update.setPossition(user.getPossition());
        }
        if (user.getSallary() != null) {
            update.setSallary(user.getSallary());
        }

        return userRepository.save(update);
    }

   /* @Override
    public Iterable<User> getUsers() {
        Iterable<User> users = userRepository.findAll();
        for (User user : users) {
            try {
                Date date = new SimpleDateFormat("dd//MM/yyyy").parse(user.getDate().toString());
                String newstring = new SimpleDateFormat("yyyy-MM-dd").format(date);
                user.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }

        return users;

    }*/



    /*@Override
    public User saveUser(User user) {
        user.setPhoto(imageToBinary(user.getPicturePathIn()));
        String userId =  String.valueOf(user.getId());
        String name = "D:\\photos\\"+userId+".jpg";
        user.setPicturePathOut(name);
        //Get image from database
        byte[] bAvatar = user.getPhoto();

        try{
            FileOutputStream fos = new FileOutputStream(name);
            fos.write(bAvatar);
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return userRepository.save(user);
    }

    @Override
    public byte[] imageToBinary(String path) {
        //save image into database
        File file = new File(path);
        byte[] bFile = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            //convert file into array of bytes
            fileInputStream.read(bFile);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bFile;

    }

    @Override
    public User getUser(long id) {
        User user= userRepository.findById(id);
        String userId =  String.valueOf(user.getId());
        String name = "D:\\photos\\"+userId+".jpg";
        user.setPicturePathOut(name);
        //Get image from database
        byte[] bAvatar = user.getPhoto();

       /* try{
            FileOutputStream fos = new FileOutputStream(name);
            fos.write(bAvatar);
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }*/
/*
        return user;
    }

    @Override
    public String binaryToImg(User user) {

        return null;
    } */



}
