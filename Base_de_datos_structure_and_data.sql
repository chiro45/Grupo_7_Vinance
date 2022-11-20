/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 10.4.25-MariaDB : Database - vinoteca_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`vinoteca_db` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `vinoteca_db`;

/*Data for the table `accessories` */

insert  into `accessories`(`id`,`active`,`description`,`name`,`price`,`stock`,`type`) values 
(1,'','Elegante caja de Negra de Carton Rigido con set 4 piezas para vino. Incluye Destapador, Anillo Antigoteo, Tapón dosificador y tapon.','Juego De 4 Accesorios De Vino En Caja',1479.99,100,'Accessories'),
(2,'','Estuche de tres espacios de 34 cm de alto x 29 cm de ancho x 9 cm de profundidad (medida interna) para 3 botellas.','Cajas De Madera Triples Para Vinos',2049.99,100,'Accessories'),
(3,'','Funciona sin baterías y es de fácil lectura. Simplemente se ajusta a la botella y la temperatura se reflejara en la pantalla de cristal.','Termómetro Digital De Pulsera Para Vinos',499.99,100,'Accessories'),
(4,'','Con este juego, puedes abrir botellas de vino sin problemas y verter con facilidad. Rápida extracción de corcho: Abridor de vino eléctrico recargable que funciona con pilas abre cualquier botella de vino tradicional con el mínimo esfuerzo, puede quitar los corchos en casi 6 segundos. Con el aireador y vertedor 2 en 1 incluidos, puedes infundir eficazmente oxígeno y lograr un perfil de sabor más mejorado mientras se vierte, y puede evitar goteos y controlar el flujo. 2 tapones de vacío pueden eliminar el desperdicio de vino y preservar el sabor','Moocoo',5299.99,100,'Accessories'),
(5,'','Juego de regalo de vino todo en uno: Viene con todo lo que necesitas para mejorar, conservar, verter y disfrutar de tu variedad favorita. Extractor eléctrico de sacacorchos: Abridor de botones táctiles de acero inoxidable elimina hasta 30 corchos con una carga completa. Conservador al vacío y tapones: Bomba de vino manual extiende la frescura del vino eliminando el aire de la botella abierta y sellando con tapones especiales con sello de fecha. Base de carga: La estación de energía mantiene todos tus accesorios organizados mientras cargas los dispositivos. Aireador y cortador de lámina: el juego completo cuenta con aireador de alta calidad para un mejor sabor y precisión de vertido; accesorio de corte afilado para quitar el papel de aluminio','Ivation',7879.99,100,'Accessories'),
(6,'','Nuestros tapones de vino al vacío son adecuados para una boca de botella de 3/4 pulgadas de diámetro interior, lo que significa que se pueden utilizar para la mayoría de botellas de vino estándar. Elimina rápidamente el aire de la botella, evitando eficazmente que tu vino se oxide y permite que tu vino sepa fresco hasta una semana.','Phosphene',1629.99,100,'Accessories'),
(7,'','Aireador de vino con una combinación de enfriador de botellas de vino, filtro y vertedor, te permite disfrutar de una copa de vino frío perfecto a una temperatura óptima. Refrigeración instantánea y mantiene tu vino a la temperatura perfecta.','Bbbunny',1769.99,100,'Accessories'),
(8,'','La bomba aireadora eléctrica se coloca en la parte superior de cualquier tamaño de botella de vino haciendo un cierre hermético para almacenar botellas de vino abiertas. Vierte y echa el aire directamente en su vaso con el toque de un botón','NutriChef',6529.99,100,'Accessories'),
(9,'','Tapón para botella de la serie original USS Enterprise, una pieza hermosa e icónica con un acabado suave.','Star Trek',4079.99,100,'Accessories'),
(10,'','El sacacorchos de dos tiempos tiene una cuchilla curva en su extremo que permite cortar la cápsula de plomo que recubre el pico de la botella. Una vez introducido el tirabuzón en el corcho, se realiza una palanca hacia arriba apoyando el primer punto de apoyo de la bisagra y luego el segundo hasta extraer el corcho.','Sacacorchos de 2 tiempos madera',3309.99,100,'Accessories'),
(11,'','Sacacorchos con dos vainas de acero inoxidable. Permite cortar la cápsula de plomo que recupera el pico de la botella y extraer corchos sin romperlos. Especial para vinos de alta gama y vinos añejos con corchos que se desgranan.','Sacacorchos con 2 vainas',2179.99,100,'Accessories'),
(12,'','Este diseño único mantiene las botellas de vino, champán o cualquier otra bebida fría durante horas. La funda enfriadora de vino se adapta a la mayoría de botellas de vino de 25.4 fl oz. Su diseño de acero inoxidable, doble pared y aislado al vacío garantiza que las botellas frías se mantengan frías, incluso con un uso prolongado, sin condensación. ','Vinglacé',4469.99,100,'Accessories'),
(13,'','Purifica cualquier vino blanco, rosa o tinto eliminando solo los conservantes de sulfito artificial y ninguno de los compuestos naturales que hacen que cada vino sea único. Esta tecnología patentada de filtro de sulfito selectivo es la magia detrás de la purificación Ullo y el único filtro de sulfito que no alterará la química natural de tu vino.','Purificador De Vino',5899.99,100,'Accessories');

/*Data for the table `brands` */

insert  into `brands`(`id`,`brand`) values 
(1,'Viamonte'),
(2,'Los Haroldos'),
(3,'Zuccardi'),
(4,'Arrowood'),
(5,'Cambria'),
(6,'Brewer-Clifton'),
(7,'Diatom');

/*Data for the table `categories` */

insert  into `categories`(`id`,`category`) values 
(1,'Tinto'),
(2,'Rose'),
(3,'Blanco');

/*Data for the table `images_accesory` */

insert  into `images_accesory`(`id`,`image`,`fk_accesory`) values 
(1,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668787136/acwp6u8ddaaxttzctibd.jpg',5),
(2,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668787302/tybfwv6po4xsjm6yjxzn.jpg',4),
(3,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668787526/dnbncg1sk9dxicyeaba4.webp',6),
(4,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668787662/igauh7n4jdbdygj7bhfe.webp',7),
(5,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668788455/o807lynhs5yrvfirqflr.jpg',8),
(6,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668788618/gqyte4u505qffukn5tht.jpg',9),
(7,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668788787/dluchljaidzbkykc4haw.jpg',10),
(8,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668788870/lwg5v041ffeo4j5v1gwl.jpg',11),
(9,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668789170/xjqw8a0ffpne0ewvurj1.jpg',12),
(10,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668789362/wyx0wl3vbcdyckm5s8av.jpg',13),
(11,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668796059/slfzlzyyfimkzyjt6usz.jpg',1),
(12,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668796064/iniqk90tmxvx1nc4drnr.jpg',1),
(13,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668796066/rib5lah7dkvkkzk9woz8.jpg',1),
(14,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668796169/xkmgs0tvaq7daupblfb7.jpg',2),
(15,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668796178/jgxxuiaguhmyysgpiqos.jpg',2),
(17,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668796213/bdxgxfmdm5mavpfel0yk.jpg',2),
(18,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668796375/kb0evra9gjtsht91e10q.jpg',3),
(19,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668796380/bjfemk4xyevaur9vewpp.jpg',3),
(20,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668796383/ndjrofn2en2rxeuj5aho.jpg',3),
(21,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668796386/y1w0wcgc7v3ym8vs2pee.jpg',3);

/*Data for the table `images_wine` */

insert  into `images_wine`(`id`,`image`,`fk_wine`) values 
(7,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668724226/fxyc42yyt37s8s0q6wkg.jpg',2),
(8,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668724232/ht1faiqapy7pu7qon85x.jpg',2),
(9,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668724235/e1lc1jfconfgzj8yrbck.jpg',2),
(10,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740015/ccdtdsimgh4ltxuxln3b.png',1),
(11,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740018/gk9jzsyew2audspt7byu.jpg',1),
(12,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740067/lzay46xzgwfxxp6crfyw.jpg',3),
(13,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740070/efldxmwqiv69g9ywpjch.jpg',3),
(14,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740127/nll1voc7etlwscc3xw28.png',4),
(15,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740131/fik9bwybwcbqtbzjiljd.png',4),
(18,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740493/jjxonyhiuihxjec1swjd.png',5),
(19,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740495/faq7xitybwyqsv4pc9fw.png',5),
(20,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740510/zhztsbtc6gl6yjd6ekuo.png',6),
(21,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740513/cnndhbf9u5rngr6b7x2m.png',6),
(22,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740542/iwmg92q0zqfb2bhruxbl.png',7),
(23,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740544/tpjahu2mlmuqtgj8apg5.png',7),
(24,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740575/wo84dhpcccenbrkr26gx.png',8),
(25,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740579/mcnmjjyxgta7uvdhl5eu.jpg',8),
(26,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740633/teq1fswefeydnksrqg7d.jpg',9),
(27,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740635/jspvwhdxnsau8uq4pdbm.jpg',9),
(28,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740658/evpyfjurukmzsgwrvs2n.jpg',10),
(29,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740661/fbr28vztyrl5rv364zc2.jpg',10),
(30,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740693/iwcawepfvgoqpcqi1m3a.png',11),
(31,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740695/trximeb9tnc7ebxjdx7b.png',11),
(32,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740726/bxkl7aoemtrdy1ev3fqa.png',12),
(33,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668740728/ofaciwxtj5ci8ewqy8yj.png',12),
(34,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794443/rnikbvs0cmkdsm0hbs69.png',13),
(35,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794446/fgogsmnyhpotkpatgupx.png',13),
(36,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794538/arnyyomo2o7444frgndx.png',14),
(37,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794540/rwnpkoytkyd8bztwhnqk.png',14),
(38,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794582/yxr0tuqzz3ox7qqp2191.png',15),
(39,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794584/ov0imxsxqp7jgcovnszp.png',15),
(40,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794607/pqpzozxlcjuouqysdddh.png',16),
(41,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794610/m0h6jfe10edlcindtuud.png',16),
(42,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794958/t3uh6zie6wb2cdnxjypf.png',17),
(43,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794961/youcun0fmrymep01ywyr.png',17),
(44,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794973/gsdeji5yahu4rdsihvdr.png',18),
(45,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794975/rzo6lwpewfkbke8ndga7.png',18),
(46,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794987/fytjjc5abfphe6h4hslh.png',19),
(47,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668794989/twv4vxs9lnrt7vyngbzc.png',19),
(48,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795001/pw6lsl3pda7srd5nr8w2.png',20),
(49,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795004/uexy32nfktrk7b9zrvk7.png',20),
(50,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795014/buak5mxjf8yfibvfbtsa.png',21),
(51,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795016/rvtj9blbdxoeur4nm6el.png',21),
(52,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795042/pse2gebys9ldcqqbs979.png',22),
(53,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795045/swsjqohqeck5yspuimxc.png',22),
(54,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795056/uhegfm0wnwtjli76euqy.png',23),
(55,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795060/ovzeadxigi5sxqb0opka.png',23),
(56,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795093/d8fhrebdx8eozvx36u5h.png',24),
(57,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795095/fzmwklgze7lizzfwpqaa.png',24),
(58,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795108/g9xnzxidi0bpzto9fnzv.png',25),
(59,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795111/tftpprcfskvcxqypq87i.png',25),
(60,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795119/hoeghueuh0msamb20vsl.png',26),
(61,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795122/xlm4filbunvyzc8kuy4s.png',26),
(62,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795130/fimhdg1ydce7ctblpnaw.png',27),
(63,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795132/xuxckcxyw6b8fxxdpqy4.png',27),
(64,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795147/kkfpaai3wnwvgx1fasw4.png',28),
(65,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795150/wlq1kenfz9u4px0tfkjt.png',28),
(66,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795289/lxnk6b25ppf3zez59r5c.png',29),
(67,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795320/zodinfodcnal8scfkmm8.jpg',29),
(68,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795341/gi6p1t3grh6buepyi2k7.png',30),
(69,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795345/mcha8opnpv9zrxmq16xo.png',30),
(70,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795359/kwq9ugbci2oph1cv9tun.png',31),
(71,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795361/mxzhohfs8bzagkuzbdbp.png',31),
(72,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795369/lhnchrromfizmylsvgix.png',32),
(73,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795371/scepqtdhlx1zdrlnzkwh.png',32),
(74,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795392/aymwtqx2spj0dzn0yien.png',33),
(75,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795396/vrov3otwkkcimo2wvutn.png',33),
(76,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795415/hggviejdyscrzt2bikle.png',34),
(77,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795417/fpkcmv5y9vcii4f344jg.png',34),
(78,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795432/j1dpy33eye9ohij3trix.png',35),
(79,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795437/q8gz5ae48di74bzpr5da.jpg',35),
(84,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795491/ghrxtmkvyxqssyx1idle.jpg',37),
(85,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795496/mebg59thiz2ffkjkskbn.jpg',37),
(86,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795500/ydlbvwblst5tbz0wbqob.jpg',37),
(87,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795515/orp2sybrj0taud06giyx.jpg',38),
(88,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795519/tmejwuqicyxinkrdfsmd.jpg',38),
(89,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795523/mol8lq4dqw6zp9yfkzvl.jpg',38),
(90,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795525/xdhptrgtxflsltjdlby6.jpg',38),
(91,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795538/rfk1dpibkuvo6ndi2sqe.jpg',39),
(92,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795540/odprlc01ef0ixygstyx7.jpg',39),
(93,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795542/yaqxcfgdngkmaqckb5r2.jpg',39),
(94,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795554/wq9wwgrpzb89fvkemzub.jpg',40),
(95,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795556/nswaqu01wbtguagrxbzd.jpg',40),
(96,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795558/fa4pkl2x73y36nbzubpz.jpg',40),
(97,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795560/olse0aq02axsycr4cfcd.jpg',40),
(98,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795571/hjgnytj4a33e3cogppov.jpg',41),
(99,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795574/patjaqus7s28j9hcqq7h.jpg',41),
(100,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795594/kijtcl6s3dpm0j1gmdia.jpg',42),
(101,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795596/bnqatqzssv6asrbpkxnv.jpg',42),
(102,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795598/kinimmtx0hnm3pjpw7qv.jpg',42),
(103,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795600/cmatldmnlbqbmtwxvhoe.jpg',42),
(104,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795613/gt8ofkbqwwtp24otgwlb.jpg',43),
(105,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795616/pzedjyjmuuohq3zhnpsn.jpg',43),
(106,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795619/p1mx1ep33buqsrljtzay.jpg',43),
(107,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795621/kzyjgxagqtf6wyzdab28.jpg',43),
(108,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795650/vceposwqwmtwmbe7tfnj.jpg',44),
(109,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795652/lhjbpgatnwyfdhrnnm8d.jpg',44),
(110,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795655/js8c49tq7xnjqavtewig.jpg',44),
(111,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795657/nnfinlcmrtfpvo3zzgo4.jpg',44),
(112,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795681/nixpym2nz8jqdr4cfhmj.jpg',45),
(113,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795684/zwvf9qelw2fcjkcscp2e.jpg',45),
(114,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795686/jvha1ucfx2vgqz15xscj.jpg',45),
(115,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795688/asy8hrm7ehktphn5vvle.jpg',45),
(116,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795721/bjcde0nopbaktixhv4if.png',46),
(117,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795725/dn6soegmd53rslhxjqwi.png',46),
(118,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795736/q5ly3y71evdwljxaexzh.jpg',47),
(119,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795738/ira4tor26ddackkxgqcr.jpg',47),
(120,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795758/q51iaz2mdcljxkkra0gz.jpg',48),
(121,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795786/jsrsclm2y39udxti7pj2.jpg',49),
(122,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795793/sfzlaejin11eahb5ycpd.jpg',49),
(123,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795804/hftgaowvrbbzzi5nfv4w.jpg',50),
(124,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668795806/tqtyhcymhqpyeruzssy9.jpg',50),
(129,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668797314/zjoslkw1jojlkzw8lmbr.jpg',36),
(130,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668797316/harqtaluibeow4d30loy.jpg',36),
(131,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668797319/cdovdf6iyqss5st5kjsc.jpg',36),
(132,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668797321/ytxoiktv32r96j9t8dcd.jpg',36),
(133,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668799742/m7ukxgxeo08vbfn1d9em.png',51),
(134,'https://res.cloudinary.com/dka1fqaps/image/upload/v1668799745/dsx5zszrbzurkhade0rt.png',51);

/*Data for the table `roles` */

insert  into `roles`(`id`,`roles`) values 
(1,'ROLE_USER'),
(2,'ROLE_SELLER');

/*Data for the table `ticket_details` */

/*Data for the table `tickets` */

/*Data for the table `tickets_details` */

/*Data for the table `user_rol` */

insert  into `user_rol`(`user_id`,`rol_id`) values 
(1,2),
(2,2);

/*Data for the table `users` */

insert  into `users`(`id`,`email`,`name`,`password`,`username`) values 
(1,'admin@admin.com','admin','$2a$10$RM8AqO2LXFSRbWuEDPHzsO7B2v3hLdTz39/PUya8A4POZ5/KI9aR6','admin'),
(2,'seller@seller.com','seller','$2a$10$ZjWTCyGmnc7JsWSi8uinsuxTxp9M5KLlBnufeVpdXpNlKqKXpu6cW','seller');

/*Data for the table `users_ticket` */

/*Data for the table `varietals` */

insert  into `varietals`(`id`,`varietal`) values 
(1,'Malbec'),
(2,'Cabernet Suavignon'),
(3,'Suavignon Blanc'),
(4,'Cabernet Franc'),
(5,'Chardonnay'),
(6,'Pinot Noir');

/*Data for the table `wine_brand` */

insert  into `wine_brand`(`brand_id`,`wine_id`) values 
(1,1),
(1,2),
(1,3),
(1,47),
(1,48),
(1,49),
(1,50),
(2,4),
(2,5),
(2,6),
(2,7),
(2,46),
(3,8),
(3,9),
(3,10),
(4,11),
(4,12),
(4,13),
(4,14),
(4,15),
(4,16),
(4,17),
(4,18),
(4,19),
(4,20),
(4,21),
(4,22),
(5,23),
(5,24),
(5,25),
(5,26),
(5,27),
(5,28),
(5,29),
(5,30),
(5,31),
(5,32),
(5,33),
(5,34),
(5,35),
(5,51),
(6,36),
(6,37),
(6,38),
(6,39),
(6,40),
(6,41),
(6,42),
(6,43),
(7,44),
(7,45);

/*Data for the table `wine_category` */

insert  into `wine_category`(`category_id`,`wine_id`) values 
(1,1),
(1,2),
(1,3),
(1,4),
(1,5),
(1,6),
(1,8),
(1,9),
(1,10),
(1,11),
(1,12),
(1,13),
(1,14),
(1,15),
(1,16),
(1,17),
(1,18),
(1,19),
(1,20),
(1,23),
(1,24),
(1,25),
(1,26),
(1,27),
(1,28),
(1,29),
(1,30),
(1,36),
(1,38),
(1,39),
(1,40),
(1,42),
(1,43),
(1,47),
(1,49),
(1,50),
(2,51),
(3,7),
(3,21),
(3,22),
(3,31),
(3,32),
(3,33),
(3,34),
(3,35),
(3,37),
(3,41),
(3,44),
(3,45),
(3,46),
(3,48);

/*Data for the table `wine_varietal` */

insert  into `wine_varietal`(`varietal_id`,`wine_id`) values 
(1,1),
(1,2),
(1,6),
(1,8),
(1,9),
(1,19),
(1,20),
(1,47),
(1,50),
(2,3),
(2,5),
(2,11),
(2,12),
(2,13),
(2,14),
(2,15),
(2,16),
(2,17),
(2,18),
(2,49),
(3,7),
(3,22),
(3,48),
(4,4),
(4,10),
(5,21),
(5,31),
(5,32),
(5,33),
(5,34),
(5,35),
(5,37),
(5,41),
(5,44),
(5,45),
(5,46),
(6,23),
(6,24),
(6,25),
(6,26),
(6,27),
(6,28),
(6,29),
(6,30),
(6,36),
(6,38),
(6,39),
(6,40),
(6,42),
(6,43),
(6,51);

/*Data for the table `wines` */

insert  into `wines`(`id`,`active`,`description`,`name`,`price`,`stock`,`type`) values 
(1,'','Es un vino de color rojo brillante y profundo. Se perciben intensos aromas a frutos rojos y negros maduros como moras y cassis, con una nota de vainilla que otorga elegancia. Es un vino que posee una gran estructura, equilibrio y persistencia. Redondo y aterciopelado.','Viamonte Gran Reserva Malbec 2016',4599.99,100,'Wines'),
(2,'','Color rojo viláceo intenso y destellos púrpura. Aromas complejos donde se destaca fruta roja bien madura como mermelada de ciruelas. Su crianza en roble francés por 24 meses y sus posteriores 12 meses en estiba le aporta a la fruta notas de vainilla. Es un vino aterciopelado con un final extenso.','Viamonte Icono Malbec 2016',6999.99,100,'Wines'),
(3,'','Posee un color rojo brillante, aroma frutado con aporte de madera francesa, notas especiadas tales como pimientos, canela. Es propio de nuestro cabernet sauvignon la sutileza de sus laninos, ofreciéndonos un vino redonde, elegante y sobre todo característico.','Viamonte Oak Selection Cabernet Sauvignon 2018',1999.99,100,'Wines'),
(4,'','Color rojo rubí intenso, con destellos violáceos. Aroma a frutos rojos, frambuesas, arándanos, pimienta rosa y un leve y delicado final herbal.','Los Haroldos Reserva Cabernet Franc',9299.99,100,'Wines'),
(5,'','Color rojo profundo con destellos violáceos. Aroma complejo con notas de jalea, higo maduro y frutas secas.','Los Haroldos Reserva Cabernet Sauvignon',7319.99,100,'Wines'),
(6,'','Color rojo profundo con destellos violáceos. Aroma complejo  con notas a mermelada, higos maduros y frutas secas negras.','Los Haroldos Reserva Malbec',7319.99,100,'Wines'),
(7,'','Color amarillo con destellos verdosos. Aroma que recuerda al pomelo rosado, hierbas frescas, con notas de frutas tropicales y ruda.','Los Haroldos Estate Sauvignon Blanc',5799.99,100,'Wines'),
(8,'','Color rojo violáceo con visos azulados, intenso y vivaz. Intenso aroma de rojos rojos y negros maduros, matices de especias, violetas y chocolate.','Vino Zuccardi Serie Q Malbec',3299.99,100,'Wines'),
(9,'','Vino fortificado, dulce y de alta graduación alcohólica.','Vino Malamado Malbec Flia Zuccardi',2699.99,100,'Wines'),
(10,'','Intenso aroma de rojos rojos y negros maduros, matices de especias, violetas y chocolate.','Vino Zuccardi Serie Q Cabernet Franc',2199.99,100,'Wines'),
(11,'','Los aromáticos cautivadores de grosella negra, anís, lavanda, especias y caja de cigarros acompañan una textura que es realmente decadente. Este es uno de los vinos raros que logra la concentración y el poder que espera de la uva Cabernet, manteniendo el equilibrio y la frescura que solo pueden lograr los mejores embotellados. Nuestro largo envejecimiento en barrica y un año de edad de botella antes del lanzamiento aseguran que este vino esté listo para beber ahora; sin embargo, aquellos con paciencia serán recompensados por los próximos 25 años.','2017 Réserve Spéciale Cabernet Sauvignon',18099.99,100,'Wines'),
(12,'','La elevación de este viñedo se presta para exhibir una calidad aromática distinta, donde el clásico carácter de fruta roja del Valle de Sonoma se lleva a un nuevo nivel.  Intensamente perfumado con cereza oscura y ciruela negra, esta decadencia es recibida en el paladar con alguna estructura seria. La violeta seca y el azúcar quemada se transportan en el paladar con una textura aterciopelada y una acidez notable que permitirá que este vino envejezca sin esfuerzo durante muchos años. Recomendación de bodega: ahora hasta 2040.','2018 Smothers-Remick Ridge Cabernet Sauvignon',16299.99,100,'Wines'),
(13,'','Se exhiben frutas violetas y azules, con interesantes notas de compota de mora, té de rooibos y cardamomo.  Exhibe las notas clásicas de Cabernet de grosella negra y grafito en el paladar y se define por su persistencia increíblemente elegante.  Un vino expresivo lleno de energía de principio a fin, la abundancia de aromáticos continuará sorprendiendo y deleitando. Recomendación de bodega: ahora hasta 2040.','2018 Vales Edge Cabernet Sauvignon',13099.99,100,'Wines'),
(14,'','Este viñedo orientado al suroeste produce Cabernet Sauvignon con un tono púrpura intenso y un estilo exótico y vibrantemente fructífero. Aunque tiene un estilo muy singular, sigue siendo muy característico de la región de Knights Valley, ofreciendo moras violetas, maduras e higos en la nariz junto con los famosos taninos de polvo de cacao. El envejecimiento en barrica de 32 meses refina la textura, ofreciendo taninos firmes y una estructura bien definida. Su acabado explosivo concluye con un picante que persiste, dejando a tu paladar pidiendo un sorbo más.','2018 Knights Crown Vineyard Cabernet Sauvignon',1699.99,100,'Wines'),
(15,'','En nariz, este vino se abre con aromas complejos de frutas y tierra. El vino realmente refleja su sentido del lugar con notas de resina, roca volcánica triturada, fruta negra coriácea, alquitrán y cereza. Esto conduce a una entrada intensa y expresiva en el paladar que concluye con un final largo y sabroso.','2016 Monte Rosso Cabernet Sauvignon',18099.99,100,'Wines'),
(16,'','El Alexander Valley Cabernet Sauvignon 2018 es de frutas oscuras con aromas de grosella negra y anís estrellado. Sabroso y brillante, muestra las notas clásicas de Alexander Valley de aceituna negra y violeta, mientras que el grano de café ligeramente tostado complementa el tanino elegante y flexible en el paladar.','2018 Alexander Valley Cabernet Sauvignon',8099.99,100,'Wines'),
(17,'','El Knights Valley Cabernet Sauvignon 2018 es audaz con frutas y anís de la selva negra, matizados con violeta, resina de pino, salvia y nuez moscada. Densamente concentrado e intensamente sabroso en boca con frutas oscuras, grafito y semillas de cacao.','2018 Knights Valley Cabernet Sauvignon',7399.99,100,'Wines'),
(18,'','Dentro del valle de Sonoma, obtenemos de viñedos de laderas y bancos de los sub-AVA de montaña Sonoma y montaña Luna. La clave de estos sitios son los suelos volcánicos rocosos, produciendo fruta altamente concentrada con una expresión distinta. El Cabernet Sauvignon Sonoma Valley 2019 está dominado por capas de fruta roja, con aromas de pastel de cereza negra, grosellas y toques de clavo. Redondo y flexible en el paladar, tiene una madurez vibrante que muestra lo mejor de la fruta del valle de Sonoma.','2019 Sonoma Valley Cabernet Sauvignon',9099.99,100,'Wines'),
(19,'','Prowess es la expresión más verdadera de su cosecha, con el lanzamiento de cada año que contiene diferentes combinaciones de las cinco variedades de Burdeos procedentes de los principales sitios de viñedos de Arrowood. El Prowess 2018 es un vino de cuerpo medio y capas que exhibe un espectro completo de aromas de frutas rojas y oscuras junto con matices salados de aceituna negra, pizarra, nuez moscada y cedro. Con una textura deliciosa, permanece en el paladar con sabores intensos de violeta y anís.','2018 Prowess Red Malbec',9099.99,100,'Wines'),
(20,'','Los sabores de frutas oscuras de ciruela y corriente negra combinados con especias, anís, pétalo de rosa y pizarra ofrecen un atractivo exótico. Este Malbec es muy estructurado y amplio en boca, con el carácter prevalente y consistente de Knights Valley de los taninos de polvo de cacao.','2019 Knights Valley Malbec',8199.99,100,'Wines'),
(21,'','Utilizando un enfoque de vinificación sin intervención para capturar las cualidades inherentemente equilibradas de la viña, el Chardonnay 2020 es una expresión pura y hermosa de Carneros. Es decisivamente fresco con reserva de limón y melón en exhibición junto con notas tentadoras de flor blanca y malvavisco tostado. Con textura y energía generosas en el paladar, este vino se define por su equilibrio de riqueza y acidez brillante.','2020 Carneros Chardonnay',6599.99,100,'Wines'),
(22,'','Como expresión más madura que las cosechas anteriores, este es nuestro primer Sauvignon Blanc del Knights Valley AVA. Este vino presenta intensos aromáticos de azahar, piña, nectarina blanca, jengibre y miel. Decadente pero refrescante en el paladar, estos sabores persisten junto con su textura redonda y jugosa.','2021 Knights Valley Sauvignon Blanc',4899.99,100,'Wines'),
(23,'','Diseñado de manera sostenible a partir de un solo viñedo, el viñedo de Julia, Pinot Noir, ejemplifica el significado de la especia de Santa María, también conocido como el equilibrio de la tierra, los frutos rojos y las conchas marinas trituradas combinadas con lo fresco, elegancia costera que es una firma de la región y nuestra propietaria Julia Jackson. Con notas de fruta roja, arándano, cereza silvestre y granada brillante, el vino tinto insignia de Cambria es perfecto para beber o saborear, sin importar la temporada. ','2020 Julia Vineyard Pinot Noir',4099.99,100,'Wines'),
(24,'','Procedente de varios bloques a través del viñedo, nuestra Colección Winemaker es una exploración del sitio y el estilo vintage a vintage. El Pinot Noir Mesa Terrace es una mezcla de bloques y clones del asiento de nuestra característica geológica más distintiva, el Banco del Valle de Santa María. Este vino tiene una producción limitada y se lanza primero a nuestros miembros del club. ','2016 Mesa Terrace Pinot Noir',7799.99,100,'Wines'),
(25,'','Procedente de varios bloques a través del viñedo, nuestra serie Geográfica captura un sentido de lugar y las expresiones únicas en nuestra finca. Element Pinot Noir celebra los elementos naturales del valle de Santa María. Cada cosecha, pensamos en cuál nos afectó más (sol, viento y lluvia) y capturamos su esencia en la botella. Este vino tiene una producción limitada y se lanza primero a nuestros miembros del club. ','2017 Element Pinot Noir',7799.99,100,'Wines'),
(26,'','Embotellamos nuestra Colección Clone para resaltar las características individuales y las variaciones de un solo clon de uva. Similar a morder una manzana Honeycrisp vs. Granny Smith, embotellar un solo clon nos permite explorar completamente los matices entre sabor, textura, y aroma en diferentes variedades de la misma uva. Clone 23 Pinot Noir muestra un lado diferente de la uva a través de la fermentación del barril y el envejecimiento sensual, oscuro y melancólico.','2017 Clone 23 Pinot Noir',9199.99,100,'Wines'),
(27,'','Embotellamos nuestra Colección Clone para resaltar las características individuales de un solo clon de uva. Similar a morder una manzana Honeycrisp vs. Granny Smith, embotellar un solo clon nos permite explorar completamente los matices entre sabor, textura, y aroma en diferentes variedades de la misma uva. Clone 2A Pinot Noir es un vino magnífico con sabores a frutas de tonos altos. Cultivado en las laderas, este vino es un hermoso matrimonio de clones y terruños.','2018 Clone 2a Pinot Noir',9099.99,100,'Wines'),
(28,'','Embotellamos nuestra Colección Clone para resaltar las características individuales y las variaciones de un solo clon de uva. Similar a morder una manzana Honeycrisp vs. Granny Smith vs. Empire, embotellar un solo clon nos permite explorar completamente los matices entre sabor, textura, y aroma en diferentes variedades de la misma uva. Clone 4 Pinot Noir cobró vida por primera vez en nuestro viñedo Tepusquet original y estas vides viejas ahora producen algunas de nuestras frutas más encantadoras.','2018 Clone 4 Pinot Noir',9099.99,100,'Wines'),
(29,'','El nombre de la matriarca de la bodega Cambria Estate, el Pinot Noir Signature de Barbara está fabricado de manera sostenible a partir de un tipo singular de clon Pinot Noir 667, el favorito de Barbara, por supuesto. Este poderoso pinot está repleto de aromas y sabores vívidos de arándano, cerezo salvaje y arándano. Su característica sedosa se complementa con tierra fresca y especias que le dan un final largo. Construidos para el envejecimiento, los vinos Signature de Cambria son perfectos para regalar o para cuando quieras tomar algo extra especial.','2017 Barbara Signature Pinot Noir',12999.99,100,'Wines'),
(30,'','El nombre de la familia de la hija menor de Cambria Estate Winery, El Pinot Noir Signature de Julia está hecho de manera sostenible y muestra algunos de los mejores Pinot Noir cultivados orgánicamente cultivados dentro del icónico viñedo de Julia. A menudo conocido como \"el Pinot amante de Cabernet\", este vino es grande y audaz con un color oscuro y profundo. Construidos para el envejecimiento, los vinos Signature de Cambria son perfectos para regalar o para cuando quieras tomar algo extra especial.','2017 Julia Signature Pinot Noir',12999.99,100,'Wines'),
(31,'','Cada cosecha, Katherine Vineyard Chardonnay es una expresión de viñedo único que captura la luz solar refrigerada de nuestra finca también conocida como la influencia oceánica del Valle de Santa María, el sol cálido y la brisa fresca. Este vino en capas, elegante y distinto está elaborado exclusivamente a partir de las vides barridas de niebla de Katherine Vineyard, que lleva el nombre de nuestra propietaria Katie Jackson en 1986, y plantado en suelos antiguos que consisten en conchas marinas fosilizadas, esquisto, piedra caliza y arena. ','2020 Katherine Vineyard Chardonnay',3499.99,100,'Wines'),
(32,'','Procedente de varios bloques a través del viñedo, nuestra Colección Winemaker es una exploración del sitio y el estilo desde lo vintage hasta lo vintage. West Point Chardonnay trae el carácter distintivo de nuestros bloques más occidentales parcelas únicas de vides que maduran primero y abren el camino para la cosecha en el vidrio. Este vino tiene una producción limitada y se lanza primero a nuestros miembros del club.','2018 West Point Chardonnay',6799.99,100,'Wines'),
(33,'','El clon 4 es uno de los clones Chardonnay más famosos de California y es responsable de muchos de los mejores vinos de la costa oeste. Cultivado de manera sostenible en nuestro viñedo de Katherine, este vino está elaborado con nuestro chardonnay Old Vine plantado originalmente en la década de 1970. Fermentado en acero inoxidable y envejecido en barrica en roble francés neutro le da a este delicioso peso de Chardonnay sin dominar ninguno de los personajes duraderos del clon.','2018 Clone 4 Chardonnay',6799.99,100,'Wines'),
(34,'','Procedente de varios bloques a través del viñedo, nuestra Colección Winemaker es una exploración del sitio y el estilo vintage a vintage. Fog Tide Chardonnay refleja la niebla ondulada que envuelve nuestra tierra. Genial y misterioso, es un homenaje a una de las características más fascinantes del Valle de Santa María. Este vino tiene una producción limitada y se lanza primero a nuestros miembros del club.','2018 Fog Tide Chardonnay',6799.99,100,'Wines'),
(35,'','El nombre de la familia de la hija mayor de Cambria Estate Winery, Katherine’s Signature Chardonnay demuestra perfectamente un acto de equilibrio entre riqueza y vitalidad. Diseñado de manera sostenible para exhibir la fruta más expresiva de Chardonnay cultivada dentro del icónico viñedo de Katherine, este vino blanco es enfocado y bonito con notas de cuajada de limón y frutas tropicales. Construidos para el envejecimiento, los vinos Signature de Cambria son perfectos para regalar o para cuando quieras tomar algo extra especial.','2019 Katherine Signature Chardonnay',9799.99,100,'Wines'),
(36,'','Buscando asegurar un rancho hermano de imagen especular a nuestro viñedo 3D en Sta. Rita Hills, comenzamos a trabajar con la familia Machado en el invierno de 2008. Nuestra parcela de 15 acres en su tierra se encuentra adyacente a Clos Pepe e inmediatamente detrás del viñedo Kessler-Haak. El sitio está marcado por un hermoso terreno ondulado con suelos arenosos y francos. En Machado, la mayoría de la plantación está dedicada al pinot noir con cantidades iguales de selecciones como Pommard, Merry Edwards, Mount Eden y 459. Además del pinot noir, también plantamos una pequeña parcela de dos acres en la parte más arenosa del campo para la selección de chardonnay del Cañón Sweeney. ARTESANÍA: Solo se emplean barriles neutros. Nos esforzamos por la fermentación de racimos completos. Cultivamos con el objetivo de madurar los tallos junto a la fruta, permitiendo que el racimo esté en armonía. Trabajar con los tallos permite vinos estructurados, terrosos y equilibrados con nuestra hermosa Sta.','Brewer-Clifton Machado Pinot Noir 2020',13899.99,100,'Wines'),
(37,'','El énfasis principal de la Sta de 10 acres predominantemente arenosa. El viñedo de Rita Hills es Chardonnay, con cantidades iguales de cinco clones plantados ( 4, 76, Hyde, Mount Eden y Sea Smoke Wente ). Además de Chardonnay, hay un campo más pequeño de Pinot Noir plantado en los clones Swan, Pommard, 667 y 828 ARTESANÍA: Solo se emplean barriles neutros. Nos esforzamos por la fermentación de racimos completos. Cultivamos con el objetivo de madurar los tallos junto a la fruta, permitiendo que el racimo esté en armonía. Trabajar con los tallos permite vinos estructurados, terrosos y equilibrados con nuestra hermosa Sta. Fruta de Rita Hills.','Brewer-Clifton 3d Chardonnay 2020',10599.99,100,'Wines'),
(38,'','Este embotellado está compuesto por clon 459 pinot noir de nuestro viñedo Machado en Sta. Rita Hills. 459 exhibe una expresión profunda y carnal de fruta con especias equilibradas. Parcela de 15 acres en el terreno de la familia Machado se encuentra adyacente a Clos Pepe e inmediatamente detrás del viñedo Kessler-Haak. El sitio está marcado por un hermoso terreno ondulado con suelos arenosos de arcilla franco. Artesanía: Solo se usan barriles neutrales de Sirugue para 12-18mos. Nos esforzamos por la fermentación de racimos completos. Cultivamos con el objetivo de madurar los tallos junto a la fruta, permitiendo que el racimo esté en armonía. Trabajar con los tallos permite vinos estructurados, terrosos y equilibrados con nuestra hermosa fruta SRH. A menudo usamos la analogía de tostar pescado o carne en el hueso, el hueso ofrece sabores complejos muy diferentes a quitárselo del hueso para cocinarlo.','Brewer-Clifton 459 Pinot Noir 2020',12199.99,100,'Wines'),
(39,'','Buscando asegurar un rancho hermano de imagen especular a nuestro viñedo 3D en Sta. Rita Hills, comenzamos a trabajar con la familia Machado en el invierno de 2008. Nuestra parcela de 15 acres en su tierra se encuentra adyacente a Clos Pepe e inmediatamente detrás del viñedo Kessler-Haak. El sitio está marcado por un hermoso terreno ondulado con suelos arenosos y francos. En Machado, la mayoría de la plantación está dedicada al pinot noir con cantidades iguales de selecciones como Pommard, Merry Edwards, Mount Eden y 459. Además del pinot noir, también plantamos una pequeña parcela de dos acres en la parte más arenosa del campo para la selección de chardonnay del Cañón Sweeney. ARTESANÍA: Solo se emplean barriles neutros. Nos esforzamos por la fermentación de racimos completos. Cultivamos con el objetivo de madurar los tallos junto a la fruta, permitiendo que el racimo esté en armonía. Trabajar con los tallos permite vinos estructurados, terrosos y equilibrados con nuestra hermosa Sta.','Brewer-Clifton Machado Pinot Noir 2019',13899.99,100,'Wines'),
(40,'','El viñedo Hapgood se encuentra al otro lado de la carretera de nuestro viñedo Machado y está situado al final de Hapgood Road, en el corazón de Sta. Rita Hills. En un suelo ligeramente más rico, el viñedo se planta en la selección Mount Eden de Pinot Noir. El contenido elevado de arcilla franco da como resultado un mayor volumen y una expresión de paladar más densa. Nuestra instalación más reciente, plantada en 2010, es esta pequeña sección de 2-1 / 2 acres de pinot noir plantada en el clon Merry Edwards. Artesanía: Solo se usan barriles neutrales de Sirugue para 12-18mos. Nos esforzamos por la fermentación de racimos completos. Cultivamos con el objetivo de madurar los tallos junto a la fruta, permitiendo que el racimo esté en armonía. Trabajar con los tallos permite vinos estructurados, terrosos y equilibrados con nuestra hermosa fruta SRH. A menudo usamos la analogía de tostar pescado o carne en el hueso, el hueso ofrece sabores complejos muy diferentes a quitárselo del hueso para c','Brewer-Clifton Hapgood Pinot Noir 2019',12199.99,100,'Wines'),
(41,'','Buscando asegurar un rancho hermano de imagen especular a nuestro viñedo 3D en Sta. Rita Hills, comenzamos a trabajar con la familia Machado en el invierno de 2008. Nuestra parcela de 15 acres en su tierra se encuentra adyacente a Clos Pepe e inmediatamente detrás de la vinagre Kessler-Haak recientemente plantada. El sitio está marcado por un hermoso terreno ondulado con suelos arenosos y francos. En Machado, la mayoría de la plantación está dedicada al pinot noir con cantidades iguales de selecciones como Pommard, Merry Edwards, Mount Eden y 459. Además del pinot noir, también plantamos una pequeña parcela de dos acres en la parte más arenosa del campo para la selección de chardonnay del Cañón Sweeney. Artesanía: Todo el grupo presionó chardonnay. Solo se emplean barriles neutros. No promovemos ni prohibimos la fermentación maloláctica, permitiendo que el vino esté en equilibrio, brillante y elegante.','Brewer-Clifton Machado Chardonnay 2020',10599.99,100,'Wines'),
(42,'','El énfasis principal de la Sta de 10 acres predominantemente arenosa. El viñedo de Rita Hills es Chardonnay, con cantidades iguales de cinco clones plantados ( 4, 76, Hyde, Mount Eden y Sea Smoke Wente ). Además de Chardonnay, hay un campo más pequeño de Pinot Noir plantado en los clones Swan, Pommard, 667 y 828. Artesanía: Solo se emplean barriles neutros. Nos esforzamos por la fermentación de racimos completos. Cultivamos con el objetivo de madurar los tallos junto a la fruta, permitiendo que el racimo esté en armonía. Trabajar con los tallos permite vinos estructurados, terrosos y equilibrados con nuestra hermosa Sta. Fruta de Rita Hills.','Brewer-Clifton 3d Pinot Noir 2020',12199.99,100,'Wines'),
(43,'','El viñedo Hapgood se encuentra al otro lado de la carretera de nuestro viñedo Machado y está situado al final de Hapgood Road, en el corazón de Sta. Rita Hills. En un suelo ligeramente más rico, el viñedo se planta en la selección Mount Eden de Pinot Noir. El contenido elevado de arcilla franco da como resultado un mayor volumen y una expresión de paladar más densa. Nuestra instalación más reciente, plantada en 2010, es esta pequeña sección de 2-1 / 2 acres de pinot noir plantada en el clon Merry Edwards. Artesanía: Solo se usan barriles neutrales de Sirugue para 12-18mos. Nos esforzamos por la fermentación de racimos completos. Cultivamos con el objetivo de madurar los tallos junto a la fruta, permitiendo que el racimo esté en armonía. Trabajar con los tallos permite vinos estructurados, terrosos y equilibrados con nuestra hermosa fruta SRH. A menudo usamos la analogía de tostar pescado o carne en el hueso, el hueso ofrece sabores complejos muy diferentes a quitárselo del hueso para c','Brewer-Clifton Hapgood Pinot Noir 2020',12199.99,100,'Wines'),
(44,'','Diatom está motivado por la búsqueda de sustracción y refinamiento. Es el pulido de un grano de arroz hasta que uno haya alcanzado su núcleo interno definitivo. Nos esforzamos por reconocer el lugar con la menor perturbación, distracción o interferencia posible. Los vinos resultantes tienen un sentido de transparencia y una pureza de intención y propósito.','Diatom Santa Barbara County Chardonnay 2021',4399.99,100,'Wines'),
(45,'','Procedente de una porción de Spear Vineyard con una empinada pendiente orientada al norte con vistas a la autopista 246 y situada en el corazón de la Sta. Denominación de Rita Hills. Esta parcela es predominantemente suelo franco arcilloso y se encuentra dentro de uno de los viñedos orgánicos más nuevos y buscados de la zona. El clon 4 es conocido por ser agudo y preciso, lo que parecía una gran opción para explorar y exhibir Spear. Artesanía: La fermentación a muy baja temperatura en pequeños tanques de acero inoxidable, junto con el tránsito de manguera maloláctico y corto inhibido, garantiza la precisión y el enfoque.','Diatom Spear Chardonnay 2017',7399.99,100,'Wines'),
(46,'','Color dorado intenso con reflejos verdosos, brillante, limpio y puro. Aroma típico a la variedad que recuerda a frutas tropicales, donde resalta la vainilla y el tostado de la madera.','Los Haroldos Reserva Chardonnay',7329.99,100,'Wines'),
(47,'','Posee un color rojo intenso, brillante, con tintes oscuros, buena tipicidad varietal. Aromas muy futados, con aporte de madera, nota a frutas rojasm como ciruelasm guindas, un vino muy equilibrado. En la boca es redondo, persistente y sobre todo elegante. Sin duda un gran vino.','Viamonte Oak Selection Malbec 2018',1999.99,100,'Wines'),
(48,'','Brillante y cristalino. Pálido, joven. Sorpendente nariz de alta intensidad aromáticoa y muy limpia. Notas florales: lilas,violetas, jazmín. Dulce en nariz. Fantástico. En boca tiene una entrada suave. Fresco y equilibrado.','Viamonte Selection Sauvignon Blanc 2019',1999.99,100,'Wines'),
(49,'','Tonos rojos cobrizos. En nariz, frutos rojos maduros, pimienta negra y pimientos, con notas de café y chocolate aportados por el roble. Taninos redondos, elegantes y maduros que lo equilibran en boca, muy característicos de nuestro viñedo y pocos típicos de esta variedad. Vino suave, amable, fácil de beber.','Viamonte Suelos Reserva Cabernet Sauvignon 2017',2399.99,100,'Wines'),
(50,'','Color violáceo profundo, límpido y brillante. Aroma complejo. Aparecen notas florales a violetas junto con matices frutales como la cereza negra, típicas de la variedad. Gran estrutura, redondo y largo final.','Viamonte Suelos Reserva Malbec 2017',2399.99,100,'Wines'),
(51,'','Certificado sostenible y elaborado con intención, cultivamos específicamente una parte de nuestra finca Pinot Noir para este rosè animado y de un solo viñedo. Bellamente afilado y siempre refrescante, este vino exuberante está lleno de fresa fresca, sandía y cítricos con un final crujiente que conduce al inevitable anhelo de otro vaso. O seamos serios, otra botella.','2021 Julia Vineyard Rosé Of Pinot Noir',4099.99,100,'Wines');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
