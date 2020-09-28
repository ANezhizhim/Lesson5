package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class AppComputer {
    public static void main(String[] args) {


        CPU intelCPU = new CPU("i3", "6Mb", "L3", "Intel", 4.3, 4);
        System.out.println("Производитель CPU: " + intelCPU.getManufacturer());
        System.out.println("Объем кэша CPU: " + intelCPU.getVolumeMemory());
        System.out.println("CPU Speed: " + intelCPU.getCpuSpeed());
        System.out.println("CPU Core Number: " + intelCPU.getCpuNumCores());

        Component anyComponent;
        ComponentFactory cmpFactory;
        cmpFactory = new CPUFactory();
        anyComponent = cmpFactory.createComponentPC();
        System.out.println("Создан новый компонент: " + anyComponent.getComponentTip());


        RAM hyperxRAM = new RAM("Predator HX424C12PB3K2/32", "16Gb", "DDR4", "HyperX", 2400.D);
        cmpFactory = new RAMFactory();
        anyComponent = cmpFactory.createComponentPC();
        System.out.println("Создан новый компонент: " + anyComponent.getComponentTip());

        VideoCard msiVideo = new VideoCard("nVidia GeForce RTX 2080Ti", "11Gb", "GDDR6", "MSI", CoolingType.Active);
        cmpFactory = new VideoCardFactory();
        anyComponent = cmpFactory.createComponentPC();
        System.out.println("Создан новый компонент: " + anyComponent.getComponentTip());

        HDD SeagateHDD = new HDD("Seagate 1C1278", "3Tb", "HDD", "Seagate", 3.5);
        cmpFactory = new HDDFactory();
        anyComponent = cmpFactory.createComponentPC();
        System.out.println("Создан новый компонент: " + anyComponent.getComponentTip());

        Monitor hpMonitor = new Monitor("HP 27w 1JJ98AA", "", "", "HP", "27", " 1920x1080");
        cmpFactory = new MonitorFactory();
        anyComponent = cmpFactory.createComponentPC();
        System.out.println("Создан новый компонент: " + anyComponent.getComponentTip());


        Computer comp = new Computer("WorkStation");
        comp.setCPU(intelCPU);
        comp.setRAM(hyperxRAM);
        comp.setVideoCard(msiVideo);
        comp.setHDD(SeagateHDD);
        comp.setMonitor(hpMonitor);


        Component crrentComponent=null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите компонент ПК:");
        String line = scanner.nextLine();
        switch (ComponentType.valueOf(line)) {
            //    CPU, RAM, VideoCard, HDD, Monitor
            case CPU:
                crrentComponent = intelCPU;
                break;
            case RAM:
                crrentComponent = hyperxRAM;
                break;
            case VideoCard:
                crrentComponent = msiVideo;
                break;
        }
        if(crrentComponent!=null){
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