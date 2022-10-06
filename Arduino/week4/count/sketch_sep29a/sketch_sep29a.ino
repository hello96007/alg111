//按一下跳一個數字
void setup() {
  // put your setup code here, to run once:
 pinMode(2,INPUT);
 Serial.begin(9600);
}
int count;
int sig;
void loop() {
  // put your main code here, to run repeatedly:
int value = digitalRead(2);
//Serial.println(value);
if(value==HIGH)
{
value=0;
count++;
}

Serial.println(count);
delay(100);
}
