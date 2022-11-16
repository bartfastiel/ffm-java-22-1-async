package de.neuefische.ffmjava221.async.ffmjava221async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Service
public class MailService {

    @Async
    Future<String> sendMail(String someone_called_getCat) throws InterruptedException {
        Thread.sleep(10_000);
        return CompletableFuture.completedFuture("Mail sent");
    }
}
