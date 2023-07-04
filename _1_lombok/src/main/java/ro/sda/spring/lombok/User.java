package ro.sda.spring.lombok;

import lombok.*;

// @Data --> is a shortcut for @ToString, @EqualsAndHashCode, @Getter and @Setter
@EqualsAndHashCode
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastname;
    private int age;


}
