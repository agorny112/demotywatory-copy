package demotywatorycopy.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "posts")
@Data
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "post_name")
    private String topText;

    @NotNull(message = "musisz podać opis obrazka")
    @Column(name = "post_description")
    private String bottomText;

    @NotNull(message = "musisz podać ścieżkę do obrazka")
    @Column(name = "image_path")
    private String imagePath;


}
