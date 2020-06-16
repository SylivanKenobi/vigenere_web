package ch.vigenere.caesar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Caesar {

    private String cleartext;
    private String key;
    private String encrypted;

}
