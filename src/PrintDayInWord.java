public class PrintDayInWord {

    public static void main(String[] args) {

        int diaSemana = 7;

        if (diaSemana == 1){
            System.out.println("Today is Monday");
        } else if(diaSemana == 2){
            System.out.println("Today is Tuesday");
        } else if(diaSemana == 3){
            System.out.println("Today is Wednesday");
        } else if(diaSemana == 4){
            System.out.println("Today is Thurday");
        } else if(diaSemana == 5){
            System.out.println("Today is Friday");
        } else if(diaSemana == 6){
            System.out.println("Today is Saturday");
        } else if(diaSemana == 7){
            System.out.println("Today is Sunday");
        } else {
            System.out.println("dia no encontrado, ingrese otro valor");
        }

        System.out.println("\n");

        switch (diaSemana){
            case 1:
                System.out.println("Today is Lunes");
                break;
            case 2:
                System.out.println("Today is Martes");
                break;
            case 3:
                System.out.println("Today is Miercoles");
                break;
            case 4:
                System.out.println("Today is Jueves");
                break;
            case 5:
                System.out.println("Today is Viernes");
                break;
            case 6:
                System.out.println("Today is Sabado");
                break;
            case 7:
                System.out.println("Today is Domingo");
                break;
            default:
                System.out.println("Dia de la semana no válido");
        }
    }
}
