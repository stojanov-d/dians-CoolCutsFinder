package dians.coolcutsfinder.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ccf_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String phoneNumber;
    private String age;
    private String name;
    private String surname;
}
