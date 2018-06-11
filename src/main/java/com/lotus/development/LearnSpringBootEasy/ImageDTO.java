package com.lotus.development.LearnSpringBootEasy;

import java.util.List;

/**
 * Created by jbalakr on 6/11/18.
 */
public class ImageDTO {

    public ImageDTO(String imageUrl, String imageSize, List<Department> departmentName) {
        this.imageUrl = imageUrl;
        this.imageSize = imageSize;
        this.departmentName = departmentName;
    }

    private String imageUrl;

    private String imageSize;

    private List<Department> departmentName;

    public List<Department> getDepartmentName() {
        return departmentName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getImageSize() {
        return imageSize;
    }


}
