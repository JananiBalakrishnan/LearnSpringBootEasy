package com.lotus.development.LearnSpringBootEasy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jbalakr on 6/11/18.
 */

@RestController
public class ItemController {

    @GetMapping("/item")
    public Item itemInfo(){
        return new Item("sampleProduct1","testItem",632001);
    }

    @GetMapping("/itemlist")
    public List<Item> itemListInfo(){
        return Arrays.asList(new Item("sampleProduct1","testItem1",632001),
                new Item("sampleProduct5","testItem5",632005));
    }


    @GetMapping("/itemWithImages")
    public Item itemInfoWithImages(){

        return new Item(Arrays.asList(new ImageDTO("http://i.walmartimages.com/i/p/11/13/04/29/58/1113042958874_500X500.jpg","500*500",
                Arrays.asList(new Department(123,"testDept"),new Department(456,"testDept")))),
               "sampleProduct1",
               "testItem",
                632001);
    }

    @GetMapping("/itemListWithImages")
    public List<Item> itemListInfoWithImages(){

        return Arrays.asList(
                new Item(Arrays.asList(new ImageDTO("http://i.walmartimages.com/i/p/11/13/04/29/58/1113042958874_500X500.jpg","500*500",
                Arrays.asList(new Department(123,"testDept"),new Department(456,"testDept")))),
                "sampleProduct1",
                "testItem",
                632001),
                new Item(Arrays.asList(new ImageDTO("http://i.walmartimages.com/i/p/11/13/04/29/58/1113042958874_500X500.jpg","500*500",
                        Arrays.asList(new Department(123,"testDept"),new Department(456,"testDept5")))),
                        "sampleProduct5",
                        "testItem",
                        632005));

    }

    /*
    Structure : Item -> ProductId,ItemName,ItemId,ImageList
                ImageDTO --> Image Url,ImageSize,DepartmentList
                Department --> DeptId, DeptName
     */
}
