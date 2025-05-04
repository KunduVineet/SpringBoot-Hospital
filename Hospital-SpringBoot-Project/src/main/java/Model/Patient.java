package Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Patient")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    private int age;


}
