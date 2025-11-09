# Sistem order/pembelian barang real time
Diperlukan (**asumsi OS windows**):
1. Java SDK 21
2. Maven 3.9
3. Docker Desktop
4. Git
5. IDE (vscode, jetbrains, dll)

Cara menjalankan:
1. isntall semua aplikasi
1. set environment variable windows: nama JAVA_HOME, isinya path instalasi java SDK 21 (biasanya di **program files/java/jdk-xx**),
2. set environment variable windows: nama MAVEN_HOME, isinya path ekstrak file downloadan maven (**include folder bin**),
3. buka IDE dengan terminal bash (sudah diinstal bersama git)
4. buka docker desktop
5. di terminal bash, cd ke setiap folder nama service, jalankan: mvn package <nama folder> (cth: **mvn package order-service**).
   lakukan hal yang sama utk folder service lain
6. setelah menjalankan semua mvn package, jalankan: **docker compose up --build**

service akan terjalankan
