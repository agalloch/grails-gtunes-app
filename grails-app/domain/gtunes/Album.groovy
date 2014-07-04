package gtunes

class Album {
    String title

    static hasMany = [songs: Song]
}
