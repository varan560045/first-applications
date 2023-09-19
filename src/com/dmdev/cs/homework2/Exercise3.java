package com.dmdev.cs.homework2;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию
 * на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class Exercise3 {
    public static void main(String[] args) {
        int term = 38;
        double salary = 600;
        double increase = 400;
        double spending = 300;
        double brokerageAccount = (salary * 0.1);
        double income = brokerageAccount + brokerageAccount * 0.02;
        double sum = sum(term, salary, increase, spending, brokerageAccount);
        System.out.println("Всего средств на своем счету: " + sum + " долларов");
        double brokerAccount = balanceBrokerAccount(salary, increase, brokerageAccount, income, term);
        System.out.println("Всего средств на счету брокера: " + brokerAccount + " долларов");
    }
    private static double sum(int term, double salary, double increase, double spending, double brokerageAccount){
        double result = 0;
        double balanceForTheMonth = ((salary - brokerageAccount) - spending);
        for (int i = 1; i <= term ; i++) {
            if (i == 6 || i == 12 ||i == 18 ||i == 24 ||i == 30 ||i == 36){
                salary += increase;
                balanceForTheMonth = ((salary - brokerageAccount) - spending);
            }
            result += balanceForTheMonth;
        }
        return result;
    }
    private static double balanceBrokerAccount(double salary, double increase, double brokerAccount, double income,
                                              int term){
        double result = 0;
        double balanceBroker = 0;
        for (int i = 2; i <= term; i++) {
            if (i == 6 || i == 12 ||i == 18 ||i == 24 ||i == 30 ||i == 36){
                salary += increase;
            }
            balanceBroker += (brokerAccount + income);
            result = balanceBroker;
        }
        return result;
    }
}
