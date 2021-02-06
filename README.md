# SkillTest_AlmasAqmarina
Skill Test QA - Almas Aqmarina

Pada script berikut ini menggunakan Selenium (Java) sebagai Web Automation Test pada website https://passpod.com/

Script testcase dapat diakses pada directory src/test https://github.com/skyshihiringqa/SkillTest_AlmasAqmarina/tree/master/src/test/java/com/skyshi/passpod
Terdapat 3 fitur yang diuji yaitu, Register Akun, Login, dan Kategory(Search).

Directory driver digunakan untuk tempat webdriver yang digunakan disimpan dalam file properties/browse.properties, dalam hal ini menggunakan chromedriver versi 88

File utils.java berisi fungsi-fungsi yang mengatur webdriver seperti (https://github.com/skyshihiringqa/SkillTest_AlmasAqmarina/blob/master/src/main/java/com/sekolahqa/config/Utils.java)
- openWebsite() -> digunakan untuk membuka halaman website yang akan diuji
- maximizeWindow() -> digunakan untuk fullscreen driver
- closeWindows() -> digunakan untuk menutup driver setelah pengujian berakhir

Directory pages pada src/main berisi fungsi-fungsi yang memiliki keyword dan locator berupa XPath untuk menjalankan testcase yang kemudian akan dipanggil pada src/test
https://github.com/skyshihiringqa/SkillTest_AlmasAqmarina/tree/master/src/main/java/com/sekolahqa/pages
