package jdp3e.solid_principles.ocp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class ArtsDistinctionDecider implements DistinctionDecider{
    @Override
    public void evaluateDistinction(Student student) {
        if (student.score > 70) {
            System.out.println(student.regNumber+" has received a distinction in arts.");
        }
    } }