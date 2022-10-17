package jdp3e.solid_principles.ocp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
public class ArtsStudent extends Student{
    public ArtsStudent(String name,
                       String regNumber,
                       double score,
                       String dept) {
        super(name, regNumber, score);
        this.department = dept;
    } }