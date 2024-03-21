public class Transcript {

        public static void main(String[] args) {
            String name = "Hamza Nizamani";
            String rollnum = "SE231027";
            int pfmarks = 98;
            int pflabmarks = 96;
            int APmarks = 95;
            int english = 91;
            int calculus = 89;
            int total = pflabmarks + pflabmarks + APmarks + english + calculus;
            int Percentage = (total * 100) / 500;
    
            double cpga = Percentage / 25;
    
            System.out.println("\t\t\t\t\t-----------------------");
            System.out.println("\t\t\t\t\t DHA SUFFA UNIVERSITY");
            System.out.println("\t\t\t\t\t-----------------------");
            System.out.println("\t\t\t\t\t\tTranscript");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Name = " + name + "\t\t\t\t\t\t\tRoll no. = "+ rollnum);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Subject \t\t\t\t\t\t\t\t\t\t\t\t\tMarks");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Programming Fundamentals \t\t\t\t\t\t\t\t\t "+ pfmarks);
            System.out.println("Programming Fundamentals Lab \t\t\t\t\t\t\t\t "+ pflabmarks);
            System.out.println("Applied Physics \t\t\t\t\t\t\t\t\t\t\t "+ APmarks);
            System.out.println("English \t\t\t\t\t\t\t\t\t\t\t\t\t "+ english);
            System.out.println("Calculus \t\t\t\t\t\t\t\t\t\t\t\t\t "+ calculus);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Percentage =\t\t\t\t\t\t\t\t\t\t\t\t "+ Percentage + "%");
            System.out.println("CGPA =\t\t\t\t\t\t\t\t\t\t\t\t\t\t "+ cpga);
        }
    }
    
