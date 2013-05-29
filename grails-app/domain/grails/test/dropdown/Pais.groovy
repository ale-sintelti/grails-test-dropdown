package grails.test.dropdown

class Pais {
	String nombre
	static hasMany = [estados:Estado]
    static constraints = {
		nombre(blank: false)
    }
	String toString(){
		nombre
	}
}
