package com.travellerapp.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Traveller")
public class Traveller {

    public Traveller() {

    }

    @Id
    private ObjectId _id;
    
    private String firstName;
    private String lastName;
    private String email;

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Traveller [id=" + _id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
    }
}
