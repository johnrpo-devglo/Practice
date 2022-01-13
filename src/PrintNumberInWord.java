public class PrintNumberInWord {

    public static void main(String[] args) {

        int num = 6;

        if(num == 1){
            System.out.println("soy el numero 1");
        } else if (num == 2){
            System.out.println("soy el numero 2");
        } else if (num == 3){
            System.out.println("soy el numero 3");
        } else {
            System.out.println("Ingrese un numero Válido");
        }
        System.out.println("\n");

        switch (num){
            case 1:
                System.out.println("soy el 1");
                break;
            case 2:
                System.out.println("soy el 2");
                break;
            case 3:
                System.out.println("soy el 3");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}
