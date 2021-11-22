package demotywatorycopy.controller;

import demotywatorycopy.model.dto.post.*;
import demotywatorycopy.service.post.CreatePostService;
import demotywatorycopy.service.post.GetPostService;
import demotywatorycopy.service.post.UpdatePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/posts")
public class PostController {

    @Autowired
    private CreatePostService createPostService;
    @Autowired
    private GetPostService getPostService;
    @Autowired
    private UpdatePostService updatePostService;

    @PostMapping
    public ResponseEntity<CreatePostResponse> createNewPost(@Valid @RequestBody CreatePostRequest postToAdd) {
        return new ResponseEntity<CreatePostResponse>(createPostService.addPost(postToAdd),HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<GetPostResponse> getByID(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<GetPostResponse>(getPostService.getById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GetAllPostsResponse> getAllPosts(){
        return new ResponseEntity<>(getPostService.getAllPosts(),HttpStatus.OK);

    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<UpdatePostResponse> updatePost(@Valid @RequestBody UpdatePostRequest postToUpdate,@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(updatePostService.updatePost(postToUpdate,id),HttpStatus.OK);
    }





}
