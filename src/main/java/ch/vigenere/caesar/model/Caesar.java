package ch.vigenere.caesar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Caesar {

    public String cleartext;
    public String key;
    public String encrypted;

}
