package com.github.pacey

import spock.lang.Specification
import spock.lang.Unroll

class SampleTest extends Specification {
    
    @Unroll
    def "should double #input to #output with a where table"() {
        given:
        def sample = new Sample(input)
        
        when:
        def result = sample.doubleNumber()
        
        then:
        result == output
        
        where:
        input   || output
        1       || 2
        3       || 6
        -2      || -4
    }

    @Unroll
    def "should double #input to #output with a with block()"() {
        given:
        def sample = new Sample(input)

        when:
        def result = sample.doubleNumber()

        then:
        with(result) {
            it == output
        }

        where:
        input   || output
        1       || 2
        3       || 6
        -2      || -4
    }
}
