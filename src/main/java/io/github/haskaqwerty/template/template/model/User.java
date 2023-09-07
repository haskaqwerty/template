package io.github.haskaqwerty.template.template.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String name;
    private String email;
    private String phone;

}
