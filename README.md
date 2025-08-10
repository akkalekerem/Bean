Lombok : @Getter ve @Setterlar otomatik oluşur   
@Data: Getter, Setter, toString, equals ve hashCode'u ekler  
@AllArgsConstructor : Sınıftaki tüm field’ları parametre olarak alan bir constructor oluşturur.  
@NoArgsConstructor : Parametresiz (default) bir constructor oluşturur.  

Her Lombok versiyonu tüm Java versiyonları ile uyumlu değil. Uyumlu olan versiyonlar bulunup onlar kullanılmalı (Benim kodumda JPA 21 ve Lombok version 1.18.32'yi kullandım)
