package Task2;

public class Computer {
    public Computer(String name){
        this.name=name;
    }

    private CPU cpu;
    private RAM ram;
    private VideoCard videoCard;
    private HDD hdd;
    private Monitor monitor;
    private String name;

    public void setCPU(CPU cpu){
        this.cpu=cpu;
    }
    public void setRAM(RAM ram){
        this.ram=ram;
    }
    public void setVideoCard(VideoCard videoCard){
        this.videoCard=videoCard;
    }
    public void setHDD(HDD hdd){
        this.hdd=hdd;
    }
    public void setMonitor(Monitor monitor){
        this.monitor=monitor;
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