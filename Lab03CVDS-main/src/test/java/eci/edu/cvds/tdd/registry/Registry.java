package eci.edu.cvds.tdd.registry;

import java.util.HashSet;
import java.util.Set;

public class Registry {
    private final Set<Integer> registeredIds;

    public Registry(){
        this.registeredIds =new HashSet<>();
    }
    public RegisterResult registerVoter(Person p) {

        if(p.getName() == null || p.getName().isEmpty()){
            return RegisterResult.INVALID_NAME;
        }
        if(p.getId() <= 0){
            return RegisterResult.INVALID_ID;
        }
        if(!p.isAlive()){
            return RegisterResult.DEAD;
        }
        if (p.getAge() <= 18){
            return RegisterResult.UNDERAGE;
        }
        if(p.getAge() <=0 || p.getAge() >130){
            return RegisterResult.INVALID_AGE;
        }
        if(p.getGender() == null){
            return RegisterResult.INVALID_GENDER;
        }
        if(registeredIds.contains(p.getId())){
            return RegisterResult.DUPLICATED;
        }
        registeredIds.add(p.getId());
        return RegisterResult.VALID;
    }
}
