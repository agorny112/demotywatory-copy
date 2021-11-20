package demotywatorycopy.service.post;

import demotywatorycopy.model.dao.PostEntity;
import demotywatorycopy.model.dto.post.GetPostResponse;
import demotywatorycopy.repository.PostRepository;
import demotywatorycopy.service.converter.GetPostConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class GetPostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private GetPostConverter getPostConverter;

    public ResponseEntity<GetPostResponse> getById(Long id) {

        PostEntity retrievedPost = postRepository.findById(id).orElseThrow();
        return getPostConverter.convertToDto(retrievedPost);
    }
}
