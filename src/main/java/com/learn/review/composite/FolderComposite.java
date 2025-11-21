package com.learn.review.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComponent{
    private List<FileComponent> files = new ArrayList<>();

    public FolderComposite(List<FileComponent> files) {
        this.files = files;
    }
    @Override
    public void showProperty() {
        for (FileComponent f : files) {
            f.showProperty();
        }
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (FileComponent f : files) {
            total += f.totalSize();
        }
        return total;
    }
}
