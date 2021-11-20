package demotywatorycopy.converter;

import demotywatorycopy.model.dao.PostEntity;
import demotywatorycopy.model.dto.post.CreatePostRequest;
import demotywatorycopy.model.dto.post.CreatePostResponse;
import org.springframework.stereotype.Service;

@Service
public class CreatePostsConverter {

    public PostEntity convertDtoToDao(CreatePostRequest requestToConvert) {
        PostEntity result = new PostEntity();
        result.setBottomText(requestToConvert.getBottomText());
        result.setTopText(requestToConvert.getTopText());
        result.setImagePath(requestToConvert.getImagePath());
        return result;
    }

    public CreatePostResponse convertDaoToDto(PostEntity postEntityToConvert) {
        CreatePostResponse result = new CreatePostResponse();
        result.setId(postEntityToConvert.getId());
        result.setBottomText(postEntityToConvert.getBottomText());
        result.setTopText(postEntityToConvert.getTopText());
        result.setImagePath(postEntityToConvert.getImagePath());
        return result;
    }


}
