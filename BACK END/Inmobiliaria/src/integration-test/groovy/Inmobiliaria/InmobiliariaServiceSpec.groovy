package Inmobiliaria

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class InmobiliariaServiceSpec extends Specification {

    InmobiliariaService inmobiliariaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Inmobiliaria(...).save(flush: true, failOnError: true)
        //new Inmobiliaria(...).save(flush: true, failOnError: true)
        //Inmobiliaria inmobiliaria = new Inmobiliaria(...).save(flush: true, failOnError: true)
        //new Inmobiliaria(...).save(flush: true, failOnError: true)
        //new Inmobiliaria(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //inmobiliaria.id
    }

    void "test get"() {
        setupData()

        expect:
        inmobiliariaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Inmobiliaria> inmobiliariaList = inmobiliariaService.list(max: 2, offset: 2)

        then:
        inmobiliariaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        inmobiliariaService.count() == 5
    }

    void "test delete"() {
        Long inmobiliariaId = setupData()

        expect:
        inmobiliariaService.count() == 5

        when:
        inmobiliariaService.delete(inmobiliariaId)
        sessionFactory.currentSession.flush()

        then:
        inmobiliariaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Inmobiliaria inmobiliaria = new Inmobiliaria()
        inmobiliariaService.save(inmobiliaria)

        then:
        inmobiliaria.id != null
    }
}
