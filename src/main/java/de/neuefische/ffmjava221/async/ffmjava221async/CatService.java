package de.neuefische.ffmjava221.async.ffmjava221async;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
@RequiredArgsConstructor
public class CatService {

    private final MailService mailService;

    public String getCat() throws InterruptedException, ExecutionException {

        Future<String> someone_called_getCat1 = mailService.sendMail("Someone called getCat1");
        Future<String> someone_called_getCat2 = mailService.sendMail("Someone called getCat2");
        Future<String> someone_called_getCat3 = mailService.sendMail("Someone called getCat3");

        String a1 = someone_called_getCat1.get();
        String a2 = someone_called_getCat2.get();
        String a3 = someone_called_getCat3.get();

        return "Minki";
    }
}
