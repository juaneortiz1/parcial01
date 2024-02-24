package eci.edu.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
    private final Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person();
        person.setAlive(true);
        person.setAge(20);
        person.setName("Juan");
        person.setId(654987);
        person.setGender(Gender.MALE);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void validateAlive() {
        Person person = new Person();
        person.setAlive(false);
        person.setAge(20);
        person.setName("Juan");
        person.setId(654987);
        person.setGender(Gender.MALE);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    @Test
    public void validateEmptyName() {
        Person person = new Person();
        person.setAlive(true);
        person.setAge(20);
        person.setName("");
        person.setId(321654);
        person.setGender(Gender.MALE);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_NAME, result);
    }

    @Test
    public void validateId(){
        Person person =  new Person();
        person.setAlive(true);
        person.setAge(20);
        person.setName("Juan");
        person.setId(0);
        person.setGender(Gender.MALE);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_ID, result);
    }

    @Test
    public void DuplicatedId(){
        Person person1 =  new Person();
        person1.setAge(20);
        person1.setAlive(true);
        person1.setName("Juan");
        person1.setId(321321);
        person1.setGender(Gender.MALE);

        RegisterResult result = registry.registerVoter(person1);

        RegisterResult result1 = registry.registerVoter(person1);

        Assert.assertEquals(RegisterResult.DUPLICATED, result1);
    }


    @Test
    public void validateUnderAge(){
        Person person =  new Person();
        person.setAlive(true);
        person.setAge(0);
        person.setName("Juan");
        person.setId(321564);
        person.setGender(Gender.MALE);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateOverAge(){
        Person person =  new Person();
        person.setAlive(true);
        person.setAge(140);
        person.setName("Juan");
        person.setId(15615649);
        person.setGender(Gender.MALE);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateGender(){
        Person person =  new Person();
        person.setAlive(true);
        person.setAge(100);
        person.setName("Juan");
        person.setId(15615649);
        person.setGender(null);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_GENDER, result);
    }

}