package demotywatorycopy.repository;

import demotywatorycopy.model.dao.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {

    //    Optional<PostEntity> findByID(Long postId);
//    List<PostEntity> findByDescription(String postDescription);
//    List<PostEntity> findByName(String postName);
}

