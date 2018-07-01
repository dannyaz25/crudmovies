package com.crudmovies.entidad;

import org.springframework.web.multipart.MultipartFile;


import java.util.Date;

public class ImagenUpload {

    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }


}
