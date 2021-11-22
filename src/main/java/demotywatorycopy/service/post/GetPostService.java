package demotywatorycopy.service.post;

import demotywatorycopy.model.dao.PostEntity;
import demotywatorycopy.model.dto.post.GetAllPostsResponse;
import demotywatorycopy.model.dto.post.GetPostResponse;
import demotywatorycopy.repository.PostRepository;
import demotywatorycopy.service.converter.GetPostConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GetPostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private GetPostConverter getPostConverter;

    public GetPostResponse getById(Long id) {

        PostEntity retrievedPost = postRepository.findById(id).orElseThrow();
        return getPostConverter.convertToDto(retrievedPost);
    }

    public GetAllPostsResponse getAllPosts(){
        GetAllPostsResponse result = new GetAllPostsResponse();

        result.setPosts(postRepository.findAll()
                .stream().map(postEntity -> getPostConverter.convertToDto(postEntity))
                .collect(Collectors.toList()));

        return result;
    }


}
