RSA Encryption and Decryption algorithm

This program allows you to use RSA to encrypt and decrypt messages.<br>
For RSA you must first generate public and private keys.  This is done in 5 steps: <br>
```
1. Select 2 large random prime numbers p and q 
2. calculate n = p *  q 
3. calculate phi(n) = (p-1)(q-1) 
4. find e such that gcd(e,phi(n)) = 1; 1 < e < phi(n) 
5. calculate d such that e*d = 1 (mod phi(n))

This gives you public key(e,n) and private key(n,d) 
```



Encryption: 
```
public key(e,n)

m = message. 
m^e = (mod n) = ciphertext
```
Decryption:
```
private key(n,d)

c = ciphertext
c^d (mod n) = plaintext
```
