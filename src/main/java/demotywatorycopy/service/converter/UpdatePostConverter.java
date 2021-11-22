package demotywatorycopy.service.converter;

import demotywatorycopy.model.dao.PostEntity;
import demotywatorycopy.model.dto.post.UpdatePostResponse;
import org.springframework.stereotype.Service;

@Service
public class UpdatePostConverter {


    public UpdatePostResponse convertDaoToDto(PostEntity postEntityToConvert) {

        UpdatePostResponse result = new UpdatePostResponse();
        result.setId(postEntityToConvert.getId());
        result.setBottomText(postEntityToConvert.getBottomText());
        result.setTopText(postEntityToConvert.getTopText());
        result.setImagePath(postEntityToConvert.getImagePath());

        return result;
    }

}
