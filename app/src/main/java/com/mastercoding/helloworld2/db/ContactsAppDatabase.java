package com.mastercoding.helloworld2.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.mastercoding.helloworld2.db.entity.Contact;
import com.mastercoding.helloworld2.db.entity.ContactDAO;

@Database(entities = {Contact.class},version =1)
public abstract class ContactsAppDatabase extends RoomDatabase {

    //Linking the DAO with ourr database
    public abstract ContactDAO getContactDAO();
}
