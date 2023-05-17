public class Exemplo {
    public static int main(String[] args) {

        exemplo(5);
        System.out.println(exemplo(5));
        return 0;
    }

    static int exemplo(int pos){
        if (pos ==1){
            return 0;
        } else if (pos==2) {
            return 1;
        }else {
            return (exemplo(pos-1) + exemplo(pos -2));
        }
    }
}
