package demotywatorycopy.service.post;

import demotywatorycopy.model.dto.post.CreatePostRequest;
import demotywatorycopy.model.dto.post.CreatePostResponse;
import demotywatorycopy.repository.PostRepository;
import demotywatorycopy.service.converter.CreatePostsConverter;
import demotywatorycopy.model.dao.PostEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CreatePostsConverter createPostsConverter;

    public CreatePostResponse addPost(CreatePostRequest postRequest) {
        PostEntity toSave = createPostsConverter.convertDtoToDao(postRequest);
        PostEntity savedPostEntity = postRepository.save(toSave);
        return createPostsConverter.convertDaoToDto(savedPostEntity);
    }
}