package com.anilduyguc.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("anilduyguc-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
