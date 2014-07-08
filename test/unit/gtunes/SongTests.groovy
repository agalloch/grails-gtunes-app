package gtunes


import grails.test.mixin.*
import org.junit.Assert.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Song)
class SongTests {

    void testMinimumDuration() {
        mockForConstraintsTests(Song)

        def song = new Song(title: 'Test Title',
                            artist: 'Test Artist',
                            duration: 0)

        assertFalse('failed validation passed', song.validate())
        assertEquals('duration is wrong', 'min', song.errors['duration'])
    }
}
