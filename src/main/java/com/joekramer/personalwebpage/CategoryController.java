package com.joekramer.personalwebpage;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    private List<Category> categories = new ArrayList<>();

    CategoryController() {
        this.categories = buildCategories();
    }

    //get all categories
    @RequestMapping(method = RequestMethod.GET)
    public List<Category> getCategories() {
        return this.categories;
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Category getUser(@PathVariable("id") Long id) {
//        return this.users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
//    }





    List<Category> buildCategories() {
        List<Category> categories = new ArrayList<>();

        Category category1 = new Category(1, "Name1");
        Category category2 = new Category(2, "Name2");
        Category category3 = new Category(3, "Name3");
        Category category4 = new Category(4, "Name4");
        Category category5 = new Category(5, "Name5");

        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        categories.add(category5);

        return categories;

    }
}
