package jdp3e.solid_principles.srp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class SeniorityChecker {
    public String checkSeniority(double experienceInYears){
        return experienceInYears > 5 ?"senior":"junior";
    }
}