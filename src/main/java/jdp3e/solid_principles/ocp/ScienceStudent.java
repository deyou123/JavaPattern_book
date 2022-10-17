package jdp3e.solid_principles.ocp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class ScienceStudent extends Student{
    public ScienceStudent(String name,
                          String regNumber,
                          double score,
                          String dept) {
        super(name, regNumber, score);
        this.department = dept;
    } }