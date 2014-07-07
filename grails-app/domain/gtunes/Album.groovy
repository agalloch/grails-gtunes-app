package gtunes

class Album {
    String title
    Date yearReleased

    static hasMany = [songs: Song]
    static belongsTo = [artist: Artist]

    static mapping = {
        songs cascade: 'delete'
    }

    @Override
    String toString() {
        return title
    }
}
