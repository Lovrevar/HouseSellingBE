package com.group5.model;

import com.group5.proto.Listing.ImageFileMessage;

import java.util.ArrayList;
import java.util.List;

public class ImageFile {
    public String base64data;
    public String fileName;
    public String contentType;

    public ImageFile(String base64data, String fileName, String contentType) {
        this.base64data = base64data;
        this.fileName = fileName;
        this.contentType = contentType;
    }

    public static List<ImageFile> fromGrpc(List<ImageFileMessage> imagemessages) {
        List<ImageFile> images=new ArrayList<>();
        for (ImageFileMessage image:imagemessages)
        {
            images.add(new ImageFile(image.getImageBase64Data(), image.getImageFileName(), image.getImageContentType()));
        }
        return images;
    }

    public String getBase64data() {
        return base64data;
    }

    public String getFileName() {
        return fileName;
    }

    public String getContentType() {
        return contentType;
    }

}
