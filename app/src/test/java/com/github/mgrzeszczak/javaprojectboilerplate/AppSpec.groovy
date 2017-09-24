package com.github.mgrzeszczak.javaprojectboilerplate

import spock.lang.Specification


class AppSpec extends Specification {

    def "should pass"() {
        expect:
            arg1 + arg2 == sum
        where:
            arg1 | arg2 || sum
            1    | 1     | 2
    }

}
