public class IsEdekaOpen_isReweOpen {

    public static void main(String[] args) {

//        Создайте две boolean переменные isEdekaOpen и isReweOpen,
//        значения которых зависят от того, открыты магазины или нет.
//        Напишите метод canBuy, принимающий в качестве параметров две этих переменных
//        и возвращающий true, если хотя бы один магазин открыт, иначе false.
//        Отобразите строку «Я могу купить еду: » и значение. Например,
//        «Я могу купить еду: false»

        boolean isEdekaOpen = false;
        boolean isReweOpen = false;


        System.out.println("Я могу купить еду: " + canBuy(isEdekaOpen, isReweOpen));
    }

    private static boolean canBuy (boolean isEdekaOpen, boolean isReweOpen){
        if (isEdekaOpen || isReweOpen) return true;
        else return false;


    }
}
