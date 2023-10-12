package com.company;

/**
 * UntrustworthyMailWorker – класс, моделирующий ненадежного работника почты, который вместо того,
 * чтобы передать почтовый объект непосредственно в сервис почты,
 * последовательно передает этот объект набору третьих лиц, а затем, в конце концов,
 * передает получившийся объект непосредственно экземпляру RealMailService.
 * У UntrustworthyMailWorker должен быть конструктор от массива MailService
 * ( результат вызова processMail первого элемента массива передается на вход processMail второго элемента, и т. д.)
 * и метод getRealMailService, который возвращает ссылку на внутренний экземпляр RealMailService.
 */
public class UntrustworthyMailWorker implements MailService {

    private MailService[] mailservicearray;

    private RealMailService realMailService = new RealMailService();

    UntrustworthyMailWorker(MailService[] array) {
        mailservicearray = array;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService service : mailservicearray) {
            mail = service.processMail(mail);
        }
        this.getRealMailService().processMail(mail);
        return null;
    }

    RealMailService getRealMailService() {
        return realMailService;
    }
}
