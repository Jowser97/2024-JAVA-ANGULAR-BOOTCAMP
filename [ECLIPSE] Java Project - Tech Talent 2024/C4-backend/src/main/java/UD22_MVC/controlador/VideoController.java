package UD22_MVC.controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import UD22_MVC.modelo.Video;

public class VideoController {
    public void addVideo(Video video) {
        video.addVideo();
    }

    public List<Video> getAllVideos() {
        return Video.getAllVideos();
    }

    public Video getVideoById(int id) {
        return Video.getVideoById(id);
    }

    public void updateVideo(Video video) {
        video.updateVideo();
    }

    public void deleteVideo(int id) {
        Video.deleteVideo(id);
    }
    
    public List<Integer> getAllVideoIds() {
        return Video.getAllVideoIds();
    }
}