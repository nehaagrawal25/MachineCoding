public class Review {
    Integer id;
    Integer userId;
    String comment;
    Integer rating;

    public Review(Integer id, Integer userId, String name, Integer rating, String comment) {
        this.id = id;
        this.userId = userId;
        this.comment = comment;
        this.rating = rating;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
