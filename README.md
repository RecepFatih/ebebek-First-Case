# ebebek-First-Case
ebebek Java &amp; QA &amp; SAP Spartacus Practicum

## Case Detayları <br/>
### Sınıfın Nitelikleri: <br/>
- name : Çalışanın adı ve soyadı <br/>
- salary : Çalışanın maaşı <br/>
- workHours : Haftalık çalışma saati <br/>
- hireYear : İşe başlangıç yılı <br/> <br/>

### Sınıfın Metotları: <br/>
- Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
- tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
- Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
- Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
- bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
- raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
- Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
- Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
- Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
- toString() : Çalışana ait bilgileri ekrana bastıracaktır. <br/>

## Örnek Kod Çıktısı: <br/>
Adı : kemal <br/>
Maaşı : 2000.0 <br/>
Çalışma Saati : 45 <br/>
Başlangıç Yılı : 1985 <br/>
Vergi : 60.0 <br/>
Bonus : 150.0 <br/>
Maaş Artışı : 300.0 <br/>
Vergi ve Bonuslar ile birlikte maaş : 2090.0 <br/>
Toplam Maaş : 2390.0
