package gtunes

import grails.test.mixin.TestFor

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(StoreController)
class StoreControllerTests {

    void testSomething() {
        controller.index()
       assert 'Welcome home, mother-puncher!' == response.text
    }
}
