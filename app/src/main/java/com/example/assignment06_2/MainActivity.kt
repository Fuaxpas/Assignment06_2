package com.example.assignment06_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

var ani = "ani"
var image = "image"
var dec = "dec"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"อันดับ 10 Heikemonogatari")
            intent.putExtra(image,R.drawable.a10)
            intent.putExtra(dec,"《เสียงระฆังวัดเชตวันมหาวิหาร สะท้อนความอนิจจังแว่วมา สีดอกต้นสาละบ่งบอก อำนาจไม่จีรังคือความจริง》 สมัยเฮอัน ไม่ทราบช่วงเวลา " +
                    "ตระกูลไทระหมายเป็นใหญ่ในทุกด้าน ไม่ว่าจะเป็นอำนาจ กำลังรบ ทรัพย์สมบัติ ไทระ ชิเงโมริ ชายผู้มองเห็นคนตายได้พบกับบิวะ เด็กหญิงลูกพระบรรเลงพิณผู้มองเห็นอนาคตและได้รับคำทำนายว่า " +
                    "\"พวกเจ้ากำลังจะล่มสลายในอีกไม่ช้า\" จากสังคมขุนนางสู่สังคมนักรบ -- เปิดม่าน 15 ปีแห่งการเปลี่ยนผ่านครั้งยิ่งใหญ่ในประวัติศาสตร์ของญี่ปุ่น")
            startActivity(intent)
        }
        imageView2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"อันดับ 9 World’s End Harem")
            intent.putExtra(image,R.drawable.a9)
            intent.putExtra(dec,"ในปี 2040 ถึงเทคโนโลยีที่ล้ำหน้า แต่ก็เกิดปัญหาเมื่อมีไวรัสปริศนา MK (Male Killer) ที่ทำให้ผู้ชายตายจนเกือบหมดโลก ผ่านไป 5 ปี เรย์โตะ และผู้ชายอีก 4 คน " +
                    "ที่เคยหลับไปจากโคลด์สลีปก่อนเหตุการณ์นั้น ได้ลืมตาตื่นขึ้นมาจากการแช่แข็ง มีภูมิต้านทานไวรัสปริศนานี้ กลายเป็นความหวังสุดท้ายของมนุษยชาติที่จะสืบเผ่าพันธุ์ต่อไปได้")
            startActivity(intent)
        }
        imageView4.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"อันดับ 8 Arifureta Shokugyo de Sekai Saikyo 2nd Season")
            intent.putExtra(image,R.drawable.a8)
            intent.putExtra(dec,"ฮาจิเมะ วัยรุ่นหนุ่มเกมโอตาคุ ได้ถูกเทพจากต่างโลกอัญเชิญมาพร้อมกับเพื่อนร่วมชั้นหลายคน จำเป็นอาศัยในโลกนี้และช่วยกอบกู้โลก ฮาจิเมะ " +
                    "เริ่มด้วยอาชีพนักสร้างอาวุธที่ไม่มีประโยชน์ในการต่อสู้แล้วยังถูกเหยียดหยามจากเพื่อนร่วมชั้น ที่ส่วนใหญ่ที่อยู่ในระดับนักรบและผู้กล้า แต่ภายหลังโศกนาฏกรรมครั้งใหญ่ที่เกิดกับเพื่อนร่วมชั้น " +
                    "ฮาจิเมะที่พยายามเอาชีวิตรอด กลายเป็นจุดเปลี่ยนชีวิตของเขา จนกลายเป็นนักสร้างอาวุธที่มีความสามารถสุดแกร่งไป")
            startActivity(intent)
        }
        imageView5.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"อันดับ 7 Saiyuki RELOAD -ZEROIN-")
            intent.putExtra(image,R.drawable.a7)
            intent.putExtra(dec,"ผ่านไปสองปีหลังจากเริ่มเดินทาง กลุ่มของซันโซ (ถังซัมจั๋ง) ได้ฝ่าฟันอุปสรรคมายาวนาน จนเดินทางมาถึงชมพูทวีป " +
                    "อย่างไรก็ตาม การต่อสู้ยิ่งทวีความรุนแรงมากขึ้นกว่าที่ผ่านมา แล้วต้องมาพบกับโศกนาฏกรรมเมื่อครั้งอดีตร่วม 500 ปีก่อน จุดหมายปลายทางของพวกเขาจะจบลงอย่างไร ?")
            startActivity(intent)
        }
        imageView6.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"อันดับ 6 Karakai Jozu no Takagi-san 3")
            intent.putExtra(image,R.drawable.a6)
            intent.putExtra(dec,"เริ่มต้นจะกล่าวถึงนิชิคาตะ (Nishikata) เด็กหนุ่มนักเรียนชาย หน้าตาธรรมดา เรียนหนังสือพอใช้ได้ และเป็นคนมีความมุ่งมั่นมากๆ " +
                    "เขามักจะถูกเด็กสาวโต้ะข้างๆ ทาคากิ (Takaki) สาวน้อยหน้าผากกว้าง ผู้เต็มไปด้วยรอยยิ้มและความฉลาดอย่างน่าตกใจ เธอมีงานอดิเรกคือแกล้งนิชิคาตะเป็นชีวิตประจำวัน " +
                    "นิชิคาตะได้แต่หวังอยู่เสมอ ว่าสักวันจะสามารถแกล้งทาคากิคืนได้สักครั้ง..... เรื่องราวความน่ารักของพวกเขาจึงได้เริ่มต้นขึ้น!!....")
            startActivity(intent)
        }
        imageView7.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"อันดับ 5 JoJo’s Bizarre Adventure Stone Ocean")
            intent.putExtra(image,R.drawable.a5)
            intent.putExtra(dec,"เรื่องราวในปี ค.ศ. 2011 คูโจ โจลีนถูกตัดสินโทษให้จำคุก 15 ปีหลังเข้าไปพัวพันในอุบัติเหตุรถยนต์และถูกปรักปรำว่าเป็นฆาตกร " +
                    "โจลีนถูกคุมขังในเรือนจำกรีนดอลฟินสตรีทในรัฐฟลอริดาซึ่งมีชื่อเล่นว่า \"พิพิธภัณฑ์สัตว์น้ำ\" คูโจ โจทาโร่พ่อของโจลีนได้มอบจี้ห้อยคอแก่โจลีนซึ่งมีความสามารถลึกลับในการปลุกพลังแฝงภายในของโจลีน")
            startActivity(intent)
        }
        imageView8.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"อันดับ 4 Hakozume")
            intent.putExtra(image,R.drawable.a4)
            intent.putExtra(dec,"ฮาโกะซึเมะ สู้ตายตำรวจสาวป้อมยาม คาวาอิ ไม ตำรวจหญิงที่เริ่มคิดว่าตนไม่เหมาะกับหน้าที่ มักมีปัญหากับตำรวจชาย และต้องการลาออก " +
                    "จนได้มาทำงานร่วมกับ ฟูจิ เซย์โกะ ตำรวจหญิงที่มีความมุ่งมั่นและเป็นแบบอย่างให้เธอ")
            startActivity(intent)
        }
        imageView9.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"อันดับ 3 Attack on Titan The Final Season Part 2")
            intent.putExtra(image,R.drawable.a3)
            intent.putExtra(dec,"เรื่องราวหลังจากที่ เอเลน เยเกอร์ ได้รับรู้ความจริงเกี่ยวกับพ่อของตัวเองอย่าง กรีชา เยเกอร์ รวมถึงเรื่องราวของราชวงศ์ที่ถือครองพลังไททัน " +
                    "ซึ่งนำมาสู่การต่อสู้ครั้งใหม่เพื่ออิสระภาพของเอเลนและพวกพ้อง เพียงแต่ครั้งนี้จะไม่ใช่การเผชิญหน้ากับเหล่าไททัน แต่เป็นกลุ่มมนุษย์ที่อยู่อีกฟากฝั่งของท้องทะเล")
            startActivity(intent)
        }
        imageView10.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"อันดับ 2 How a Realist Hero Rebuilt the Kingdom Part 2")
            intent.putExtra(image,R.drawable.a2)
            intent.putExtra(dec,"เรื่องราวของ โซมะ คาสึยะ ชายหนุ่มผู้ถูกอัญเชิญไปยังต่างโลกเพื่อเตรียมพบกับการผจญภัยครั้งใหม่… ที่ดูเหมือนจะไม่มีทางเกิดขึ้น… " +
                    "เพราะว่าหลังจากที่ คาสึยะ ได้ทำการเสนอแผนพัฒนาเศรษฐกิจและการทหารของประเทศให้กับกษัตริย์ของประเทศ แต่เขากลับถูกมอบตำแหน่งกษัตริย์มาให้แทนซะอย่างนั้น!? " +
                    "แล้วจู่ๆ ก็กลายมาเป็นคู่หมั้นของลูกสาวอดีตกษัตริย์ซะอีก!? และเพื่อที่จะฟื้นฟูประเทศกลับมาให้ได้ คาสึยะ จึงได้ออกตามหาบุคคลผู้มีความสามารถและอัจฉริยภาพมารวมตัวกัน " +
                    "แล้วพวกเขาเหล่านั้นจะมีพลังและความสามารถอะไรกันบ้างและ คาสึยะ จะทำอย่างไรต่อไป เรื่องราวการบริหารประเทศในต่างโลกก็ได้เริ่มต้นขึ้นแล้ว!")
            startActivity(intent)
        }
        imageView11.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"อันดับ 1 Mahouka Koukou no Rettousei Tsuioku-hen")
            intent.putExtra(image,R.drawable.a1)
            intent.putExtra(dec,"เมื่อมองดูมิยูกิและทัตสึยะในตอนนี้ อาจเป็นเรื่องยากที่จะจินตนาการว่าพวกเขาเป็นอย่างอื่นนอกจากพี่น้องที่รัก แต่มันไม่ใช่แบบนี้เสมอไป..\n" +
                    "เมื่อสามปีที่แล้ว มิยูกิรู้สึกไม่สบายใจเมื่ออยู่ใกล้ๆ พี่ชายของเธอ ครอบครัวที่เหลือปฏิบัติต่อเขาไม่ดีไปกว่าคนรับใช้ที่ต่ำต้อย แม้ว่าเขาจะเป็นผู้พิทักษ์ที่สมบูรณ์แบบ " +
                    "คอยดูแลมิยูกิในขณะที่เธอใช้ชีวิตในโรงเรียนมัธยมศึกษาตอนต้นตามปกติ แต่สิ่งที่กวนใจเธอจริงๆ ก็คือเขาไม่เคยแสดงอารมณ์หรือความคิดของตัวเองออกมาเลย" +
                    "อย่างไรก็ตาม เมื่ออันตรายมาเยือนระหว่างเดินทางไปโอกินาว่า ความสัมพันธ์ระหว่างพี่ชายและน้องสาวจะเปลี่ยนไปตลอดกาล…")
            startActivity(intent)
        }
    }
}