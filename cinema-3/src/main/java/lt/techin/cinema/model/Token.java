package lt.techin.cinema.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Token {
    private UUID token;

    public Token() {
        this.token = UUID.randomUUID();
    }
}
