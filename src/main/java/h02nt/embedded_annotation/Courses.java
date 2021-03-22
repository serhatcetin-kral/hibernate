package h02nt.embedded_annotation;

import javax.persistence.Embeddable;

@Embeddable
public class Courses {

private String electives;	
private String mandatory;





String getElectives() {
	return electives;
}
void setElectives(String electives) {
	this.electives = electives;
}
String getMandatory() {
	return mandatory;
}
void setMandatory(String mandatory) {
	this.mandatory = mandatory;
}
@Override
public String toString() {
	return "Courses [electives=" + electives + ", mandatory=" + mandatory + "]";
}

	
	
}
