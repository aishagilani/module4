class Doctor {
    String consultationFee() {
        return "General doctor fee: 500";
    }
}
class Dentist extends Doctor {
    String consultationFee() {
        return "Dentist fee: 600";
    }
}
class Cardiologist extends Doctor {
    String consultationFee() {
        return "Cardiologist fee: 1500";
    }
}
class Surgeon extends Doctor {
    String consultationFee() {
        return "Surgeon fee: 2500";
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(new Doctor().consultationFee());
        System.out.println(new Dentist().consultationFee());
        System.out.println(new Cardiologist().consultationFee());
        System.out.println(new Surgeon().consultationFee());
    }
}
