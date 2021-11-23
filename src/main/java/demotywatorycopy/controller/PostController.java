package demotywatorycopy.controller;

import demotywatorycopy.model.dto.post.*;
import demotywatorycopy.service.post.CreatePostService;
import demotywatorycopy.service.post.DeletePostService;
import demotywatorycopy.service.post.GetPostService;
import demotywatorycopy.service.post.UpdatePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/posts")
public class PostController {

    @Autowired
    private CreatePostService createPostService;
    @Autowired
    private GetPostService getPostService;
    @Autowired
    private UpdatePostService updatePostService;
    @Autowired
    private DeletePostService deletePostService;

    @PostMapping
    public ResponseEntity<CreatePostResponse> createNewPost(@Valid @RequestBody CreatePostRequest postToAdd) {
        return new ResponseEntity<>(createPostService.addPost(postToAdd),HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<GetPostResponse> getByID(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(getPostService.getById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GetAllPostsResponse> getAllPosts(){
        return new ResponseEntity<>(getPostService.getAllPosts(),HttpStatus.OK);

    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<UpdatePostResponse> updatePost(@Valid @RequestBody UpdatePostRequest postToUpdate,@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(updatePostService.updatePost(postToUpdate,id),HttpStatus.OK);
    }
    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable(name = "id") Long id){
        deletePostService.deletePost(id);
    }





}
