package Lab7;

public class PolyStudent {

    public enum Career {
        UDPM, TKTW, LTDĐ, TKĐH
    }

    public String fullname;
    public Career career;

    public void print() {
        System.out.println(">Fullname: " + this.fullname);
        switch (this.career) {
            case UDPM:
                System.out.println(">Career: Ứng dụng phần mềm");
                break;
            case TKTW:
                System.out.println(">Career: Thiết kế trang web");
                break;

            case LTDĐ:
                System.out.println(">Career: Lập trình di động");
                break;
            case TKĐH:
                System.out.println(">Career: Thiết kế đồ họa");
                break;
        }
    }

    public static void main(String[] args) {
        PolyStudent sv = new PolyStudent();
        sv.fullname = "Nguyễn Văn Tèo";
        //sv.career = Career.UDPM;
        sv.career = Career.valueOf("TKĐH");

        sv.print();
    }

}
