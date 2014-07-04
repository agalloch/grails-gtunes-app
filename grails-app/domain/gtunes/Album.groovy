package gtunes

class Album {
    String title
    Date yearReleased

    static hasMany = [songs: Song]

    @Override
    String toString() {
        return title
    }
}
