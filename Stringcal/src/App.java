
public class App {
    public static void main(String[] args) {

    }
    public int Add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        else{
            String[] num = numbers.split(",");
            if(num.length==1){
                return Integer.parseInt(numbers);
            }
            else{
                return(Integer.parseInt(num[0])+Integer.parseInt(num[1]));
            }
        }
    }
}
