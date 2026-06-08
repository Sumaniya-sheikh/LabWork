package week6;


interface University {

    void uni();    
   
}

interface Department {

    void dept(); 
}

class Classes implements University, Department {

    @Override
    public void uni() {
        System.out.println("This is from the Interface University class");
    }


    @Override
    public void dept() {
        System.out.println("This is from the Interface Department class");
    }
}

public class MultiInheritance {

    public static void main(String args[]) {

        Classes c = new Classes();

        c.uni();
        c.dept();
    }
}