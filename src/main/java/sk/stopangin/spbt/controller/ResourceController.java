package sk.stopangin.spbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.stopangin.spbt.model.Resource;
import sk.stopangin.spbt.repository.ResourceRepository;


@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    ResourceRepository resourceRepository;

    //GET ALL PHOTOS
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    private Iterable<Resource> getPhotos() {
        return resourceRepository.findAll();
    }

    //CREATE NEW PHOTOS
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    private Resource createPhoto(@RequestBody Resource resource) {
        return resourceRepository.save(resource);
    }
}
