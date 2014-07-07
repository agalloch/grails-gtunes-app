package gtunes

class Song {
    String title
    String artist
    Integer duration

    static belongsTo = Album

    static constraints = {
        title blank: false
        artist blank: false
        duration min: 1
    }

    @Override
    String toString() {
        return title
    }
}
