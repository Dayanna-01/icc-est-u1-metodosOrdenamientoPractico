public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        view.showMenu();

        int[] numeros =  new int[]{1, 2, 3, 5, 7};
        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            view.showOrderMenu();
            int orden = view.inputOption(2);
            boolean ordenOpt = orden == 1;
            view.showPasosMenu();
            int pasos = view.inputOption(2);

            switch (option) {
                
                case 1:
                    System.out.println("Metodo Seleccion");
                    SortSelection sortSelection = new SortSelection();
                    sortSelection.sort(numeros, ordenOpt, pasos == 1);
                    break;
                case 2:
                    System.out.println("Metodo Insercion");
                    SortInsertion sortInsertion =  new SortInsertion();
                    sortInsertion.sort(numeros, ordenOpt, pasos == 1);
                    break;
                case 3:
                    System.out.println("Metodo Burbuja");
                    SortBubble sortBubble =  new SortBubble();
                    sortBubble.sort(numeros, ordenOpt, pasos == 1);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    System.exit(option);
                    break;
                default:
                    break;
            }
        }
    }
}

