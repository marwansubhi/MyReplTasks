package Repl.Tasks12;

public class LawSchool extends EducationalInstitution {
     LawSchool(){
        super(3);
    }

    @Override
    public String graduationRequirements() {
        return super.graduationRequirements()+" and passing the bar";
    }

}
class LawSchoolObject{
    public static void main(String[] args) {
        LawSchool a = new LawSchool();
        System.out.println(a.graduationRequirements());
    }
}

