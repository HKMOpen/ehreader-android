package tw.skyarrow.ehreader.db;

import java.util.List;
import tw.skyarrow.ehreader.db.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table GALLERY.
 */
public class Gallery extends GalleryBase  {

    private Long id;
    /** Not-null value. */
    private String token;
    private String title;
    private String subtitle;
    private Integer category;
    private Integer count;
    private String thumbnail;
    private Boolean starred;
    private Float rating;
    private java.util.Date created;
    private java.util.Date lastread;
    private String tags;
    private String uploader;
    private Integer progress;
    private String showkey;
    private Long size;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient GalleryDao myDao;

    private List<Photo> photos;

    public Gallery() {
    }

    public Gallery(Long id) {
        this.id = id;
    }

    public Gallery(Long id, String token, String title, String subtitle, Integer category, Integer count, String thumbnail, Boolean starred, Float rating, java.util.Date created, java.util.Date lastread, String tags, String uploader, Integer progress, String showkey, Long size) {
        this.id = id;
        this.token = token;
        this.title = title;
        this.subtitle = subtitle;
        this.category = category;
        this.count = count;
        this.thumbnail = thumbnail;
        this.starred = starred;
        this.rating = rating;
        this.created = created;
        this.lastread = lastread;
        this.tags = tags;
        this.uploader = uploader;
        this.progress = progress;
        this.showkey = showkey;
        this.size = size;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getGalleryDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getToken() {
        return token;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setToken(String token) {
        this.token = token;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public java.util.Date getCreated() {
        return created;
    }

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    public java.util.Date getLastread() {
        return lastread;
    }

    public void setLastread(java.util.Date lastread) {
        this.lastread = lastread;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getShowkey() {
        return showkey;
    }

    public void setShowkey(String showkey) {
        this.showkey = showkey;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Photo> getPhotos() {
        if (photos == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PhotoDao targetDao = daoSession.getPhotoDao();
            List<Photo> photosNew = targetDao._queryGallery_Photos(id);
            synchronized (this) {
                if(photos == null) {
                    photos = photosNew;
                }
            }
        }
        return photos;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetPhotos() {
        photos = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}