package com.company;

/**
 * 3) Thief – вор, который ворует самые ценные посылки и игнорирует все остальное.
 * Вор принимает в конструкторе переменную int – минимальную стоимость посылки, которую он будет воровать.
 * Также, в данном классе должен присутствовать метод getStolenValue, который возвращает суммарную стоимость всех посылок,
 * которые он своровал. Воровство происходит следующим образом: вместо посылки, которая пришла вору,
 * он отдает новую, такую же, только с нулевой ценностью и содержимым посылки "stones instead of {content}".
 */
public class Thief implements MailService {

    private int value;
    private int stolenValue = 0;

    Thief(int value) {
        this.value = value;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if ((((MailPackage) mail).getContent().getPrice() >= value)){
                stolenValue += ((MailPackage) mail).getContent().getPrice();
                Package content = new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(), 0);
                mail = new MailPackage(mail.getFrom(), mail.getTo(), content);
            }
        }
        return mail;
    }

    int getStolenValue() {
        return stolenValue;
    }
}
