package web.controller;


//Задание:

//        3. Создайте список из 5 машин.
//        4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//        5. Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//        6. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//        при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.

public class Car {
    private String model;
    private String color;

    public Car(String model, String color, int series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }

    private int series;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
