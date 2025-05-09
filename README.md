# SpingBoot-CRUD

## To-do's :-
- Download and install MySQL, then set up Spring Boot.
- Create a Spring Boot CRUD app with MySQL and implement RESTful APIs for CRUD operations using a single controller.

# First Get these files : 
- PEM file : 3ds-upi.stg.aws.paycorp.lk.pem
- Encrypted Key : 3ds-upi.stg.aws.paycorp.lk.key

# decrypt the encrypted key. Output: 3ds-upi.stg.aws.paycorp.lk.decrypted.key
command : ```bash openssl rsa -modulus -out 3ds-upi.stg.aws.paycorp.lk.decrypted.key -in 3ds-upi.stg.aws.paycorp.lk.key```

# add new full cert in pem format with decrypted key to p12 store. Output: unionpay_v2_stg_20250905.p12
command : ```bash openssl pkcs12 -export -in 3ds-upi.stg.aws.paycorp.lk.pem -inkey 3ds-upi.stg.aws.paycorp.lk.decrypted.key -out unionpay_v2_stg_20250905.p12 -name unionpay```

# verify
command : ```bash keytool -list -v -keystore unionpay_v2_stg_20250905.p12 -storepass UpiCert -storetype PKCS12```

