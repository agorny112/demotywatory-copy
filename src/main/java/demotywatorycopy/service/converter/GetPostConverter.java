package demotywatorycopy.service.converter;

import demotywatorycopy.model.dao.PostEntity;
import demotywatorycopy.model.dto.post.GetPostResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GetPostConverter {

    public GetPostResponse convertToDto(PostEntity postEntity) {

        GetPostResponse result = new GetPostResponse();

        result.setId(postEntity.getId());
        result.setTopText(postEntity.getTopText());
        result.setImagePath(postEntity.getImagePath());
        result.setBottomText(postEntity.getBottomText());

        return result;

    }
}
