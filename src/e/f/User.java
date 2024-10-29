package e.f;

import lombok.Builder;
import lombok.Getter;
import lombok.Data;

@Getter
@Builder
//@Data
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}


class CreateUser {
    public static void main(String[] args) {
        User user = User.builder().firstName("杜").age(22).email("123@.com").lastName("嘉豪").build();
        System.out.println(user);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());
        System.out.println(user.getEmail());
//        user.setAge(99);
//        System.out.println(user);
    }
}