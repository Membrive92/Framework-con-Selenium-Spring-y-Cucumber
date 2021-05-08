package framework.Builders.data;

import framework.Models.User;
import framework.enums.Gender;
import framework.util.RandomNumberGenerator;

public class UserBuilder {

    private User user;

    private UserBuilder(){
        user = User.builder().build();
    }

    public static UserBuilder anUser(){
        return new UserBuilder();
    }

    public UserBuilder but(){
        return withDefaultInfo();
    }

    public UserBuilder withDefaultInfo(){
        this.user = User.builder()
                .firstName("Jose")
                .lastName("Mem")
                .email("test@test.com")
                .gender(Gender.female)
                .country("Spain")
                .birthDay("13")
                .birthMonth("February")
                .birthYear("1992")
                .phone(RandomNumberGenerator.get())
                .password("A_x?a1992")
                .passwordConfirmation("A_x?a1992").build();
        return this;
    }
    public UserBuilder withoutEmail(){
        user.setEmail("");

        return this;
    }

    /* In Progress
    public UserBuilder withoutAnyData(int fieldIndex, String data ){
        but().user.setEmail("");

        switch (fieldIndex){
            case 1: but().user.setFirstName(data);
                    break;
            case 2: but().user.setLastName(data);
                break;
            case 3:but().user.setEmail(data);
                break;
            case 4:but().user.setGender(data);
                break;
            case 5:but().user.setCountry(data);
                break;
            case 6:but().user.setBirthDay(data);
                break;
            case 7:but().user.setBirthMonth(data);
                break;
            case 8:but().user.setBirthYear(data);
                break;
            case 9:but().user.setPhone(data);
                break;
            case 10:but().user.setPassword(data);
                break;
            case 11:but().user.setPasswordConfirmation(data);
                break;

        }

        return this;
    } */

    public User build(){
        return this.user;
    }
}
