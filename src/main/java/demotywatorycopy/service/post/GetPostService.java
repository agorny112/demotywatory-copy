package demotywatorycopy.service.post;

import demotywatorycopy.converter.CreatePostsConverter;
import demotywatorycopy.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GetPostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CreatePostsConverter createPostsConverter;


}
