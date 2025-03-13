package ss6_method;

public class Main7 {
    public static void main(String[] args) {

    }
    public String xepLoai(double score){
        if(score < 0||score>10){
            return "điểm không hợp le";
        }
        if(score<5){
            return "Yếu";
        }
        if(score<7){
            return "Trung bình";
        }
        return "giỏi";
    }
}
