package demotywatorycopy.service.post;

import demotywatorycopy.model.dao.PostEntity;
import demotywatorycopy.model.dto.post.UpdatePostRequest;
import demotywatorycopy.model.dto.post.UpdatePostResponse;
import demotywatorycopy.repository.PostRepository;
import demotywatorycopy.service.converter.UpdatePostConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdatePostService {

    @Autowired
    PostRepository postRepository;
    @Autowired
    UpdatePostConverter updatePostConverter;


    public UpdatePostResponse updatePost(UpdatePostRequest updatePostRequest,Long id) {

        PostEntity toChange = postRepository.findById(id).orElseThrow(RuntimeException::new);
        toChange.setTopText(updatePostRequest.getTopText());
        toChange.setImagePath(updatePostRequest.getImagePath());
        toChange.setBottomText(updatePostRequest.getBottomText());
        postRepository.save(toChange);

        return updatePostConverter.convertDaoToDto(toChange);
    }

}
