package demotywatorycopy.model.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "comments")
public class CommentEntity {

    Long id;
    String text;

}
