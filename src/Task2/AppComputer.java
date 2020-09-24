package Task2;

import java.util.Arrays;

public class AppComputer {
    public static void main(String[] args) {
        CPU IntelCPU = new CPU("i3", "6Mb", "L3", "Intel", 4.3, 4);
        System.out.println("Производитель CPU: " + IntelCPU.getManufacturer());
        System.out.println("Объем кэша CPU: " + IntelCPU.getVolumeMemory());
        System.out.println("CPU Speed: " + IntelCPU.getCpuSpeed());
        System.out.println("CPU Core Number: " + IntelCPU.getCpuNumCores());


        Component CPU1 ;//= CPUFactory();
        CPU1 = IntelCPU;
        System.out.println("CPU1 Manufacturer: " + CPU1.getManufacturer());
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