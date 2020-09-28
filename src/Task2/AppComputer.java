package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class AppComputer {
    public static void main(String[] args) {

        Component anyComponent;
        ComponentFactory cmpFactory;
        cmpFactory = new CPUFactory();
        anyComponent = cmpFactory.createComponentPC();
        System.out.println("Создан новый компонент: " + anyComponent.getComponentTip());

        cmpFactory = new RAMFactory();
        anyComponent = cmpFactory.createComponentPC();
        System.out.println("Создан новый компонент: " + anyComponent.getComponentTip());

        cmpFactory = new VideoCardFactory();
        anyComponent = cmpFactory.createComponentPC();
        System.out.println("Создан новый компонент: " + anyComponent.getComponentTip());

        cmpFactory = new HDDFactory();
        anyComponent = cmpFactory.createComponentPC();
        System.out.println("Создан новый компонент: " + anyComponent.getComponentTip());

        cmpFactory = new MonitorFactory();
        anyComponent = cmpFactory.createComponentPC();
        System.out.println("Создан новый компонент: " + anyComponent.getComponentTip());

        Computer comp = new Computer("WorkStation");
        CPU intelCPU = new CPU("i3", "6Mb", "L3", "Intel", 4.3, 4);
        RAM hyperxRAM = new RAM("Predator HX424C12PB3K2/32", "16Gb", "DDR4", "HyperX", 2400.D);
        VideoCard msiVideo = new VideoCard("nVidia GeForce RTX 2080Ti", "11Gb", "GDDR6", "MSI", CoolingType.Active);
        HDD SeagateHDD = new HDD("Seagate 1C1278", "3Tb", "HDD", "Seagate", 3.5);
        Monitor hpMonitor = new Monitor("HP 27w 1JJ98AA", "", "", "HP", "27", " 1920x1080");

        comp.setCPU(intelCPU);
        comp.setRAM(hyperxRAM);
        comp.setVideoCard(msiVideo);
        comp.setHDD(SeagateHDD);
        comp.setMonitor(hpMonitor);

        Component crrentComponent = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите компонент ПК:");
        String line = scanner.nextLine();
        switch (ComponentType.valueOf(line)) {
            //    CPU, RAM, VideoCard, HDD, Monitor
            case CPU:
                crrentComponent = new CPU("i3", "6Mb", "L3", "Intel", 4.3, 4);
                ;
                break;
            case RAM:
                crrentComponent = new RAM("Predator HX424C12PB3K2/32", "16Gb", "DDR4", "HyperX", 2400.D);
                ;
                break;
            case VideoCard:
                crrentComponent = new VideoCard("nVidia GeForce RTX 2080Ti", "11Gb", "GDDR6", "MSI", CoolingType.Active);
                ;
                break;
            case HDD:
                crrentComponent = new HDD("Seagate 1C1278", "3Tb", "HDD", "Seagate", 3.5);
                break;
            case Monitor:
                crrentComponent = new Monitor("HP 27w 1JJ98AA", "", "", "HP", "27", " 1920x1080");
                break;
        }
        if (crrentComponent != null) {
            System.out.println("Производитель компонента: " + crrentComponent.getManufacturer());
        }

    }
}
/*

Задание:
∎ Спроектировать класс компьютер с характеристиками: класс
процессор, оперативная память, видеокарта, накопитель, монитор.
Характеристики процессора: тактовая чистота, кол
-во ядер, кеш
память, название, производитель. Характеристики оперативной
памяти: производитель, объем памяти, частота, тип памяти.
Характеристики видеокарты: производитель, тип памяти, объем
памяти, охлаждение(активное или пассивное). Характеристики
накопителя: производитель, объем памяти, тип накопителя(HDD или
SSD), форм
-фактор.
* Для усложнения можно создать несколько классов наследников
для процессора, оперативной памяти, видеокарты, накопителя.
Создания экземпляров классов характеристик использовать
фабричный метод и стратегию
 */